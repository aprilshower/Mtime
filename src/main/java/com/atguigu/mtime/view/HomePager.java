package com.atguigu.mtime.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Gallery;
import android.widget.ListView;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.atguigu.mtime.R;
import com.atguigu.mtime.activity.base.BaseActivity;
import com.atguigu.mtime.adapter.HomeGalleryAdapter;
import com.atguigu.mtime.adapter.HomePageAdapter;
import com.atguigu.mtime.entity.HomeContentBean;
import com.atguigu.mtime.net.Url;
import com.atguigu.mtime.net.VolleyManager;
import com.atguigu.mtime.view.base.BasePager;
import com.google.gson.Gson;


import java.lang.reflect.Method;

/**
 * Created by Huanzi on 2016/4/7.
 */
public class HomePager extends BasePager {
    private TabLayout tabLayout;
    /**页面选项卡*/
    private ViewPager vp_home_page;
    /**ListView内容*/
    private ListView recyler_view_home;
    private HomePageAdapter adapter;
    private HomeContentBean contentBean;

    private Gallery home_gallery;
    private HomeGalleryAdapter galleryAdapter;
    /**
     * 构造函数，初始化上下文，调用initView初始化视图
     *
     * @param mActivity 上下文
     */
    public HomePager(BaseActivity mActivity) {
        super(mActivity);
    }

    @Override
    public View initView() {
        rootView = View.inflate(mActivity, R.layout.pager_home, null);
        recyler_view_home = (ListView) rootView.findViewById(R.id.recyler_view_home);

        View header = View.inflate(mActivity, R.layout.pager_home_header, null);
        home_gallery = (Gallery) header.findViewById(R.id.home_gallery);
        recyler_view_home.addHeaderView(header);
        mActivity.showTips("首页加载了");
        return rootView;
    }

    @Override
    public void initData() {
        StringRequest request = new StringRequest(Request.Method.GET, Url.HOME_CONTENT, new Response.Listener<String>() {
            @Override
            public void onResponse(String str) {
                contentBean = new Gson().fromJson(str, HomeContentBean.class);
                adapter = new HomePageAdapter(mActivity, contentBean);
                recyler_view_home.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                mActivity.showTips("加载数据出错！");
            }
        });
        VolleyManager.getInstance(mActivity).getQueue().add(request);

    }
}
