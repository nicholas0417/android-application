package com.example.darrowhuang.icp01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String str="";
    String s="";
    String str2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        btnE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Integer aa;
                if(s=="+") {
                    aa = Integer.parseInt(str2) + Integer.parseInt(str);
                    tv01.setText(aa.toString());
                }
                else if (s=="-") {
                    aa = Integer.parseInt(str2) - Integer.parseInt(str);
                    tv01.setText(aa.toString());
                }
                else
                    aa=87;

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
