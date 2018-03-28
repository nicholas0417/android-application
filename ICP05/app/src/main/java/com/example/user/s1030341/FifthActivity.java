package com.example.user.s1030341;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {
    int month;
    int day;
    String result="輸入有誤";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        TextView tv01=(TextView)findViewById(R.id.textView7);
        Bundle bb=this.getIntent().getExtras();
        Button btn01=(Button)findViewById(R.id.button12);
        month=Integer.parseInt(bb.getString("Month"));
        day=Integer.parseInt(bb.getString("Date"));
        switch(month)
        {
            case 1:
                if(day >=1 && day <=20)
                    result="魔羯座";
                else if(day>=21 && day<=31)
                    result="水瓶座";
                break;
            case 2:
                if(day >=1 && day <=19)
                    result="水瓶座";
                else if(day>=20 && day<=29)
                    result="雙魚座";
                break;
            case 3:
                if(day >=1 && day <=20)
                    result="雙魚座";
                else if(day>=21 && day<=31)
                    result="牡羊座";
                break;
            case 4:
                if(day >=1 && day <=20)
                    result="牡羊座";
                else if(day>=21 && day<=30)
                    result="金牛座";
                break;
            case 5:
                if(day >=1 && day <=21)
                    result="金牛座";
                else if(day>=22 && day<=31)
                    result="雙子座";
                break;
            case 6:
                if(day >=1 && day <=21)
                    result="雙子座";
                else if(day>=22 && day<=30)
                    result="巨蟹座";
                break;
            case 7:
                if(day >=1 && day <=23)
                    result="巨蟹座";
                else if(day>=24 && day<=31)
                    result="獅子座";
                break;
            case 8:
                if(day >=1 && day <=23)
                    result="獅子座";
                else if(day>=24 && day<=31)
                    result="處女座";
                break;
            case 9:
                if(day >=1 && day <=23)
                    result="處女座";
                else if(day>=24 && day<=30)
                    result="天秤座";
                break;
            case 10:
                if(day >=1 && day <=23)
                    result="天秤座";
                else if(day>=24 && day<=31)
                    result="天蠍座";
                break;
            case 11:
                if(day >=1 && day <=22)
                    result="天蠍座";
                else if(day>=23 && day<=30)
                    result="射手座";
                break;
            case 12:
                if(day >=1 && day <=22)
                    result="射手座";
                else if(day>=23 && day<=31)
                    result="魔羯座";
                break;
        }
        tv01.setText(result);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rpyInt=new Intent();
                rpyInt.putExtra("TT",result);
                setResult(1,rpyInt);
                finish();
            }
        });

    }
}
