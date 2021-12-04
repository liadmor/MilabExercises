package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LondonActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] s1;
    int images[] = {R.drawable.buckinghampalace,R.drawable.londoneye,R.drawable.hydepark,R.drawable.londontowerbridge,R.drawable.naturalhistorygallery,R.drawable.wembleystadion};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_london);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.londonActivity);

        LondonAdapter londonAdapter = new LondonAdapter(this, s1, images);
        recyclerView.setAdapter(londonAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}