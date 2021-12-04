package com.example.quoteapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class AlarmReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Quotes allQuotes = new Quotes();
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("My Notification", "My Notification", NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(channel);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "My Notification");
            builder.setContentTitle("The Quote Is:");
            builder.setSmallIcon(R.drawable.clipart);
            builder.setContentText(allQuotes.getRandomeQuote());
            builder.setAutoCancel(true);
            manager.notify(1, builder.build());
        }
    }
}
