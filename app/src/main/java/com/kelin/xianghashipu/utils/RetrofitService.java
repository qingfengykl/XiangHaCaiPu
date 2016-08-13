package com.kelin.xianghashipu.utils;

import com.kelin.xianghashipu.baen.LifeCircle;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created with Android Studio
 * User : kelin
 * Date : 2016/8/12
 * TIME : 20:19
 * PROJECT : XiangHaSHiPu
 */
public class RetrofitService {

    private static Service sService;

    public static Service getService() {
        return sService;
    }

    static {
        sService = new Retrofit.Builder().baseUrl(Contents.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Service.class);
    }

    public interface Service{

        @GET(Contents.LifeCircle)
        Call<LifeCircle> getLifeCircle(@Query("page") int page);

    }

}
