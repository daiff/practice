package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by daiff on 2018/1/5.
 * for:
 */

public class xml extends Activity {
    private final static String TAG = "xml";
    String val;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_activity);
        text = (TextView)findViewById(R.id.xml_textview);

        //xml解析 得到xml文件的位置 这个资源具体在哪儿
        //这个东西是什么
        XmlPullParser parser = getResources().getXml(R.xml.words);
        //得到这个xml 然后可以获取他是什么类型的 这个类型是int型的
        try {
            int eventtype = parser.getEventType();
            while (eventtype != XmlPullParser.END_DOCUMENT){
                switch (eventtype) {
                    //如果是文件结束 就怎么怎么样
                    case XmlPullParser.END_DOCUMENT:
                        Log.i(TAG, "结束: " + parser.getName());
                        break;
                    //如果是文件开始 就怎么怎么样
                    case XmlPullParser.START_DOCUMENT:
                        Log.i(TAG, "开始: " + parser.getName());
                        break;
                    case XmlPullParser.START_TAG:
                        Log.i(TAG, "开始标签: " + parser.getName());
                        if (parser.getName().equals("word")){
                            val = parser.getAttributeValue(0);
                            text.setText(val);
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        break;
                }
                eventtype = parser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
