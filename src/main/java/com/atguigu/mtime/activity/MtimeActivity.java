package com.atguigu.mtime.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.atguigu.mtime.R;
import com.atguigu.mtime.activity.base.BaseActivity;
import com.atguigu.mtime.view.HomePager;
import com.atguigu.mtime.view.base.BasePager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 程序主界面
 * @author Huanzi, Xiaopei 2016.04.08
 */
public class MtimeActivity extends BaseActivity {
    /**Fragment动态填充FrameLayout组件*/
    private FrameLayout fl_main_container;
    /**底部导航RadioGroup组件*/
    private RadioGroup rg_main_navbar;
    /**分页视图集合*/
    private Map<Integer, BasePager> pagers;
    /**
     * 每个页面标识
     */
    private static final int HOME_PAGE = 0;
    private static final int LIVE_PAGE = 1;
    private static final int VIP_PAGE = 2;
    private static final int FIND_PAGE = 3;
    private static final int USER_PAGE = 4;
    /**当前页面标识, 默认为HomePage*/
    private int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtime);

        initView();
    }
    /**
     * 初始化视图
     */
    public void initView(){
        fl_main_container = (FrameLayout) findViewById(R.id.fl_main_container);
        rg_main_navbar = (RadioGroup) findViewById(R.id.rg_main_navbar);
        rg_main_navbar.setOnCheckedChangeListener(switchPageListener);
        rg_main_navbar.check(R.id.rb_main_home);    //默认选中首页

        pagers = new HashMap<Integer, BasePager>();

        BasePager home = new HomePager(this);

        pagers.put(HOME_PAGE, home);
    }
    /**
     * 切换页面监听器
     */
    private RadioGroup.OnCheckedChangeListener switchPageListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int id) {
            switch (id){
                case R.id.rb_main_home:
                    currentPage = HOME_PAGE;
                    break;
            }
            switchPage();
        }
    };

    /**
     * 切换页面并加载数据
     */
    private void switchPage() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_main_container, new Fragment(){
            @Nullable
            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                BasePager pager = getPager();
                if (!pager.isDataInitiated){
                    pager.initData();
                    pager.isDataInitiated = true;  // 首次加载数据后设置标识符，防止每次切换切面重新加载数据
                }
                return pager.rootView;
            }
        });
        transaction.commit();
    }

    /**
     * 获取对应页面
     */
    public BasePager getPager(){
        return pagers.get(currentPage);
    }
}
