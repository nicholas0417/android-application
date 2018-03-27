package com.example.user.s1030341;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater minf=getMenuInflater();
        minf.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mi01:
                Intent myInt1=new Intent(MainActivity.this,SecActivity.class);
                startActivity(myInt1);
                break;
            case R.id.mi02:
                Intent myInt2=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(myInt2);
                break;
            case R.id.mi03:
                Intent myInt3=new Intent(MainActivity.this,FourthActivity.class);
                startActivity(myInt3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
