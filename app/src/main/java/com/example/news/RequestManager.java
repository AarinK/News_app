package com.example.news;

import android.content.Context;

import com.example.news.models.NewsAPIResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RequestManager {
    Context context;
    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        public void getNewsHeadlines(OnFetchDataListener listener,String category,String query){
            CallNewsAPI callNewsAPI=retrofit.create(CallNewsAPI.class);
            Call<NewsAPIResponse> call= callNewsAPI.callHeadlines("in",category,context.getString(R.string.api_key),query);
        }

    public RequestManager(Context context) {
        this.context = context;
    }

    public interface CallNewsAPI{
        @GET("top-headlines")
        Call<NewsAPIResponse> callHeadlines(
                  @Query("country") String country,
                  @Query("category") String category,
                  @Query("apiKey") String api_key,
                  @Query("q") String query
        );
    }
}
