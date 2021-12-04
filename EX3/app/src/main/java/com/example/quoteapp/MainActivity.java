package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startQuote = (Button)findViewById(R.id.button);
        startQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlarm();
            }
        });
    }

    private void startAlarm() {
        Intent myIntent;
        PendingIntent pendingIntent;

        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        myIntent = new Intent(MainActivity.this, AlarmReciver.class);
        pendingIntent = PendingIntent.getBroadcast(this,0,myIntent,0);
        manager.setRepeating(AlarmManager.RTC_WAKEUP, SystemClock.elapsedRealtime() + 3000, 3000, pendingIntent);
        //end
    }
}