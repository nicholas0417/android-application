package com.example.darrowhuang.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] days;
    ArrayAdapter<String> a2;
    ListView lv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        days=getResources().getStringArray(R.array.days);

        lv01=(ListView)findViewById(R.id.listview);
        a2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,days);
        lv01.setAdapter(a2);
        lv01.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        Button btn01=(Button)findViewById(R.id.button);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss="";
                for(int i=0;i<days.length;i++){
                    if(lv01.isItemChecked(i))
                        ss=days[i]+ss+" ";
                }
                Toast.makeText(MainActivity.this,ss,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
