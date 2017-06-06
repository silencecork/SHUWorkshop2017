package com.silencecork.practice02;

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

                        ArrayList<Photo> list = new ArrayList<Photo>();

                        for (int i = 0; i < length; i++) {
                            JSONObject item = response.optJSONObject(i);
                            Photo photo = new Photo();
                            photo.albumId = item.optInt("album_id");
                            photo.id = item.optInt("id");
                            photo.title = item.optString("title");
                            photo.url = item.optString("url");
                            photo.thumbnailUrl = item.optString("thumbnailUrl");
                            list.add(photo);
                        }

                        String content = "";
                        for (Photo photo : list) {
                            content += photo.toString();
                            content += "\n\n\n";
                        }
                        mTextView.setText(content);
                        mProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(ANError anError) {
                        mProgressDialog.dismiss();
                    }
                });
    }
}
