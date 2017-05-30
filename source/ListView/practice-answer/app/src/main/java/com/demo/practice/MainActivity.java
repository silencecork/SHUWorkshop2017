package com.demo.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listview)
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ArrayList<TechInfo> data = new ArrayList<>();
        for (String name : Content.CONTENTS) {
            TechInfo info = new TechInfo();
            info.name = name;

            if (name.equals("Android")) {
                info.icon = R.drawable.android;
            } else if (name.equals("Chrome")) {
                info.icon = R.drawable.chrome;
            } else if (name.equals("Debian")) {
                info.icon = R.drawable.debian;
            } else if (name.equals("Firefox")) {
                info.icon = R.drawable.firefox;
            } else if (name.equals("iOS")) {
                info.icon = R.drawable.ios;
            } else if (name.equals("Java")) {
                info.icon = R.drawable.java;
            } else if (name.equals("NetBSD")) {
                info.icon = R.drawable.netbsd;
            } else if (name.equals("OpenSuse")) {
                info.icon = R.drawable.opensuse;
            } else if (name.equals("OSX")) {
                info.icon = R.drawable.osx;
            } else if (name.equals("Qt")) {
                info.icon = R.drawable.qt;
            } else if (name.equals("Raspberry")) {
                info.icon = R.drawable.raspberry;
            } else if (name.equals("Solaris")) {
                info.icon = R.drawable.solaris;
            } else if (name.equals("Symbian")) {
                info.icon = R.drawable.symbian;
            } else if (name.equals("Tux")) {
                info.icon = R.drawable.tux;
            } else if (name.equals("Ubuntu")) {
                info.icon = R.drawable.ubuntu;
            } else if (name.equals("WebOS")) {
                info.icon = R.drawable.webos;
            } else if (name.equals("Windows")) {
                info.icon = R.drawable.windows;
            }

            data.add(info);
        }

        TechAdapter adapter = new TechAdapter(data);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TechInfo info = (TechInfo) parent.getAdapter().getItem(position);
                Toast.makeText(view.getContext(), info.name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
