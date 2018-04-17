package com.example.darrowhuang.notify;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder nmB=new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Test Notification")
                .setContentText("You won a prize!!!");

        Intent it=new Intent(this,Mynote.class);
        it.putExtra("NOTIFICATION_ID",12);
        PendingIntent pi=PendingIntent.getActivity(this,1234,it,PendingIntent.FLAG_UPDATE_CURRENT);
        nmB.setContentIntent(pi);

        NotificationManager NM=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NM.notify(12,nmB.build());

        finish();
    }
}
