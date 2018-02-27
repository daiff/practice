package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.bean.major;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * Created by daiff on 2018/2/9.
 * for:
 */

public class bmoblist extends Activity {
    @Bind(R.id.bmob_kong)
    Button bmobKong;
    private Integer n;

    @Bind(R.id.bmob_yt)
    Button bmobYt;
    @Bind(R.id.bomb_jt)
    Button bombJt;
    @Bind(R.id.bomb_add)
    Button bombAdd;
    @Bind(R.id.bomb_delete)
    Button bombDelete;
    @Bind(R.id.bomb_gx)
    Button bombGx;
    @Bind(R.id.bomb_search)
    Button bombSearch;
    @Bind(R.id.bmob_show)
    TextView bmobShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmob);
        ButterKnife.bind(this);
        Bmob.initialize(this, "ab8ec6ed95c785a2a470225606acee3e");
    }

    @OnClick({R.id.bmob_yt, R.id.bomb_jt, R.id.bomb_add, R.id.bomb_delete, R.id.bomb_gx, R.id.bomb_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bmob_yt:
                BmobQuery<major> query = new BmobQuery<>();
                query.addWhereEqualTo("ddd", "1");
                query.findObjects(new FindListener<major>() {
                    @Override
                    public void done(List<major> list, BmobException e) {
                        if (e == null) {
                            bmobShow.setText(list.size() + "");
                        } else {
                            show(e.getMessage());
                        }
                    }
                });
                break;
            case R.id.bomb_jt:
                major major = new major();
                major.increment("age", 2);
                major.update("objectid", new UpdateListener() {
                    @Override
                    public void done(BmobException e) {

                    }
                });
                break;
//新增
            case R.id.bomb_add:
                major m = new major();
                m.setDdd("3");
                m.setMajor("数学");
                m.save(new SaveListener<String>() {
                    @Override
                    public void done(String s, BmobException e) {
                        if (e == null) {
                            show("成功" + s.toString());
                        } else {
                            show("失败" + e.getMessage());
                        }

                    }
                });
                break;
//删除
            case R.id.bomb_delete:
                major m1 = new major();
                m1.setObjectId("be5469a7f2");
                m1.delete(new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if (e == null) {
                            show("成功");
                        } else {
                            show("失败" + e.getMessage());
                        }

                    }
                });
//更新
            case R.id.bomb_gx:
                major m3 = new major();
                m3.setDdd("4");
                m3.update("ad37ca04f0", new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if (e == null) {
                            show("成功");
                        } else {
                            show("失败" + e.getMessage());
                        }
                    }
                });
                break;
//查寻
            case R.id.bomb_search:
                BmobQuery<major> majorBmobQuery = new BmobQuery<major>();
                majorBmobQuery.getObject("xmLRVVVe", new QueryListener<major>() {

                    @Override
                    public void done(major major, BmobException e) {
                        if (e == null) {
                            bmobShow.setText("成功," + major.getDdd() + major.getMajor());
                        } else {
                            show("失败" + e.getMessage());
                        }
                    }
                });
                break;
        }
    }

    private void show(String msg) {
        Toast.makeText(bmoblist.this, msg, Toast.LENGTH_LONG).show();
    }
//置空值
    @OnClick(R.id.bmob_kong)
    public void onViewClicked() {
        major m6 = new major();
        m6.remove("ddd");
        m6.update("ad37ca04f0", new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if (e == null) {
                    bmobShow.setText("成功");
                } else {
                    show("失败" + e.getMessage());
                }
            }
        });
    }
}
