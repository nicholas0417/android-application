package com.example.darrowhuang.intent;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et01;
    EditText et02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button);
        et01=(EditText)findViewById(R.id.editText);
        et02=(EditText)findViewById(R.id.editText2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt=new Intent(MainActivity.this,SecActivity.class);
                Bundle bdl=new Bundle();
                bdl.putString("HEIGHT",et01.getText().toString());
                bdl.putString("WEIGHT",et02.getText().toString());
                myInt.putExtras(bdl);
                //startActivity(myInt);
                startActivityForResult(myInt,12);

            }
        });
        Button btn02=(Button)findViewById(R.id.button3);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nn=new Intent(Intent.ACTION_WEB_SEARCH);
                nn.putExtra(SearchManager.QUERY,"Android");
                startActivity(nn);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView tv02=(TextView)findViewById(R.id.tt);
        switch (requestCode){
            case 12:
                if(resultCode==1)

                    tv02.setText(data.getStringExtra("TT"));
        }
    }
}
