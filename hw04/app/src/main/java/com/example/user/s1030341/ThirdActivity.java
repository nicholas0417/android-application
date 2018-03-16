package com.example.user.s1030341;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {
    String[] str = {"上","下","左","右","左下","右下"};
    boolean iChecked[] = new boolean[str.length];
    boolean[] check={false,false,false,false,false,false};
    float upX ,upY ,downX ,downY;
    int error, error2;
    ImageView iv01;
    FrameLayout f1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        iv01=(ImageView) findViewById(R.id.imageView);
        f1=(FrameLayout)findViewById(R.id.FL01);
        //
        AlertDialog.Builder bld= new AlertDialog.Builder(ThirdActivity.this);
        bld.setTitle("Setting")
                .setMultiChoiceItems(str,iChecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        // Toast.makeText(MainActivity.this,str[which]+(isChecked[which]?" picked!!":" not picked!!"),Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancel",null)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String MSG="";
                        for(int index=0;index<6;index++){
                            if(iChecked[index])
                                MSG=MSG+str[index];
                        }

                        for(int i=0;i<6;i++){
                            if (iChecked[i])
                                check[i]=true;
                        }
                    }
                });
        bld.show();


        f1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int act = event.getAction();


                switch (act) {
                    case MotionEvent.ACTION_DOWN:
                        downX = event.getX();
                        downY = event.getY();


                        break;
                    case MotionEvent.ACTION_UP:
                        upX = event.getX();
                        upY = event.getY();
                        if (event.getX() > iv01.getLeft() && event.getX() < iv01.getRight() && event.getY() > iv01.getTop() && event.getY() < iv01.getBottom())
                            error2 = 1;
                        if (-0.36 < ((upY - downY) / (upX - downX)) && ((upY - downY) / (upX - downX)) < 0.36 && (upX - downX) > 0 && error == 0 && error2 == 0 &&check[3]==true) {
                            iv01.setImageResource(R.drawable.p02);
                        }
                        if (-0.36 < ((upY - downY) / (upX - downX)) && ((upY - downY) / (upX - downX)) < 0.36 && (upX - downX) < 0 && error == 0 && error2 == 0 &&check[2]==true) {
                            iv01.setImageResource(R.drawable.p03);
                        }
                        if ((2.7 < ((upY - downY) / (upX - downX)) || ((upY - downY) / (upX - downX)) < -2.7 )&& (upY - downY) < 0 && error == 0 && error2 == 0 &&check[0]==true) {
                            iv01.setImageResource(R.drawable.p04);
                        }
                        if ((2.7 < ((upY - downY) / (upX - downX)) || ((upY - downY) / (upX - downX)) < -2.7 )&& (upY - downY) > 0 && error == 0 && error2 == 0 &&check[1]==true) {
                            iv01.setImageResource(R.drawable.p05);
                        }
                        if (2.14 > ((upY - downY) / (upX - downX)) && ((upY - downY) / (upX - downX)) > 0.46 && (upX - downX) > 0 && error == 0 && error2 == 0 &&check[5]==true) {
                            iv01.setImageResource(R.drawable.p06);
                        }
                        if (-0.8 > ((upY - downY) / (upX - downX)) && ((upY - downY) / (upX - downX)) > -1.2 && (upX - downX) <0 && error == 0 && error2 == 0 &&check[4]==true) {
                            iv01.setImageResource(R.drawable.p07);
                        }
                        error2 = 1;
                        error = 1;
                        break;
                    case MotionEvent.ACTION_MOVE:
                        if (((upY < iv01.getTop() || upY > iv01.getBottom()) || (upX < iv01.getLeft() || upX > iv01.getRight())) && ((downY < iv01.getTop() || downY > iv01.getBottom()) || (downX < iv01.getLeft() || downX > iv01.getRight())))
                            error = 0;
                        else
                            error = 1;
                        if (event.getX() > iv01.getLeft() && event.getX() < iv01.getRight() && event.getY() > iv01.getTop() && event.getY() < iv01.getBottom())
                            error2 = 0;
                        break;
                }
                return true;
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
                Intent myInt1=new Intent(ThirdActivity.this,SecActivity.class);
                startActivity(myInt1);
                break;
            case R.id.mi02:
                Intent myInt2=new Intent(ThirdActivity.this,ThirdActivity.class);
                startActivity(myInt2);
                break;
            case R.id.mi03:
                Intent myInt3=new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(myInt3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

