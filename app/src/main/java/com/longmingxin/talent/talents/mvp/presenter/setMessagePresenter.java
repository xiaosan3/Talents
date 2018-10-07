package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.CodeBean;
import com.longmingxin.talent.talents.bean.MessageBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by 77 on 2018/8/8.
 */

public class setMessagePresenter implements Contract.IsetMessagePresenter {

    private IModel iModel;
    private Contract.IGetMessageView iGetMessageView;

    public setMessagePresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetMessageView view) {
        this.iGetMessageView = view;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void setMessage(String phone) {
        iModel.getCodeLogin(phone)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CodeBean>() {
                    @Override
                    public void accept(CodeBean codeBean) throws Exception {
                        if (codeBean.isSuccess()) {
                            iGetMessageView.showMessage(codeBean.getMessage());
                        }
                    }
                });

    }

    @Override
    public void setLogin(String phone, String vcode) {
        iModel.getQuick_Login(phone,vcode)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MessageBean>() {
                    @Override
                    public void accept(MessageBean messageBean) throws Exception {
                        if (messageBean.isSuccess()) {
                            iGetMessageView.showMessage("获取验证码成功！");
                            iGetMessageView.showIntent();
                        }else {
                            iGetMessageView.showMessage(messageBean.getMessage());
                        }
                    }
                });
    }
}
