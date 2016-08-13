package com.kelin.xianghashipu.model;

/**
 * MVP 模式的接口
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 19:27
 * PROJECT : XiangHaSHiPu
 */
public interface IMvpModel {

    void getData(int page,OnLoadCompleteCallBack onLoadCompleteCallBack);

    interface OnLoadCompleteCallBack<T>{
        void onLoadComplete(T t);
    }

}
