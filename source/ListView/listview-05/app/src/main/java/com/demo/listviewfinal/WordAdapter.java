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
        ViewHolder viewHolder;
        if (convertView == null) {
            // 沒有convertView，表示建立全新的單列View
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
            // 建立ViewHolder，findView的事情都交給ViewHolder處理
            viewHolder = new ViewHolder(convertView);
            // 將ViewHolder設定給convertView，之後重複使用時ViewHolder不用再重建
            convertView.setTag(viewHolder);
        } else {
            // convertView有值，表示是重複使用，可以從convertView中取出ViewHolder來使用
            viewHolder = (ViewHolder) convertView.getTag();
        }

        DisplayWord word = (DisplayWord) getItem(position);
        viewHolder.title.setText(word.title);
        viewHolder.subTitle.setText(word.subTitle);
        viewHolder.icon.setImageResource(word.iconRedId);

        return convertView;
    }

    // 以ViewHolder統一處理畫面呈現
    class ViewHolder {
        TextView title;
        TextView subTitle;
        ImageView icon;

        public ViewHolder(View convertView) {
            // 建立ViewHolder時，ViewHolder負責findViewById
            title = (TextView) convertView.findViewById(R.id.title);
            subTitle = (TextView) convertView.findViewById(R.id.sub_title);
            icon = (ImageView) convertView.findViewById(R.id.icon);
        }

    }

}