package com.example.darrowhuang.fileio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    String fname="test";
    EditText et01;
    TextView tv02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv01=(TextView)findViewById(R.id.textView);
        tv02=(TextView)findViewById(R.id.textView3);
        et01=(EditText)findViewById(R.id.editText);
        Button bt01=(Button)findViewById(R.id.button2);
        Button bt02=(Button)findViewById(R.id.button3);

        bt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    FileOutputStream out=openFileOutput(fname,MODE_PRIVATE);
                    OutputStreamWriter sw=new OutputStreamWriter(out);
                    sw.write(et01.getText().toString());
                    sw.flush();
                    sw.close();
                }catch (FileNotFoundException fe){

                }catch (IOException ioe){

                }
            }
        });

        bt02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    FileInputStream in=openFileInput(fname);
                    InputStreamReader rr=new InputStreamReader(in);
                    char[] buffer=new char[256];
                    int count;
                    String s="";
                    while ((count=rr.read(buffer))>0){
                        String str=String.valueOf(buffer,0,count);
                        s=s+str;
                    }
                    tv02.setText(s);
                }catch (FileNotFoundException fee){

                }catch (IOException ioee){

                }
            }
        });
        InputStream is=this.getResources().openRawResource(R.raw.note);
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        String ss,str="";
        try{
            while ((ss=br.readLine())!=null){
                str=ss+str;
            }
        }catch (FileNotFoundException feee){

        }catch (IOException ioeee){

        }
        tv02.setText(str);
    }
}
