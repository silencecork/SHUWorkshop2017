package com.demo.listviewfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

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
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        DisplayWord word = (DisplayWord) getItem(position);

        viewHolder.title.setText(word.title);
        viewHolder.subTitle.setText(word.subTitle);
        viewHolder.icon.setImageResource(word.iconRedId);

        return convertView;
    }

    class ViewHolder {

        @BindView(R.id.title)
        TextView title;

        @BindView(R.id.sub_title)
        TextView subTitle;

        @BindView(R.id.icon)
        ImageView icon;

        public ViewHolder(View convertView) { // 改使用Butterknife來取代findViewById的工作
            ButterKnife.bind(this, convertView);
        }

    }

}