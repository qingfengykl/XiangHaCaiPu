package com.kelin.xianghashipu.view;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/13
 * TIME : 0:22
 * PROJECT : XiangHaSHiPu
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
