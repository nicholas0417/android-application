package com.example.darrowhuang.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView tv01=(TextView)findViewById(R.id.tv);
        Bundle bb=this.getIntent().getExtras();
        tv01.setText(bb.getString("HEIGHT")+"--"+bb.getString("WEIGHT"));
        Button btn01=(Button)findViewById(R.id.button2);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
