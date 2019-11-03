package com.example.myfirstapp;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class NotiApp extends Application {
    public static final String CHANNEL_1_ID = "High priority";

    public void onCreate() {
        super.onCreate();

        createNotificationChannels();
    }

    public void createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID,
                    "High Priority",
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription("This is for high alert notifications.");

            NotificationManager manager = getSystemService(NotificationManager.class);

            manager.createNotificationChannel(channel1);


        }
    }
}
