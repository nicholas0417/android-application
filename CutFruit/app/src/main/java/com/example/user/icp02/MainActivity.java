package com.example.user.icp02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView iv01;
    double downX,downY;
    double upX,upY;
    double a,b,c,d;
    FrameLayout f2;
    TextView tv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout f1=(FrameLayout)findViewById(R.id.FL01);
        f2=(FrameLayout)findViewById(R.id.FL02);
        iv01=(ImageView) findViewById(R.id.imageView);
        tv01=(TextView)findViewById(R.id.textView) ;

        f1.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event){
                int act=event.getAction();

                a=iv01.getLeft();
                b=iv01.getRight();
                c=iv01.getTop();
                d=iv01.getBottom();

                switch(act){
                    case MotionEvent.ACTION_DOWN:

                        downX=event.getX();
                        downY=event.getY();

                        break;
                    case MotionEvent.ACTION_MOVE:
                        tv01.setText(event.getX()+" "+event.getY());
                        break;

                    case MotionEvent.ACTION_UP:
                        upX = event.getX();
                        upY = event.getY();

                        if(downX<180 && upX>800 && downY>360 && downY<960)
                            iv01.setImageResource(R.drawable.p11);
                        if(downX>800 && upX<180 && downY>360 && downY<960)
                            iv01.setImageResource(R.drawable.p11);
                        if(downY<180 && upY>960 && downX>180 && downX<800)
                            iv01.setImageResource(R.drawable.p12);
                        if(downY>960 && upY<180 && downX>180 && downX<800)
                            iv01.setImageResource(R.drawable.p12);
                        if(downX<180 && upX<180)
                            iv01.setImageResource(R.drawable.p01);
                        if(downX>800 && upX>800)
                            iv01.setImageResource(R.drawable.p01);
                        if(downY<180 && upY<180)
                            iv01.setImageResource(R.drawable.p01);
                        if(downY>960 && upY>960)
                            iv01.setImageResource(R.drawable.p01);

                        break;


                }
                return true;
            }
        });
    }
}
