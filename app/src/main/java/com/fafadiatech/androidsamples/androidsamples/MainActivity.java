package com.fafadiatech.androidsamples.androidsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fafadiatech.androidsamples.androidsamples.adapter.TopicAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTopic;
    RecyclerView.LayoutManager mLayoutManager;
    TopicAdapter topicadapter;
    List<String> topicList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTopic = (RecyclerView) findViewById(R.id.rv_topic);
        mLayoutManager = new LinearLayoutManager(this);
        topicList = Arrays.asList(getResources().getStringArray(R.array.arr_topics));
        topicadapter = new TopicAdapter(topicList);
        rvTopic.setLayoutManager(mLayoutManager);
        rvTopic.setAdapter(topicadapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
