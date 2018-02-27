package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daiff on 2018/1/18.
 * for:
 */

public class xiala extends Activity implements ExpandableListView.OnChildClickListener {
    private String[] names = { "腾讯", "百度", "阿里巴巴" };

    private String[][] childnames = { { "QQ", "微信", "手机卫士" },
            { "百度地图", "百度视频", "PPS&奇艺" }, { "支付宝", "新浪微博", "高德地图" } };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.expandablelistview_activity);
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandableListView1);

        List<Map<String, String>> groupData = new ArrayList<Map<String, String>>();
        List<List<Map<String, String>>> childData = new ArrayList<List<Map<String, String>>>();

        for (int i = 0; i < names.length; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", names[i]);
            groupData.add(map);

            String[] childs = childnames[i];
            List<Map<String, String>> list = new ArrayList<Map<String, String>>();
            for (int j = 0; j < childs.length; j++) {
                Map<String, String> childMap = new HashMap<String, String>();
                childMap.put("childname", childs[j]);
                list.add(childMap);
            }
            childData.add(list);
        }

        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(
                this, groupData, R.layout.xiala_activity,
                new String[] { "name" },
                new int[] { R.id.expandable_group_textview }, childData,
                R.layout.xiala_two, new String[] { "childname" },
                new int[] { R.id.expandable_child_textview });

        expandableListView.setAdapter(adapter);
        expandableListView.setOnChildClickListener(this);
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {
        String text = names[groupPosition] + "\r\n"
                + childnames[groupPosition][childPosition];
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        return true;
    }
}
