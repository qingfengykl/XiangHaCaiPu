package com.kelin.xianghashipu.presenter;

import com.kelin.xianghashipu.model.IMvpModel;
import com.kelin.xianghashipu.model.IMvpModelImpl;
import com.kelin.xianghashipu.view.IMvpViewLifeCircle;

import java.lang.ref.WeakReference;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 19:29
 * PROJECT : XiangHaSHiPu
 */
public class BasePresenter<T extends IMvpViewLifeCircle> {

    protected IMvpModel mIMvpModel;
    protected WeakReference<T> mViewReference;

    public IMvpModel getIMvpModel() {
        return mIMvpModel;
    }

    public void attach(T t){
        mViewReference = new WeakReference<T>(t);
    }

    public void detach(){
        if (mViewReference != null) {
            mViewReference.clear();
            mViewReference = null;
        }
    }

    public BasePresenter() {
        mIMvpModel = new IMvpModelImpl();
    }

    public void setModel(IMvpModel iMvpModel){
        this.mIMvpModel = iMvpModel;
    }

    public IMvpViewLifeCircle getIMvpView() {
        return mViewReference.get();
    }







}
