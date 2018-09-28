package com.longmingxin.talent.talents.Utils;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.longmingxin.talent.talents.net.CodeLoginApiService;
import com.longmingxin.talent.talents.url.Urls;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by 77 on 2018/5/16.
 */

public class RetrofitUtils {
    private static CodeLoginApiService iRetorfitModel;

    private CodeLoginApiService RetrofitUtilss() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();
        //创建Retrofit对象
        //创建服务器地址
        //创建转换器工厂
        //创建服务器地址
        //创建转换器工厂
        //告诉Retrofit使用rxjava来执行网络请求
        //创建服务器地址
        //告诉Retrofit使用rxjava来执行网络请求
        return new Retrofit.Builder()
                //创建服务器地址
                .baseUrl(Urls.OTC)
                .addConverterFactory(GsonConverterFactory.create())
                //告诉Retrofit使用rxjava来执行网络请求
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()
                .create(CodeLoginApiService.class);

    }


    //用单一实例来调用这个方法
    public static CodeLoginApiService getInstance() {
        if (iRetorfitModel == null) {
            iRetorfitModel = new RetrofitUtils().RetrofitUtilss();
        }
        return iRetorfitModel;
    }
}
