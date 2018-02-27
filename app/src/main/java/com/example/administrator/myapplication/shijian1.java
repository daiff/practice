package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Entity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.myapplication.qita.DateSelect;


/**
 * Created by daiff on 2018/1/24.
 * for:
 */

public class shijian1 extends Activity {
    private Button anniu;
    private EditText shijian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shijian1);
        anniu = (Button)findViewById(R.id.anniu);
        anniu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateSelect dateTimePicKDialog = new DateSelect(
                        shijian1.this, "2013年9月3日 14:44");
                dateTimePicKDialog.dateTimePicKDialog(shijian);
            }
        });
        shijian = (EditText)findViewById(R.id.xianshi);
    }
}
