package com.example.darrowhuang.selecelement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cb01,cb02,cb03;
    TextView tv01,tv02;
    RadioButton rb01,rb02,rb03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb01=(CheckBox) findViewById(R.id.checkBox);
        cb02=(CheckBox) findViewById(R.id.checkBox2);
        cb03=(CheckBox) findViewById(R.id.checkBox3);

        Button btn01=(Button) findViewById(R.id.button);
        tv01=(TextView) findViewById(R.id.textView);


        btn01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String str="";
                if(cb01.isChecked())
                    str=str+cb01.getText().toString();
                if(cb02.isChecked())
                    str=str+cb02.getText().toString();
                if(cb03.isChecked())
                    str=str+cb03.getText().toString();
                tv01.setText(str);

            }

        });


        rb01=(RadioButton)findViewById(R.id.radioButton);
        rb02=(RadioButton)findViewById(R.id.radioButton2);
        rb03=(RadioButton)findViewById(R.id.radioButton3);
        RadioGroup rg=(RadioGroup) findViewById(R.id.radioGroup);
        tv02=(TextView) findViewById(R.id.textView2);
        tv02.setText("三分熟");


    }
}
