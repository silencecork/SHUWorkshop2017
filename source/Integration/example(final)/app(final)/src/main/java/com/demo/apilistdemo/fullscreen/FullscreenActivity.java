package com.demo.apilistdemo.fullscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.demo.apilistdemo.R;
import com.github.chrisbanes.photoview.PhotoView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    @BindView(R.id.photo_view)
    PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        // 讓上方的ActionBar消失
        getSupportActionBar().hide();

        // 取得傳遞過來的圖片網址
        String url = getIntent().getStringExtra("photo_url");

        // 使用Glide來讀取圖片
        Glide.with(this).load(url).into(mPhotoView);
    }

}
