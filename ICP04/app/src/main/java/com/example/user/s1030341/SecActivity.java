package com.example.user.s1030341;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {
    String str="";
    String s="";
    String str2="";
    double aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        final Button btn0=(Button) findViewById(R.id.button0);
        final Button btn1=(Button) findViewById(R.id.button1);
        final Button btn2=(Button) findViewById(R.id.button2);
        final Button btn3=(Button) findViewById(R.id.button3);
        final Button btn4=(Button) findViewById(R.id.button4);
        final Button btn5=(Button) findViewById(R.id.button5);
        final Button btn6=(Button) findViewById(R.id.button6);
        final Button btn7=(Button) findViewById(R.id.button7);
        final Button btn8=(Button) findViewById(R.id.button8);
        final Button btn9=(Button) findViewById(R.id.button9);
        final TextView tv01=(TextView) findViewById(R.id.textView1);
        Button btnA=(Button)findViewById(R.id.button24);
        Button btnS=(Button)findViewById(R.id.button25);
        Button btnE=(Button)findViewById(R.id.button23);
        Button btnM=(Button)findViewById(R.id.button26);
        Button btnD=(Button)findViewById(R.id.button27);
        final Button btnDot=(Button)findViewById(R.id.button22);
        final RadioButton rb01=(RadioButton)findViewById(R.id.radioButton);
        final RadioButton rb02=(RadioButton)findViewById(R.id.radioButton2);
        RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rb01.getId()==checkedId) {
                    aa=aa/10;

                    tv01.setText(String.valueOf(aa));
                }
                if(rb02.getId()==checkedId) {
                    aa = aa / 16;
                    tv01.setText(String.valueOf(aa));
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn0.getText().toString();
                tv01.setText(str);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn1.getText().toString();
                tv01.setText(str);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn2.getText().toString();
                tv01.setText(str);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn3.getText().toString();
                tv01.setText(str);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn4.getText().toString();
                tv01.setText(str);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn5.getText().toString();
                tv01.setText(str);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn6.getText().toString();
                tv01.setText(str);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn7.getText().toString();
                tv01.setText(str);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn8.getText().toString();
                tv01.setText(str);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btn9.getText().toString();
                tv01.setText(str);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                str=str+btnDot.getText().toString();
                tv01.setText(str);
            }
        });
        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                s="+";
                str2=str;
                str="";
            }
        });
        btnS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                s="-";
                str2=str;
                str="";
            }
        });
        btnM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                s="*";
                str2=str;
                str="";
            }
        });
        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                s="/";
                str2=str;
                str="";
            }
        });
        btnE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(s=="+") {
                    aa = Double.parseDouble(str2) + Double.parseDouble(str);
                    tv01.setText(String.valueOf(aa));
                }
                else if (s=="-") {
                    aa = Double.parseDouble(str2) - Double.parseDouble(str);
                    tv01.setText(String.valueOf(aa));
                }
                else if (s=="*") {
                    aa = Double.parseDouble(str2) * Double.parseDouble(str);
                    tv01.setText(String.valueOf(aa));
                }
                else if (s=="/") {
                    aa = Double.parseDouble(str2) / Double.parseDouble(str);
                    tv01.setText(String.valueOf(aa));
                }
                else
                    aa=87;

            }
        });


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
                Intent myInt1=new Intent(SecActivity.this,SecActivity.class);
                startActivity(myInt1);
                break;
            case R.id.mi02:
                Intent myInt2=new Intent(SecActivity.this,ThirdActivity.class);
                startActivity(myInt2);
                break;
            case R.id.mi03:
                Intent myInt3=new Intent(SecActivity.this,FourthActivity.class);
                startActivity(myInt3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
