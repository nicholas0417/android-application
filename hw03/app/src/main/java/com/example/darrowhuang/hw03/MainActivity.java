package com.example.darrowhuang.hw03;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] str={"O","X"};
    ImageButton ib[]= new ImageButton[9];
    char mode;
    boolean over=false;
    int num[] = new int[9];
    int j =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(3);

        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.setMargins(80,120,0,0);
        gridLayout.setLayoutParams(params);
        for (int i = 0; i < ib.length; i++) {
            ib[i] = new ImageButton(getApplicationContext());
            ib[i].setAdjustViewBounds(true);
            ib[i].setMaxHeight(300);
            ib[i].setMaxWidth(300);
            ib[i].setImageResource(R.drawable.white);
            ib[i].setId(i);
            ib[i].setOnClickListener(iBLTR);
            gridLayout.addView(ib[i]);
        }
        setContentView(gridLayout);

        AlertDialog.Builder bld=new AlertDialog.Builder(MainActivity.this);
        bld.setTitle("Which is the first ?")
                .setItems(str,new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                        Toast.makeText(MainActivity.this,str[which]+" first",Toast.LENGTH_SHORT).show();
                        if(str[which].equals("O")){
                            mode='O';
                        }else if (str[which].equals("X")){
                            mode='X';
                        }
                    }
                })
                .show();
    }

    View.OnClickListener iBLTR=new View.OnClickListener(){
        @Override
        public void onClick(View v){

            int n =v.getId();
            String MSG="";
            if(num[n]==0) {
                if (mode == 'O') {
                    num[n] = 1;
                    ib[n].setImageDrawable(getResources().getDrawable(R.drawable.circle));
                    mode = 'X';
                } else {
                    num[n] = -1;
                    ib[n].setImageDrawable(getResources().getDrawable(R.drawable.xx));
                    mode = 'O';
                }
                j++;
            }

            if(over){
                Toast.makeText(MainActivity.this,"Game Over!!!"+MSG,Toast.LENGTH_SHORT).show();
            }
            if(((num[0]+num[1]+num[2])==3)||((num[3]+num[4]+num[5])==3)||((num[6]+num[7]+num[8])==3) ||
                    ((num[0]+num[3]+num[6])==3)||((num[1]+num[4]+num[7])==3)||((num[2]+num[5]+num[8])==3)||
                    ((num[0]+num[4]+num[8])==3)||((num[2]+num[4]+num[6])==3)){
                AlertDialog.Builder bld=new AlertDialog.Builder(MainActivity.this);
                bld.setTitle("Result")
                   .setMessage("O Win!")
                   .setPositiveButton("OK",null);
                bld.show();
                over =true;
            }else if(((num[0]+num[1]+num[2])==-3)||((num[3]+num[4]+num[5])==-3)||((num[6]+num[7]+num[8])==-3) ||
                    ((num[0]+num[3]+num[6])==-3)||((num[1]+num[4]+num[7])==-3)||((num[2]+num[5]+num[8])==-3)||
                    ((num[0]+num[4]+num[8])==-3)||((num[2]+num[4]+num[6])==-3)){
                AlertDialog.Builder bld=new AlertDialog.Builder(MainActivity.this);
                bld.setTitle("Result")
                        .setMessage("X Win!")
                        .setPositiveButton("OK",null);
                bld.show();
                over =true;
            }else if(j==9){
                AlertDialog.Builder bld=new AlertDialog.Builder(MainActivity.this);
                bld.setTitle("Result")
                        .setMessage("Fair!")
                        .setPositiveButton("OK",null);
                bld.show();
                over =true;
            }
        }
    };
}
