package com.example.darrowhuang.custlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Weather weather_data[] = new Weather[]
                {
                        new Weather(R.drawable.p1, "Cloudy"),
                        new Weather(R.drawable.p2, "Showers"),
                        new Weather(R.drawable.p3, "Snow"),
                        new Weather(R.drawable.p4, "Storm"),
                        new Weather(R.drawable.p5, "Sunny")
                };

        WeatherAdapter adapter = new WeatherAdapter(this,
                R.layout.lv_item_row, weather_data);


        listView1 = (ListView)findViewById(R.id.lv01);

        View header = (View)getLayoutInflater().inflate(R.layout.lv_item_header, null);
        listView1.addHeaderView(header);

        listView1.setAdapter(adapter);
    }
}
