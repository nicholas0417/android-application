package com.example.darrowhuang.sharedpreferences;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences prefs,prefs2;
    TextView tv01,tv02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv01=(TextView)findViewById(R.id.textView);
        tv02=(TextView)findViewById(R.id.textView2);

        prefs2=getSharedPreferences("appPrefs",MODE_PRIVATE);
        SharedPreferences.Editor p2Edit=prefs2.edit();
        p2Edit.putString("123","PassC++");
        p2Edit.apply();

        tv02.setText(prefs2.getString("123",""));

        PreferenceManager.setDefaultValues(this,R.xml.myprefs,false);
        SharedPreferences prefs3=PreferenceManager.getDefaultSharedPreferences(this);
        Toast.makeText(this,prefs3.getString("username","u")+"-"+prefs3.getString("password","u"),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        prefs=getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor pEdit=prefs.edit();
        pEdit.putString("ABC","Fail on Android");
        pEdit.putFloat("DEF",3.5F);

        pEdit.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        prefs=getPreferences(MODE_PRIVATE);
        tv01.setText(prefs.getString("ABC","10000"));
    }
}
