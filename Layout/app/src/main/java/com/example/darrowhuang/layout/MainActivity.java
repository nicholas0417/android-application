package com.example.darrowhuang.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        //
        TextView lbl01=new TextView(this);
        lbl01.setText("Testing");
        //
        Button btn01=new Button(this);
        btn01.setText("Button");
        //
        ll.addView(lbl01);
        ll.addView(btn01);
        //
        setContentView(ll);
    }
}
