package com.kelin.xianghashipu.view;

/**
 * MVP模式的 VIEW 接口
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 19:25
 * PROJECT : XiangHaSHiPu
 */
public interface IMvpViewLifeCircle<T> extends IMvpBaseView{

    void showData(T t);

}
