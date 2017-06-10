package com.demo.apilistdemo;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by Justin on 2017/5/29.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化Network函式庫
        AndroidNetworking.initialize(getApplicationContext());
    }
}
