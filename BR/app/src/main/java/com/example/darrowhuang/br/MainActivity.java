package com.example.darrowhuang.br;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Button btn01=(Button)findViewById(R.id.button);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itt01=new Intent();
                itt01.setAction("com.example.yckan.brdemo.TEST_MODE");
                sendBroadcast(itt01);
            }
        });
        Button btn02=(Button)findViewById(R.id.button2);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et01=(EditText)findViewById(R.id.editText);
                Long seconds=Long.parseLong(et01.getText().toString());
                Intent it=new Intent(MainActivity.this,AlarmBR.class);
                PendingIntent pi=PendingIntent.getBroadcast(MainActivity.this,1234,it,0);
                AlarmManager am=(AlarmManager) getSystemService(Context.ALARM_SERVICE);
                am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(seconds*1000),pi);
            }
        });
    }
}
