package com.atguigu.mtime.app;

import android.app.Application;

import com.atguigu.mtime.net.VolleyManager;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Huanzi, Xiaopei on 2016/4/9.
 */
public class MtimeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);  //初始化Fresco
        VolleyManager.getInstance(this); //初始化VolleyManager
    }
}
