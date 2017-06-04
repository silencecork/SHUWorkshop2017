package com.demo.jsonobjbasic;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    TextView mTextView;

    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        network();
    }

    private void network() {
        mProgressDialog = ProgressDialog.show(this, "", "Please wait");

        HttpURLConnection conn = null;
        String result = "";
        try {
            URL url = new URL(API.API_URL);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int status = conn.getResponseCode();
            if (status == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                }
                br.close();
                result = sb.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }

        try {
            JSONObject response = new JSONObject(result);
            int userId = response.optInt("user_id");
            int id = response.optInt("id");
            String title = response.optString("title");
            String body = response.optString("body");

            mTextView.setText("userid: " + userId + ", id: " + id + ", title: " + title + ", body: " + body);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        mProgressDialog.dismiss();
    }
}
