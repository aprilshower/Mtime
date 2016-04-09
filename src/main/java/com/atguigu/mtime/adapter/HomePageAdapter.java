package com.atguigu.mtime.adapter;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtime.R;
import com.atguigu.mtime.activity.base.BaseActivity;
import com.atguigu.mtime.entity.HomeContentBean;
import com.atguigu.mtime.entity.HomeHotMovieBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Huanzi, Xiaopei on 2016/4/8.
 */
public class HomePageAdapter extends BaseAdapter{
    private BaseActivity activity;
    private HomeContentBean entity;
    private List<HomeContentBean.DataBean> dataList;

    public HomePageAdapter(BaseActivity activity, HomeContentBean entity) {
        this.activity = activity;
        this.entity = entity;
        this.dataList = entity.getData();
    }

    @Override
    public int getCount() {
        return dataList == null ? 0 : dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = View.inflate(activity, R.layout.pager_home_content, null);

            holder.tv_home_item_title = (TextView) convertView.findViewById(R.id.tv_home_item_title);
            holder.tv_home_item_subtitle = (TextView) convertView.findViewById(R.id.tv_home_item_subtitle);
            holder.tv_home_item_time = (TextView) convertView.findViewById(R.id.tv_home_item_time);
            holder.tv_home_item_comment = (TextView) convertView.findViewById(R.id.tv_home_item_comment);
            holder.iv_home_item_thumbnail = (SimpleDraweeView) convertView.findViewById(R.id.iv_home_item_thumbnail);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        setData(holder, position);
        return convertView;
    }

    public void setData(ViewHolder holder, int position){

        holder.tv_home_item_title.setText(dataList.get(position).getTitle());   //设置标题
        holder.tv_home_item_subtitle.setText(dataList.get(position).getContent());  //设置内容
        //holder.tv_home_item_time.setText(dataList.get(position).getPublishTime());  //设置发布时间
        //holder.tv_home_item_comment.setText(dataList.get(position).getCommentCount()); //设置评论数
        String url = "http://uus-img6.android.d.cn/content_pic/201603/behpic/icon/629/2-69629/icon-1458809775520.png";
        if(dataList.get(position).getImg1() != null){
            url = dataList.get(position).getImg1();
        }
        Uri uri = Uri.parse(url);
        //holder.iv_home_item_thumbnail.setText(dataList.get(position).getCommentCount()); //设置图片
        holder.iv_home_item_thumbnail.setImageURI(uri);
    }

    static class ViewHolder{
        public TextView tv_home_item_title;
        public TextView tv_home_item_subtitle;
        public TextView tv_home_item_time;
        public TextView tv_home_item_comment;
        public SimpleDraweeView iv_home_item_thumbnail;
    }
}
