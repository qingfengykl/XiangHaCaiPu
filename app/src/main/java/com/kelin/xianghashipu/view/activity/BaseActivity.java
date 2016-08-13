package com.kelin.xianghashipu.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kelin.xianghashipu.presenter.BasePresenter;
import com.kelin.xianghashipu.view.IMvpViewLifeCircle;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 19:29
 * PROJECT : XiangHaSHiPu
 */
public abstract class BaseActivity<T extends BasePresenter,V extends IMvpViewLifeCircle> extends AppCompatActivity{

    protected T mBasePresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBasePresenter = getBasePresenter();
        mBasePresenter.attach((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBasePresenter.detach();
    }

    abstract T getBasePresenter();

}
