package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.myapplication.qita.DataCallBack;
import com.example.administrator.myapplication.qita.DatePickerFragment;

/**
 * Created by daiff on 2018/1/24.
 * for:
 */

public class shijian extends AppCompatActivity implements DataCallBack {
    TextView timeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shijian);
        timeText = (TextView) findViewById(R.id.time_text);
        //为timeText设置点击事件
        timeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //实例化对象
                DatePickerFragment datePickerFragment = new DatePickerFragment();
                //调用show方法弹出对话框
                // 第一个参数为FragmentManager对象
                // 第二个为调用该方法的fragment的标签
                datePickerFragment.show(getFragmentManager(), "date_picker");
            }
        });
    }


    //实现DataCallBack的getData方法
    @Override
    public void getData(String data) {
        //data即为fragment调用该函数传回的日期时间
        timeText.setText(data);
    }


}
