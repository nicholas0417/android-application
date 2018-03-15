package com.example.darrowhuang.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] str={"A","B","C"};
    boolean iChecked[]=new boolean[str.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01 = (Button) findViewById(R.id.button);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bld = new AlertDialog.Builder(MainActivity.this);
                bld.setTitle("Confirmation")
                        .setMessage("Are you sure?")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int whitch) {
                                Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();

                            }
                        });
                bld.show();
            }
        });

        Button btn02 = (Button) findViewById(R.id.button2);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bld = new AlertDialog.Builder(MainActivity.this);
                bld.setTitle("Single Choice")
                        .setItems(str, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, str[which], Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                            }
                        });
                bld.show();

            }
        });

        Button btn03 = (Button) findViewById(R.id.button3);
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bld = new AlertDialog.Builder(MainActivity.this);
                bld.setTitle("Single Choice")
                        .setMultiChoiceItems(str, iChecked, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                Toast.makeText(MainActivity.this, str[which] + (iChecked[which] ? "Checked!" : "Not checked!"), Toast.LENGTH_SHORT).show();
                            }
                        })
                   .setNegativeButton("Cancel",null)
                   .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           String MSG="";
                           for (int index=0;index<3;index++) {
                               if (iChecked[index])
                                   MSG = MSG + str[index]+" ";
                           }
                           Toast.makeText(MainActivity.this,MSG,Toast.LENGTH_SHORT).show();
                       }
                   })
                   .show();
            }
        });
    }
}
