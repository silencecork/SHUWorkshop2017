package com.demo.apilistdemo.photo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.demo.apilistdemo.Constant;
import com.demo.apilistdemo.R;
import com.demo.apilistdemo.fullscreen.FullscreenActivity;
import com.google.gson.Gson;

import org.json.JSONArray;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotoListActivity extends AppCompatActivity {

    @BindView(R.id.listview)
    ListView mListView;

    PhotoListAdapter mAdapter;
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_list);
        ButterKnife.bind(this);

        mAdapter = new PhotoListAdapter();
        mListView.setAdapter(mAdapter);

        // 處理ListView點擊事件
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Photo photo = mAdapter.getItem(position);

                // 取得普通圖片的網址
                String photoUrl = photo.getUrls().getRegular();

                // 切換至FullscreenActivity
                Intent intent = new Intent(PhotoListActivity.this, FullscreenActivity.class);
                intent.putExtra("photo_url", photoUrl);
                startActivity(intent);
            }
        });

        // 取出由上一頁傳來的collection name
        String collectionName = getIntent().getStringExtra("collection_name");

        // 將collection name呈現在action bar上
        getSupportActionBar().setTitle(collectionName);

        // 要action bar在左方顯示出回上一頁的箭頭
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // 從傳來的資料中取出collection id
        int collectionId = getIntent().getIntExtra("collection_id", 0);

        // 使用collection id呼叫API
        network(collectionId);
    }

    private void network(int collectionId) {
        mProgressDialog = ProgressDialog.show(this, "", "Please wait");
        AndroidNetworking.get(Constant.URL_PHOTO)
                .addPathParameter("collection_id", String.valueOf(collectionId))
                .addQueryParameter("page", "1")
                .addQueryParameter("per_page", String.valueOf(Constant.RESULT_PER_PAGE))
                .addHeaders("Authorization", "Client-ID " + Constant.CLIENT_ID)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) { // API回傳的結果
                        // 使用gson進行處理
                        Gson gson = new Gson();

                        // 將結果轉換成Photo這個class
                        Photo[] photos = gson.fromJson(response.toString(), Photo[].class);

                        // 結果設定至Adapter
                        mAdapter.addData(photos);

                        // 呼叫notifyDataSetChanged()更新ListView資料
                        mAdapter.notifyDataSetChanged();

                        // 記得關閉ProgressDialog
                        mProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(ANError anError) {
                        mProgressDialog.dismiss();
                    }
                });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 指定action bar上的back箭頭點下後的行為
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
