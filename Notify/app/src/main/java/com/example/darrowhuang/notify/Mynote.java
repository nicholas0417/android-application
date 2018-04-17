package com.example.darrowhuang.notify;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Mynote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mynote);

        NotificationManager nm1=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm1.cancel(getIntent().getExtras().getInt("NOTIFICATION_ID"));
    }
}
