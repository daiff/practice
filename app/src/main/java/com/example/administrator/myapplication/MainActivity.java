package com.example.administrator.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();

    }

    private void findViewById() {
        button1 = (Button)findViewById(R.id.activity_1);
        button2 = (Button)findViewById(R.id.activity_2);
        button3 = (Button)findViewById(R.id.activity_3);
        button4 = (Button)findViewById(R.id.activity_4);
        button5 = (Button)findViewById(R.id.activity_5);
        button6 = (Button)findViewById(R.id.activity_6);
        button7 = (Button)findViewById(R.id.activity_7);
        button8 = (Button)findViewById(R.id.activity_8);
        button9 = (Button)findViewById(R.id.activity_9);
        button10 = (Button)findViewById(R.id.activity_10);
        button11= (Button)findViewById(R.id.activity_11);
        button12 = (Button)findViewById(R.id.activity_12);
        button13 = (Button)findViewById(R.id.activity_13);
        button14 = (Button)findViewById(R.id.activity_14);
        button15 = (Button)findViewById(R.id.activity_15);
        button16 = (Button)findViewById(R.id.activity_16);
        button17 = (Button)findViewById(R.id.activity_17);
        button18 = (Button)findViewById(R.id.activity_18);
        button19 = (Button)findViewById(R.id.activity_19);
        button20 = (Button)findViewById(R.id.activity_20);
        button21 = (Button)findViewById(R.id.activity_21);
        button22 = (Button)findViewById(R.id.activity_22);
        button23 = (Button)findViewById(R.id.activity_23);
        button24 = (Button)findViewById(R.id.activity_24);


        button1.setOnClickListener(button1oncliclistener);
        button2.setOnClickListener(button2oncliclistener);
        button3.setOnClickListener(button3oncliclistener);
        button4.setOnClickListener(button4oncliclistener);
        button5.setOnClickListener(button5oncliclistener);
        button6.setOnClickListener(button6oncliclistener);
        button7.setOnClickListener(button7oncliclistener);
    }
    View.OnClickListener button1oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,adapterActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener button2oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,radioActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener button3oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,checkbox.class);
            startActivity(intent);
        }
    };
    View.OnClickListener button4oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,TouchEvent.class);
            startActivity(intent);
        }
    };
    View.OnClickListener button5oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,cehua.class);
            startActivity(intent);
        }
    };
    View.OnClickListener button6oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,scroll.class);
            startActivity(intent);
        }
    };
    View.OnClickListener button7oncliclistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,xiancheng.class);
            startActivity(intent);
        }
    };
}
