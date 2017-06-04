package com.demo.jsonarybasic;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    TextView mTextView;

    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidNetworking.initialize(this);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        network();
    }

    private void network() {
        mProgressDialog = ProgressDialog.show(this, "", "Please wait");
        AndroidNetworking.get(API.API_URL)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        int length = response.length();
                        ArrayList<BasicObject> list = new ArrayList<BasicObject>();
                        for (int i = 0; i < length; i++) {
                            JSONObject jsonObject = response.optJSONObject(i);
                            BasicObject object = new BasicObject();
                            object.userId = jsonObject.optInt("userId");
                            object.id = jsonObject.optInt("id");
                            object.title = jsonObject.optString("title");
                            object.body = jsonObject.optString("body");
                            list.add(object);
                        }

                        StringBuilder builder = new StringBuilder();
                        for (BasicObject obj : list) {
                            builder.append(obj.toString());
                            builder.append("\n\n\n");
                        }

                        mTextView.setText(builder.toString());

                        mProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(ANError anError) {
                        mProgressDialog.dismiss();
                    }
                });
    }

}
