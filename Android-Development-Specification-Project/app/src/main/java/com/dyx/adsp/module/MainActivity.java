package com.dyx.adsp.module;

import android.os.Bundle;
import android.widget.TextView;

import com.dyx.adsp.R;
import com.dyx.adsp.base.BaseActivity;

/**
 * project name：Android-Development-Specification-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/31 下午12:04
 * alter person：dayongxin
 * alter time：16/7/31 下午12:04
 * alter remark：
 */
public class MainActivity extends BaseActivity {
    private TextView txwMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txwMain = (TextView) findViewById(R.id.txw_main);
        /**
         * 使用通配符
         */
        String dataFormat = getResources().getString(R.string.data);
        String data = String.format(dataFormat, 100, 10.4, "2016-07-31");
        txwMain.setText(data);
        /**
         * 未完成的
         */
        //TODO
        /**
         * 功能已完成，存在效率等潜在问题
         */
        //XXX
        /**
         * 代码存在严重问题或仅用于调试
         */
        //FIXME


    }
}
