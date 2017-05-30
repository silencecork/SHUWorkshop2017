package com.demo.practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Justin on 2017/5/30.
 */

public class TechAdapter extends BaseAdapter {

    ArrayList<TechInfo> mData = new ArrayList<>();

    public TechAdapter(ArrayList<TechInfo> data) {
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        TechInfo info = (TechInfo) getItem(position);
        holder.name.setText(info.name);
        holder.icon.setImageResource(info.icon);

        if (info.name.equals("Android") || info.name.equals("iOS") || info.name.equals("Symbian") || info.name.equals("WebOS")) {
            holder.check.setVisibility(View.VISIBLE);
        } else {
            holder.check.setVisibility(View.GONE);
        }

        return convertView;
    }


    class ViewHolder {
        @BindView(R.id.name)
        TextView name;

        @BindView(R.id.icon)
        ImageView icon;

        @BindView(R.id.check)
        ImageView check;

        public ViewHolder(View convertView) {
            ButterKnife.bind(this, convertView);
        }
    }
}
