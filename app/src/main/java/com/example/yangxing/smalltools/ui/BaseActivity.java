package com.example.yangxing.smalltools.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by yangxing on 2018/2/26.
 * 项目名：SmallTools.
 * 包名：com.example.yangxing.smalltools.ui.
 * 文件名：BaseActivity.
 * 描述：activity基类
 */

/**
 * 主要做的事情：
 * 1.统一的属性
 * 2.统一的接口
 * 3.统一的方法
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
