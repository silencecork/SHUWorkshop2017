package com.demo.jsonobjbasic;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    TextView mTextView;

    private ProgressDialog mProgressDialog;

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
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        BasicObject obj = new BasicObject();
                        obj.userId = response.optInt("user_id");
                        obj.id = response.optInt("id");
                        obj.title = response.optString("title");
                        obj.body = response.optString("body");


                        mTextView.setText(obj.toString());

                        mProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(ANError anError) {
                        mProgressDialog.dismiss();
                    }
                });
    }
}
