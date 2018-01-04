package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by daiff on 2018/1/3.
 * for:复选框
 */

public class checkbox extends Activity{
    private static final String TAG = "checkbox";
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

        checkchange c = new checkchange();
        one.setOnCheckedChangeListener(c);
        two.setOnCheckedChangeListener(c);
        three.setOnCheckedChangeListener(c);

    }

    class checkchange implements CompoundButton.OnCheckedChangeListener{
        StringBuilder stringBuilder = new StringBuilder("数字是：");
        String str;
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch(buttonView.getId()){
                case R.id.checkBox:
                    str = "111 ";
                    chnage1(str,isChecked);
                    break;
                case R.id.checkBox2:
                    str = "222 " ;
                    chnage1(str,isChecked);
                    break;
                case R.id.checkBox3:
                    str = "333 " ;
                    chnage1(str,isChecked);
                    break;
            }
            text.setText(stringBuilder.toString());
        }

        private void chnage1(String str,boolean isChecked){
            if (isChecked){
                stringBuilder.append(str);
                Log.i(TAG, "onCheckedChanged:"+stringBuilder);
            }else{
                int start = stringBuilder.indexOf(str);
                if(start!=-1){
                    int end = str.length()+start;
                    stringBuilder.delete(start,end);
                }

            }
        }
    }


}
