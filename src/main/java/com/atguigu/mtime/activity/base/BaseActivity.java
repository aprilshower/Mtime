package com.atguigu.mtime.activity.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Activity基类
 * Created by Huanzi,Xiaopei on 2016/4/8.
 */
public class BaseActivity extends AppCompatActivity {
    /**
     * Toast封装
     * @param msg
     */
    public void showTips(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
