package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by daiff on 2018/1/3.
 * for:复选框
 */

public class checkbox extends Activity{
    private CheckBox one;
    private CheckBox two;
    private CheckBox three;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_activity);
        findViewById();
    }

    private void findViewById() {
        one = (CheckBox) findViewById(R.id.checkBox);
        two = (CheckBox) findViewById(R.id.checkBox2);
        three = (CheckBox) findViewById(R.id.checkBox3);
        text = (TextView) findViewById(R.id.text_check);
        check c = new check();
        one.setOnClickListener(c);

    }
    class check implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        }
    }
}
