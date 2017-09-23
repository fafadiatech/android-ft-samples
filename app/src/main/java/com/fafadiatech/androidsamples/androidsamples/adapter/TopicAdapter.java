package com.fafadiatech.androidsamples.androidsamples.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fafadiatech.androidsamples.androidsamples.R;

import java.util.List;

/**
 * Created by FT on 9/22/2017.
 */

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicItem>{

    List<String> topicList;

    class TopicItem extends RecyclerView.ViewHolder{
        TextView tvTopic;
        public TopicItem(View view){
            super(view);
            tvTopic = (TextView) view.findViewById(R.id.tvtopic);

        }
    }

    //Constructor
    public TopicAdapter(List<String> topicList){
        this.topicList = topicList;
    }

    //Inflate your layout
    @Override
    public TopicItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false);

        return new TopicItem(itemView);
    }

    //set data to your layout
    @Override
    public void onBindViewHolder(TopicItem holder, int position) {
        String strTopic = topicList.get(position);
        holder.tvTopic.setText(strTopic);
    }

    //no of rows in recycler view
    @Override
    public int getItemCount() {
        return topicList.size();
    }
}
