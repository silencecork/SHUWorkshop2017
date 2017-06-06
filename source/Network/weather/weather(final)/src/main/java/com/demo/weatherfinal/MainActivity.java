package com.demo.weatherfinal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 專案天氣的圖片都來自於https://www.iconfinder.com/HxK
 *
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.weather_icon)
    ImageView mImageView;

    @BindView(R.id.location)
    TextView mLocation;

    @BindView(R.id.temp)
    TextView mTempature;

    @BindView(R.id.condition)
    TextView mCondition;

    @BindView(R.id.update_time)
    TextView mUpdateTime;

    @BindView(R.id.change_to_web)
    Button mChangeToWeb;

    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 初始化連線library
        AndroidNetworking.initialize(this);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // 處理網路連線
        network();
    }

    private void network() {
        mProgressDialog = ProgressDialog.show(this, "", "Please wait");
        AndroidNetworking.get(Constant.WEATHER_API)
                // woeid = 2306179是taipei，可以到http://woeid.rosselliot.co.nz/找城市的woeid
                .addQueryParameter("q", "select * from weather.forecast where woeid = 2306179 and u='c'")
                .addQueryParameter("format", "json")
                .addQueryParameter("env", "store://datatables.org/alltableswithkeys")
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) { // API回傳值
                        // 使用Gson剖析物件
                        Gson gson = new Gson();
                        Weather weather = gson.fromJson(response.toString(), Weather.class);

                        mLocation.setText(weather.getQuery().getResults().getChannel().getLocation().getCity());
                        mTempature.setText(weather.getQuery().getResults().getChannel().getItem().getCondition().getTemp() + "°C");
                        mCondition.setText(weather.getQuery().getResults().getChannel().getItem().getCondition().getText());
                        mUpdateTime.setText(weather.getQuery().getResults().getChannel().getItem().getPubDate());

                        // 依照天氣狀態選擇要顯示的圖形
                        // 所有天氣狀態可以到https://developer.yahoo.com/weather/documentation.html查詢
                        String condition = weather.getQuery().getResults().getChannel().getItem().getCondition().getText().toLowerCase();
                        if (condition.contains("cloudy")) {
                            mImageView.setImageResource(R.drawable.cloudy);
                        } else if (condition.contains("sunny")) {
                            mImageView.setImageResource(R.drawable.sun);
                        } else if (condition.contains("storm")) {
                            mImageView.setImageResource(R.drawable.storm);
                        } else if (condition.contains("snow")) {
                            mImageView.setImageResource(R.drawable.snow);
                        } else if (condition.contains("shower") || condition.contains("rain")) {
                            mImageView.setImageResource(R.drawable.rain);
                        }

                        // 處理連結，因為原本的連結中有前置的贅字需要清除掉
                        String url = weather.getQuery().getResults().getChannel().getItem().getLink();
                        int filterIdx = url.lastIndexOf("https://");
                        if (filterIdx > 0) {
                            url = url.substring(filterIdx);
                        }
                        final String openWebUrl = url;

                        // API呼叫處理完才加上Button的OnClickListener
                        mChangeToWeb.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW);
                                intent.setData(Uri.parse(openWebUrl));
                                startActivity(intent);
                            }
                        });

                        // 關閉ProgressDialog
                        mProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(ANError anError) {
                        mProgressDialog.dismiss();
                    }
                });

    }


}
