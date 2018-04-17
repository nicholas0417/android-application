package com.example.darrowhuang.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    PopupMenu pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv01=(TextView)findViewById(R.id.tv01);
        pm=new PopupMenu(this,tv01);
        pm.getMenuInflater().inflate(R.menu.pmmenu,pm.getMenu());
        pm.setOnMenuItemClickListener(this);

        tv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pm.getMenu().add("E");
                pm.getMenu().add("F");
                pm.show();

            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getTitle().toString()){
            case "A":
            case "B":
            case "E":
            case "F":
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
            default:
        }
        return true;
    }
}
