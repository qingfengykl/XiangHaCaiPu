package com.kelin.xianghashipu.model;

import com.kelin.xianghashipu.baen.LifeCircle;
import com.kelin.xianghashipu.utils.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 19:36
 * PROJECT : XiangHaSHiPu
 */
public class IMvpModelImpl implements IMvpModel, Callback<LifeCircle> {


    private OnLoadCompleteCallBack mOnLoadCompleteCallBack;

    @Override
    public void getData(int page,OnLoadCompleteCallBack onLoadCompleteCallBack) {
        mOnLoadCompleteCallBack = onLoadCompleteCallBack;
        Call<LifeCircle> lifeCircle = RetrofitService.getService().getLifeCircle(page);
        lifeCircle.enqueue(this);

    }

    @Override
    public void onResponse(Call<LifeCircle> call, Response<LifeCircle> response) {

        mOnLoadCompleteCallBack.onLoadComplete(response.body());
    }



    @Override
    public void onFailure(Call<LifeCircle> call, Throwable t) {
        mOnLoadCompleteCallBack.onLoadComplete(null);
    }


}
