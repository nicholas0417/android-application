package com.example.darrowhuang.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class MyService extends Service {
    public MyService() {
    }

    public class MyBinder extends Binder {
        MyService getService(){
            return MyService.this;
        }
    }

    private final IBinder sBinder=new MyBinder();
    @Override
    public IBinder onBind(Intent intent) {
        return sBinder;
    }

    private final Random mGenerator=new Random();
    public int getRandomNumber(){
        return mGenerator.nextInt(100);
    }
}
