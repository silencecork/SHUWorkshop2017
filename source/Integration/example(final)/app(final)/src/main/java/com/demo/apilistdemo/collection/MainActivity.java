package com.demo.apilistdemo.collection;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.demo.apilistdemo.Constant;
import com.demo.apilistdemo.photo.PhotoListActivity;
import com.demo.apilistdemo.R;
import com.google.gson.Gson;

import org.json.JSONArray;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listview)
    ListView mListView;

    ProgressDialog mProgressDialog;

    CollectionListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // 建立Adapter
        mAdapter = new CollectionListAdapter();

        // 將Adapter設定給ListView
        mListView.setAdapter(mAdapter);

        // 處理ListView點擊事件
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Collection collection = mAdapter.getItem(position);

                // 取得collection的id
                int collectionId = collection.getId();

                // 切換至PhotoListActivity
                Intent intent = new Intent(MainActivity.this, PhotoListActivity.class);
                intent.putExtra("collection_id", collectionId);
                startActivity(intent);
            }
        });

        // 存取網路
        network();
    }

    // 處理網路連線
    private void network() {
        mProgressDialog = ProgressDialog.show(this, "", "Please wait");
        AndroidNetworking.get(Constant.URL_COLLECTION)
                .addQueryParameter("page", "1")
                .addQueryParameter("per_page", String.valueOf(Constant.RESULT_PER_PAGE))
                .addHeaders("Authorization", "Client-ID " + Constant.CLIENT_ID)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) { // 呼叫API的結果
                        // 使用gson剖析
                        Gson gson = new Gson();

                        // 將結果轉換成Collection這個class
                        Collection[] featureList = gson.fromJson(response.toString(), Collection[].class);

                        // 結果設定至Adapter
                        mAdapter.addData(featureList);

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
}
