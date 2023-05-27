package com.example.news;

import com.example.news.models.News_Headlines;

import java.util.List;

public interface OnFetchDataListener {
    void onFetchData(List<News_Headlines> list,String message);
    void onError(String message);

}
