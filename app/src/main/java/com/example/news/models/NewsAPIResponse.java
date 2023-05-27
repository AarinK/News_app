package com.example.news.models;

import java.util.List;

public class NewsAPIResponse {
    String status;
    int totalResults;
    List<News_Headlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<News_Headlines> getArticles() {
        return articles;
    }

    public void setArticles(List<News_Headlines> articles) {
        this.articles = articles;
    }
}
