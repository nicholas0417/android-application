package com.example.user.icp09;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    EditText et01,et02;
    Button btn01,btn02;
    TextView tv01;
    AlertDialog.Builder bld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et01=(EditText)findViewById(R.id.editText);
        et02=(EditText)findViewById(R.id.editText2);
        btn01=(Button)findViewById(R.id.button);
        btn02=(Button)findViewById(R.id.button2);
        tv01=(TextView)findViewById(R.id.textView5);
        bld=new AlertDialog.Builder(this);

        //註冊鈕
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt=new Intent(MainActivity.this,SecActivity.class);
                startActivity(myInt);
            }
        });
        //登入鈕
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs=getSharedPreferences("1",MODE_PRIVATE);
                String str=prefs.getString(et01.getText().toString(),"87");
                if(str.equals("87")) {           //沒註冊
                    bld.setTitle("ERROR")
                            .setMessage("你沒註冊")
                            .setPositiveButton("OK", null);
                    bld.show();
                }
                if((!str.equals("87"))&&(!(et02.getText().toString()).equals(str))){ //密碼錯
                    bld.setTitle("ERROR")
                            .setMessage("密碼錯誤")
                            .setPositiveButton("OK", null);
                    bld.show();
                }
                if(!str.equals("87")&&(et02.getText().toString()).equals(str)){
                    Intent myInt = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(myInt);
                }
            }
        });





    }
}
