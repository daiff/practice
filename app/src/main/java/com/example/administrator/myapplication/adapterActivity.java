package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by daiff on 2018/1/3.
 * for:适配器的简单应用
 */

public class adapterActivity extends Activity{
    private String[] s = {"1","2","3","1","2","3","1","2","3","1","2","3","1","2","3","1","2","3","1","2","3","1","2","3","1","2","3",};
    private  ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapteractivity);
        listview = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> a = new ArrayAdapter<String>(this,R.layout.list_adapteractivity,R.id.list_item_1,s);
       listview.setAdapter(a);

    }
}
