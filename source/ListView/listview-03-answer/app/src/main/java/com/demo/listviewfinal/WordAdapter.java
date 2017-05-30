package com.demo.listviewfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WordAdapter extends BaseAdapter {

    private String[] mWords;
    private String[] mSubWords;
    private int[] mIcons;

    public WordAdapter(String[] words, String[] subwords, int[] icons) {
        mWords = words;
        mSubWords = subwords;
        mIcons = icons;
    }

    @Override
    public int getCount() {
        return mWords.length;
    }

    @Override
    public Object getItem(int position) {
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

        // 找到ImageView
        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        // 依照位置算出對應的圖片
        int resId = mIcons[position % mIcons.length];
        // 將圖片設定給ImageView
        icon.setImageResource(resId);

        // 一定要將convertView回傳，供ListView呈現使用，並加入重用機制中
        return convertView;
    }

}