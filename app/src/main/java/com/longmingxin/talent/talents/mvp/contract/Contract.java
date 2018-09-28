package com.longmingxin.talent.talents.mvp.contract;


import com.longmingxin.talent.talents.base.BaseView;

/**
 * Created by ASUS on 2018/9/26.
 *
 */

public interface Contract {

    //获取验证码
    public interface ICodeLoginPresenter {
        void setCode(String phone);
    }
    interface ICodeLoginView<ICodeLoginPresenter>extends BaseView<ICodeLoginPresenter>{
        void getCodeLogin();
    }
    interface ICodeModle{
        void setCode(String phone);
    }
}
