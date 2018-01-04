package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by daiff on 2018/1/4.
 * for:
 */

public class TouchEvent extends Activity{
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ontouchevent_activity);
        text=(TextView)findViewById(R.id.text_ontouched);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //event表示的是点击或者移动的事件
        int ACTION = event.getAction();//得到用户的动作，按下 滑动、提起
        float xy = event.getX();
        if(ACTION == MotionEvent.ACTION_DOWN){
            text.setText("ACTION_DOWN");

        }else if (ACTION == MotionEvent.ACTION_MOVE){
            text.setText("ACTION_MOVE");
        }else if (ACTION == MotionEvent.ACTION_MASK){
            text.setText("ACTION_MASK");
        }

        return super.onTouchEvent(event);
    }
}
