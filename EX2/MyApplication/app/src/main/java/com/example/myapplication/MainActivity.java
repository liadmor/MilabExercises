package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button buttonLondon = (Button)findViewById(R.id.londonButt);
        Button buttonNewYork = (Button)findViewById(R.id.newYorkButt);

        buttonLondon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LondonActivity.class);
                startActivity(intent);
            }
        });

        buttonNewYork.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), NewYorkActivity.class);
            startActivity(intent);
            }
        });
}


}