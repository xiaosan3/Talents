package com.longmingxin.talent.talents.mvp.model;

import com.longmingxin.talent.talents.bean.CodeBean;
import com.longmingxin.talent.talents.bean.HomePagerBean;
import com.longmingxin.talent.talents.bean.Login_Data;
import com.longmingxin.talent.talents.bean.MessageBean;
import com.longmingxin.talent.talents.bean.PictureBean;
import com.longmingxin.talent.talents.bean.ResetPassword;
import com.longmingxin.talent.talents.url.Urls;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface IModel {

    //发送短信验证
    @GET(Urls.SEND_CODE)
    Observable<CodeBean> getCodeLogin(@Query("mobi")String mobi);

    //注册
    @FormUrlEncoded
    @POST(Urls.REGISTER)
    Observable<CodeBean> getRegister(@Field("mobi") String mobi, @Field("passwd") String password, @Field("vcode") String vcode);

    //发送图片验证码
    @GET(Urls.PICTURE)
    Observable<PictureBean> getPicture(@Query("account") String account);

    //快捷登录
    @GET(Urls.QUICK_LOGIN)
    Observable<Login_Data> getQuick_Login(@Query("mobi") String mobi, @Query("vcode") String vcode);

    //重置密码
    @PUT(Urls.RESET_PASSWORD)
    Observable<ResetPassword> getReset_Password(@Query("mobi") String mobi, @Query("vcode") String vcode);

    //确认密码
    @PUT(Urls.PASSWORD)
    Observable<MessageBean> getPassword(@Query("npasswd") String password, @Header("token") String tooken);

    //首页
    @GET(Urls.HOME)
    Observable<HomePagerBean> getHome(@Header("token") String token);

  //首页图片
    //@GET(Urls.HOME_PICTURE)
   // Observable<ResponseBody> getHome_picture



}
