package com.example.darrowhuang.textelement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et03;
    EditText et04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et03=(EditText)findViewById(R.id.editText3);
        et04=(EditText)findViewById(R.id.editText4);

        Button btn01=(Button) findViewById(R.id.button);
        tv= (TextView) findViewById(R.id.textView);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Float.parseFloat(et04.getText().toString());
                double b=Float.parseFloat(et03.getText().toString());
                double c=b*b*0.0001;
                double aa=a/c;

                tv.setText(String.valueOf(aa));

            }
        });
                et03.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                        tv.setText(s);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
    }
}
