package com.example.darrowhuang.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean FBound;
    MyService mSrv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(FBound){
                    int num=mSrv.getRandomNumber();
                    Toast.makeText(MainActivity.this,"number:"+num,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ServiceConnection myConn=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder iBinder) {
            MyService.MyBinder bnd=(MyService.MyBinder) iBinder;
            mSrv=bnd.getService();
            FBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            FBound=false;

        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent=new Intent(this,MyService.class);
        bindService(intent,myConn, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (FBound){
            unbindService(myConn);
            FBound=false;
        }
    }
}
