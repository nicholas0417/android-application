package com.example.user.icp09;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecActivity extends AppCompatActivity {
    EditText et01,et02;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Button btn01=(Button)findViewById(R.id.button3);
        Button btn02=(Button)findViewById(R.id.button4);
        et01=(EditText)findViewById(R.id.editText3);
        et02=(EditText)findViewById(R.id.editText4);

        //取消鈕
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //確認鈕
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs=getSharedPreferences("1",MODE_PRIVATE);
                SharedPreferences.Editor pEdit=prefs.edit();
                pEdit.putString(et01.getText().toString(),et02.getText().toString());
                pEdit.apply();
                finish();
            }
        });
    }
}
