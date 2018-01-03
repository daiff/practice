package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by daiff on 2018/1/3.
 * for:单选框
 */

public class radioActivity extends Activity {
    private RadioGroup radioGroup;
    private RadioButton button1;
    private RadioButton button2;
    private RadioButton button3;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiogroup);
        radioGroup = (RadioGroup)findViewById(R.id.radio_group);
        button1 = (RadioButton) findViewById(R.id.check1);
        button2 = (RadioButton) findViewById(R.id.check2);
        button3 = (RadioButton) findViewById(R.id.check3);
        result = (TextView) findViewById(R.id.checkresult);

        radioGroup.setOnCheckedChangeListener(checkOncliclistener);
    }
    RadioGroup.OnCheckedChangeListener checkOncliclistener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.check1:result.setText("你的");
                    break;
                case R.id.check2:result.setText("我的");
                    break;
                case R.id.check3:result.setText("矮油");
                    break;
            }

        }
    };
}
