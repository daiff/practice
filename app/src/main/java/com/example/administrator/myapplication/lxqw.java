package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by daiff on 2018/2/9.
 * for:旅行青蛙套餐
 */

public class lxqw extends Activity {
    @Bind(R.id.lxqw)
    ListView lxqw;
    private List<String> Data ;
    private String mianbao;
    private String daojiu;
    private String daoju2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lxqw);
        ButterKnife.bind(this);
        data();
        ArrayAdapter<String> a = new ArrayAdapter<String>(this,R.layout.popup_text_item,R.id.zi,Data);
        lxqw.setAdapter(a);

    }
    private void data() {
        Data = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            if (i == 1) {
                mianbao = "葡萄干司康";
            } else if (i == 2) {
                mianbao = "鹅肠菜三明治";
            } else if (i == 3) {
                mianbao = "南瓜百吉饼";
            } else if (i == 4) {
                mianbao = "山蒜馅饼";
            } else if (i == 5) {
                mianbao = "艾蒿油面包";
            } else if (i == 6) {
                mianbao = "胡葱炸面包";
            }
            for (int j = 1; j <= 14; j++) {
                if (j == 1) {
                    daojiu = "幸运铃";
                } else if (j == 2) {
                    daojiu = "头巾（地）";
                } else if (j == 3) {
                    daojiu = "头巾（木）";
                } else if (j == 4) {
                    daojiu = "头巾（装）";
                } else if (j == 5) {
                    daojiu = "自然帐篷";
                } else if (j == 6) {
                    daojiu = "时尚帐篷";
                } else if (j == 7) {
                    daojiu = "高级帐篷";
                } else if (j == 8) {
                    daojiu = "透明的碗";
                } else if (j == 9) {
                    daojiu = "木碗";
                } else if (j == 10) {
                    daojiu = "漆器";
                } else if (j == 11) {
                    daojiu = "蜡烛";
                } else if (j == 12) {
                    daojiu = "手提灯笼";
                } else if (j == 13) {
                    daojiu = "提灯";
                } else if (j == 14) {
                    daojiu = "无";
                }
                for (int k = j + 1; k <= 14; k++) {
                    if (k == 1) {
                        daoju2 = "幸运铃";
                    } else if (k == 2) {
                        daoju2 = "头巾（地）";
                    } else if (k == 3) {
                        daoju2 = "头巾（木）";
                    } else if (k == 4) {
                        daoju2 = "头巾（装）";
                    } else if (k == 5) {
                        daoju2 = "自然帐篷";
                    } else if (k == 6) {
                        daoju2 = "时尚帐篷";
                    } else if (k == 7) {
                        daoju2 = "高级帐篷";
                    } else if (k == 8) {
                        daoju2 = "透明的碗";
                    } else if (k == 9) {
                        daoju2 = "木碗";
                    } else if (k == 10) {
                        daoju2 = "漆器";
                    } else if (k == 11) {
                        daoju2 = "蜡烛";
                    } else if (k == 12) {
                        daoju2 = "手提灯笼";
                    } else if (k == 13) {
                        daoju2 = "提灯";
                    } else if (k == 14) {
                        daoju2 = "无";
                    }

                    Data.add(mianbao + "     " + daojiu + "     " + daoju2);
                }
            }
        }
    }

}
