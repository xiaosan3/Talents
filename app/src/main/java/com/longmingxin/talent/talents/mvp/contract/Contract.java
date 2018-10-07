package com.longmingxin.talent.talents.mvp.contract;


import com.longmingxin.talent.talents.base.BasePresenter;
import com.longmingxin.talent.talents.bean.HomePagerBean;

/**
 * Created by 77 on 2018/5/16.
 */

public interface Contract {
    //获取验证码和快捷登陆
    public interface IsetMessagePresenter extends BasePresenter<IGetMessageView> {

        void setMessage(String phone);

        void setLogin(String phone, String vcode);
    }

    public interface IGetMessageView {

        void showMessage(String message);

        void showIntent();
    }

    public interface IsetRegisterPresenter extends BasePresenter<IGetRegisterView> {
        void setMessage(String phone);

        void setRegister(String username, String passwd, String vcode);
    }

    public interface IGetRegisterView {

        void showMessage(String message);

        void showIntent();
    }

    public interface IsetResetPresenter extends BasePresenter<IGetResetView> {

        void setMessage(String phone);

        void setReset(String phone, String vcode);
    }

    public interface IGetResetView {

        void showReset(String message);

        void showIntent(String token);
    }

    public interface IsetPicturePresenter extends BasePresenter<IGetPictureView> {

        void setPicture(String phone);

        void setLogin(String username, String passwd, String vcode);
    }

    public interface IGetPictureView {

        void showMessage(String message);
        void showContent(String content);
        void showIntent();
    }

    public interface IsetResetPswPresenter extends BasePresenter<IGetResetPswView> {

        void setResetPsw(String phone, String vcode);
    }

    public interface IGetResetPswView {

        void showMessage(String message);

        void showIntent();
    }

    public interface IsetHomePagePresenter extends BasePresenter<IGetHomePagerView> {

        void setHomePage(String token);

    }
    public interface IGetHomePagerView{

        void showHome(HomePagerBean homePagerBean);

        void showIntent();
    }
}
