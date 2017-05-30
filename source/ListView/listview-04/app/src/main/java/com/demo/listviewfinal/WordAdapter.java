package com.demo.listviewfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends BaseAdapter {

    private ArrayList<DisplayWord> mDatas;

    // 設定物件
    public WordAdapter(ArrayList<DisplayWord> data) {
        mDatas = data;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        }
        // 取得該列要呈現的物件
        DisplayWord word = (DisplayWord) getItem(position);

        // 找出TexView
        TextView title = (TextView) convertView.findViewById(R.id.title);

        // 將物件對應的值呈現出來
        title.setText(word.title);

        TextView subTitle = (TextView) convertView.findViewById(R.id.sub_title);
        subTitle.setText(word.subTitle);

        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        icon.setImageResource(word.iconRedId);

        return convertView;
    }

}