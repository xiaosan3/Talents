package com.longmingxin.talent.talents.net;

import com.longmingxin.talent.talents.bean.CodeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ASUS on 2018/9/27.
 */

public interface CodeLoginApiService {
    public static final String LOGING_CODE="/lmx/sendVerificationSms";
    @GET(LOGING_CODE)
    Observable<CodeBean>getCodeLogin(@Query("mobi")String mobi);
}
