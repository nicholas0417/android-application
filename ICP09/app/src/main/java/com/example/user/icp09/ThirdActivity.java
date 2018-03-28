package com.example.user.icp09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ThirdActivity extends AppCompatActivity {
    private ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        KFC kfc_data[] = new KFC[]
                {
                        new KFC(R.drawable.p1, "1:吮指嫩雞粥套餐,美味"),
                        new KFC(R.drawable.p2, "2:德式燻腸燒餅套餐,美味"),
                        new KFC(R.drawable.p3, "3:吮指嫩雞燒餅套餐,美味"),
                        new KFC(R.drawable.p4, "4:總匯歐姆蛋燒餅套餐,美味"),
                        new KFC(R.drawable.p5, "5:培根薯餅蛋烤餅套餐,美味"),
                        new KFC(R.drawable.p6, "6:總匯歐姆蛋堡套餐,美味"),
                        new KFC(R.drawable.p7, "7:吮指嫩雞蛋堡套餐,美味"),
                        new KFC(R.drawable.p8, "8:吮指嫩雞粥,美味"),
                        new KFC(R.drawable.p9, "9:德式燻腸燒餅,美味"),
                        new KFC(R.drawable.p10, "10:吮指嫩雞燒餅,美味"),
                        new KFC(R.drawable.p11, "11:總匯歐姆蛋燒餅,美味"),
                        new KFC(R.drawable.p12, "12:培根薯餅蛋烤餅,美味"),
                        new KFC(R.drawable.p13, "13:總匯歐姆蛋堡,美味"),
                        new KFC(R.drawable.p14, "14:吮指嫩雞蛋堡,美味"),
                        new KFC(R.drawable.p15, "15:柚香柚甜風味炸雞個人獨享餐,美味"),
                };

        KFCAdapter adapter = new KFCAdapter(this, R.layout.lv_item_raw, kfc_data);
        listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(adapter);
    }

}
