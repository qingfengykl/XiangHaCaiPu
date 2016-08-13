package com.kelin.xianghashipu.presenter;

import com.kelin.xianghashipu.baen.LifeCircle;
import com.kelin.xianghashipu.model.IMvpModel;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 19:49
 * PROJECT : XiangHaSHiPu
 */
public class LifeCirclePresenter extends BasePresenter {

    public void loadData(int page) {
        getIMvpModel().getData(page,new IMvpModel.OnLoadCompleteCallBack<LifeCircle>() {
            @Override
            public void onLoadComplete(LifeCircle dataBeen) {
                getIMvpView().showData(dataBeen);
            }
        });
    }


}
