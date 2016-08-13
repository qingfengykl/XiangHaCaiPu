package com.kelin.xianghashipu.view.fregment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.kelin.xianghashipu.presenter.BasePresenter;
import com.kelin.xianghashipu.view.IMvpViewLifeCircle;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 20:55
 * PROJECT : XiangHaSHiPu
 */
public abstract class BaseFragment<T extends BasePresenter,V extends IMvpViewLifeCircle> extends Fragment  {

    protected T mBasePresenter;
    protected Context mContext;

    abstract T getBasePresenter();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
        mBasePresenter = getBasePresenter();
        mBasePresenter.attach((V) this);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mContext = activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mBasePresenter.detach();
    }
}
