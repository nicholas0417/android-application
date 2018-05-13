package com.example.darrowhuang.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] days;
    List dayList=new ArrayList();
    TextView tv01;
    String selStr;
    ArrayAdapter<String> a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        tv01=(TextView)findViewById(R.id.textView);
        tv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayList.remove(selStr);
                a1.notifyDataSetChanged();
            }
        });
        //
        days=getResources().getStringArray(R.array.days);
        for (String str:getResources().getStringArray(R.array.days))
            dayList.add(str);
        //ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,days);
        a1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dayList);
        Spinner sp01=(Spinner)findViewById(R.id.spinner);
        sp01.setAdapter(a1);
        sp01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selStr=parent.getSelectedItem().toString();
                Toast.makeText(MainActivity.this,selStr,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
