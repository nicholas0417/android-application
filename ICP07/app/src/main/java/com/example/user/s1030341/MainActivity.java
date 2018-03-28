package com.example.user.s1030341;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et01;
    EditText et02;
    EditText et03;
    TextView tv01;
    TextView tv02;
    TextView tv03;
    TextView tv13;
    int year = 1;
    int month;
    int day;
    String[] months;
    String s;
    String f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01=(Button)findViewById(R.id.button11);
        et01=(EditText)findViewById(R.id.editText);
        et03=(EditText)findViewById(R.id.editText3);
        tv13=(TextView)findViewById(R.id.textView13);

        Spinner sp01=(Spinner)findViewById(R.id.spinner2);
        months=getResources().getStringArray(R.array.months);
        ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,months);
        sp01.setAdapter(a1);

        sp01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index=parent.getSelectedItemPosition();
                Toast.makeText(MainActivity.this,months[index], Toast.LENGTH_SHORT).show();

                year = Integer.parseInt(et01.getText().toString());

                month=Integer.parseInt(parent.getSelectedItem().toString());
                if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
                    s="r";
                else
                    s="p";

                if(s.equals("r")) {
                    switch (month) {
                        case 1:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 2:
                            tv13.setText(parent.getSelectedItem().toString()+"/29");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 3:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 4:
                            tv13.setText(parent.getSelectedItem().toString()+"/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 5:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 6:
                            tv13.setText(parent.getSelectedItem().toString()+"/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 7:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 8:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 9:
                            tv13.setText(parent.getSelectedItem().toString()+"/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 10:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 11:
                            tv13.setText(parent.getSelectedItem().toString()+"/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 12:
                            tv13.setText(parent.getSelectedItem().toString()+"/31");
                            f=parent.getSelectedItem().toString();
                            break;
                    }
                }
                else{
                    switch (month) {
                        case 1:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 2:
                            tv13.setText(parent.getSelectedItem().toString() + "/28");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 3:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 4:
                            tv13.setText(parent.getSelectedItem().toString() + "/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 5:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 6:
                            tv13.setText(parent.getSelectedItem().toString() + "/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 7:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 8:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 9:
                            tv13.setText(parent.getSelectedItem().toString() + "/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 10:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 11:
                            tv13.setText(parent.getSelectedItem().toString() + "/30");
                            f=parent.getSelectedItem().toString();
                            break;
                        case 12:
                            tv13.setText(parent.getSelectedItem().toString() + "/31");
                            f=parent.getSelectedItem().toString();
                            break;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year=Integer.parseInt(et01.getText().toString());
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
                    bdl.putString("Month",f);
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
                    tv01.setText("生日:"+et01.getText().toString()+"年"+f+"月"+et03.getText().toString()+"日");
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
