package com.atguigu.mtime.view.base;

import android.view.View;

import com.atguigu.mtime.activity.base.BaseActivity;

/**
 * 视图基类
 * Created by Huanzi on 2016/4/7.
 */
public abstract class BasePager {
    /**数据初始化标识*/
    public boolean isDataInitiated;
    /**提供子类上下文环境*/
    public BaseActivity mActivity;
    /**返回的视图组件*/
    public View rootView;

    /**
     * 构造函数，初始化上下文，调用initView初始化视图
     * @param mActivity 上下文
     */
    public BasePager(BaseActivity mActivity) {
        this.mActivity = mActivity;
        rootView = initView();
    }

    /**
     * 交由子类实现具体视图
     * @return
     */
    public abstract View initView();
    /**
     * 初始化数据
     * @return
     */
    public abstract void initData();
}
