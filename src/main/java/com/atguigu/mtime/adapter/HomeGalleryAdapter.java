package com.atguigu.mtime.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.atguigu.mtime.activity.base.BaseActivity;
import com.atguigu.mtime.entity.HomeHotMovieBean;

import java.util.List;

/**
 * Created by Huanzi, Xiaopei on 2016/4/9.
 */
public class HomeGalleryAdapter extends BaseAdapter{
    private BaseActivity activity;
    private HomeHotMovieBean hotMovieBean;
    private List<HomeHotMovieBean.MoviesBean> moviesBean;

    public HomeGalleryAdapter(BaseActivity activity, HomeHotMovieBean hotMovieBean) {
        this.activity = activity;
        this.hotMovieBean = hotMovieBean;
        moviesBean = hotMovieBean.getMovies();
    }

    @Override
    public int getCount() {
        return moviesBean == null ? 0 : moviesBean.size();
    }

    @Override
    public Object getItem(int position) {
        return moviesBean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(convertview == null){
            //convertview = View.inflate()
        }
        return null;
    }

    static class ViewHolder{

    }
}
