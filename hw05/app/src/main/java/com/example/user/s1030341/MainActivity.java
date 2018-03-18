package com.example.user.s1030341;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et01;
    EditText et02;
    EditText et03;
    TextView tv01;
    TextView tv02;
    TextView tv03;
    int year;
    int month;
    int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01=(Button)findViewById(R.id.button11);
        et01=(EditText)findViewById(R.id.editText);
        et02=(EditText)findViewById(R.id.editText2);
        et03=(EditText)findViewById(R.id.editText3);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year=Integer.parseInt(et01.getText().toString());
                month=Integer.parseInt(et02.getText().toString());
                day=Integer.parseInt(et03.getText().toString());
                if((month>12)||(month<1)) {
                    AlertDialog.Builder bld = new AlertDialog.Builder(MainActivity.this);
                    bld.setTitle("ERROR")
                       .setMessage("月輸入錯誤")
                       .setPositiveButton("OK",null)
                       .show();
                }
                else if((day>31)||(day<1)){
                    AlertDialog.Builder bld = new AlertDialog.Builder(MainActivity.this);
                    bld.setTitle("ERROR")
                            .setMessage("日輸入錯誤")
                            .setPositiveButton("OK",null)
                            .show();
                }
                else {
                    Intent myInt = new Intent(MainActivity.this, FifthActivity.class);
                    Bundle bdl = new Bundle();
                    bdl.putString("Year", et01.getText().toString());
                    bdl.putString("Month", et02.getText().toString());
                    bdl.putString("Date", et03.getText().toString());
                    myInt.putExtras(bdl);
                    startActivityForResult(myInt, 12);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        tv01=(TextView)findViewById(R.id.textView6);
        tv02=(TextView)findViewById(R.id.textView8);
        tv03=(TextView)findViewById(R.id.textView11);
        switch (requestCode){
            case 12:
                if(resultCode==1)
                    tv01.setText("生日:"+et01.getText().toString()+"年"+et02.getText().toString()+"月"+et03.getText().toString()+"日");
                    tv02.setText("星座:"+data.getStringExtra("TT"));
                    tv03.setText("生肖:"+data.getStringExtra("SS"));
        }
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
