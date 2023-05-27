package com.example.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.news.models.News_Headlines;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<customViewHolder> {
    private Context context;
    private List<News_Headlines> headlines;

    public CustomAdapter(Context context, List<News_Headlines> headlines) {
        this.context = context;
        this.headlines = headlines;
    }

    @NonNull
    @Override
    public customViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new customViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull customViewHolder holder, int position) {
               holder.text_title.setText(headlines.get(position).getTitle());
               holder.text_source.setText(headlines.get(position).getSource().getName());
              if(headlines.get(position).getUrlToImage()!=null){
                  Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.img_headline);
              }
    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
