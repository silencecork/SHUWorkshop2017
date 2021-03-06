package com.demo.listviewfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WordAdapter extends BaseAdapter {

    private String[] mWords;
    private String[] mSubWords;

    public WordAdapter(String[] words, String[] subwords) {
        mWords = words;
        mSubWords = subwords;
    }

    @Override
    public int getCount() { // 告訴ListView總共有幾筆資料要呈現
        return mWords.length;
    }

    @Override
    public Object getItem(int position) { // 取得特定位置的對應內容
        return mWords[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 檢查convertView是否有值，有值表示是重複使用的
        if (convertView == null) {
            // 沒有值就要自己建立一個
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        }

        // 找到TextView
        TextView title = (TextView) convertView.findViewById(R.id.title);

        // 取出文字
        String text = (String) getItem(position);

        // 將文字內容設定給TextView
        title.setText(text);

        TextView subTitle = (TextView) convertView.findViewById(R.id.sub_title);
        String subText = mSubWords[position];
        subTitle.setText(subText);

        // 一定要將convertView回傳，供ListView呈現使用，並加入重用機制中
        return convertView;
    }

}