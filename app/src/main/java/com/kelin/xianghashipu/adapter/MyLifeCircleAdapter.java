package com.kelin.xianghashipu.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.kelin.xianghashipu.BR;
import com.kelin.xianghashipu.R;
import com.kelin.xianghashipu.baen.LifeCircle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 23:22
 * PROJECT : XiangHaSHiPu
 */
public class MyLifeCircleAdapter extends BaseAdapter {

    private List<LifeCircle.DataBean> mList = new ArrayList<>();

    public void addAll(List<LifeCircle.DataBean> list) {
        mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public LifeCircle.DataBean getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getImgs().size() > 2 ? 0 : 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding banding;
        LifeCircle.DataBean item = getItem(position);

        if (convertView == null) {
            switch (getItemViewType(position)) {
                case 1:
                    banding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.life_circle_item_img_2, parent, false);
                    break;
                default:
                    banding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.life_circle_item_img_3, parent, false);
            }
        } else {
            banding = DataBindingUtil.bind(convertView);
        }
        banding.setVariable(BR.bean, item);

        return banding.getRoot();
    }
}
