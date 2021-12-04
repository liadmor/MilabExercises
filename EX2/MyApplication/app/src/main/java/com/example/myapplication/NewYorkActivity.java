package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class NewYorkActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] s1;
    int images[] = {R.drawable.levainbakery,R.drawable.brooklynbridge,R.drawable.timessquare,R.drawable.centralpark,R.drawable.empirestatebuilding,R.drawable.statueofliberty};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_york);
        recyclerView = findViewById(R.id.recyclerViewNewYork);

        s1 = getResources().getStringArray(R.array.londonActivity);

        NewYorkAdapter newyorkAdapter = new NewYorkAdapter(this, s1, images);
        recyclerView.setAdapter(newyorkAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}