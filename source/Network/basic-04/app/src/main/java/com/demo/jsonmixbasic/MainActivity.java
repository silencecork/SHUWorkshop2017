package com.demo.jsonmixbasic;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

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
                        Gson gson = new Gson();
                        User[] users = gson.fromJson(response.toString(), User[].class);
                        String str = "";
                        for (User user : users) {
                            str += "name: " + user.getName() + ", phone: " + user.getPhone() + ", email: " + user.getEmail();
                            str += "\n\n\n";
                        }
                        mTextView.setText(str);

                        mProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(ANError anError) {
                        mProgressDialog.dismiss();
                    }
                });
    }
}
