package com.example.darrowhuang.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,2,"One").setIcon(R.drawable.ic_action_face).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(0,2,1,"Two");
        SubMenu sb=menu.addSubMenu("Three");
        sb.add("Three.1");
        sb.add("Three.2");
        //
        MenuInflater minf=getMenuInflater();
        minf.inflate(R.menu.main_menu,menu);
        SubMenu sb2=menu.findItem(R.id.mi03).getSubMenu();
        sb2.add(0,125,0,"subM01");
        //
        return super.onCreateOptionsMenu(menu);
    }
    //

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Log.v("MSG","1");
                break;
            case 125:
                Log.v("MSG","125");
                break;
            case 2:
                Log.v("MSG","2");
                break;
            case R.id.mi01:
                Log.v("MSG","mi01");
                break;
            case R.id.mi02:
                Log.v("MSG","mi02");
                break;
            case R.id.mi03:
                Log.v("MSG","mi03");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
