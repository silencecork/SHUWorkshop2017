package com.demo.apilistdemo.photo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.demo.apilistdemo.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Justin on 2017/5/29.
 */
public class PhotoListAdapter extends BaseAdapter {

    private ArrayList<Photo> mData = new ArrayList<>();

    // 加入Adapter的資料
    public void addData(Photo[] list) {
        for (Photo data : list) {
            mData.add(data);
        }
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Photo getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PhotoViewHolder viewHolder;
        // 檢查是否有convertView? (ListView是重複使用View的，所以convertView有的話就表示重複使用)
        if (convertView == null) {
            // 沒有就得自己建立一個
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_item, null);
            viewHolder = new PhotoViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (PhotoViewHolder) convertView.getTag();
        }

        // 取得這個位置的資料
        Photo data = getItem(position);

        viewHolder.title.setText(data.getUser().getName());
        viewHolder.subTitle.setText(data.getUser().getBio());

        Glide.with(parent.getContext()).load(data.getUrls().getSmall()).centerCrop().into(viewHolder.image);

        // 記得return回Android Framework，這樣才能達到重複使用的效果
        return convertView;
    }

    public static class PhotoViewHolder {
        @BindView(R.id.icon)
        ImageView image;

        @BindView(R.id.title)
        TextView title;

        @BindView(R.id.sub_title)
        TextView subTitle;

        public PhotoViewHolder(View convertView) {
            ButterKnife.bind(this, convertView);
        }
    }
}
