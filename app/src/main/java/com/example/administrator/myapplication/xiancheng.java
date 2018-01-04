package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by daiff on 2018/1/4.
 * for:
 */

public class xiancheng extends Activity {
    private TextView textView;
    private Button button;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 12){
                textView.setText(msg.arg1+"");
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiancheng_activity);
        textView = (TextView)findViewById(R.id.text_xiancheng);
        button = (Button)findViewById(R.id.button_xianch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        for (int i = 0;i<10;i++) {
                            Message ms = new Message();
                            ms.what = 12;
                            ms.arg1 = i;
                            handler.sendMessage(ms);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }.start();
            }
        });
    }
}
