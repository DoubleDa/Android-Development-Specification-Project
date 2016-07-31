package com.dyx.adsp.library;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.dyx.adsp.library.beans.TestObject;

/**
 * project name：Android-Development-Specification-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/31 上午11:51
 * alter person：dayongxin
 * alter time：16/7/31 上午11:51
 * alter remark：
 */
public class TestActivity extends Activity {
    public static final String TAG_MY_ACTIVITY = "tag_my_activity";
    //全局名称
    private Button mBtnTest;
    private TestObject mTestObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        //局部名称
        Button btnTest = new Button(this);

    }
}
