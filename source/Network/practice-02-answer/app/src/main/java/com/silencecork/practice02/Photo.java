package com.silencecork.practice02;

/**
 * Created by Justin on 2017/6/3.
 */

public class Photo {
    int albumId;
    int id;
    String title;
    String url;
    String thumbnailUrl;

    public String toString() {
        return "albumId: " + albumId + ", id: " + id + ", title: " + title + ", url: " + url + ", thumbnailUrl: " + thumbnailUrl;
    }
}
