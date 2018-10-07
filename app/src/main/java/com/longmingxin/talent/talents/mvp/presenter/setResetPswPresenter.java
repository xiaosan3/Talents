package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.MessageBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setResetPswPresenter implements Contract.IsetResetPswPresenter {

    private IModel iModel;
    private Contract.IGetResetPswView iGetResetPswView;

    public setResetPswPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetResetPswView view) {
        this.iGetResetPswView = view;
    }

    @Override
    public void detachView() {

    }


    @Override
    public void setResetPsw(String phone, String tooken) {
        iModel.getPassword(phone,tooken)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MessageBean>() {
                    @Override
                    public void accept(MessageBean messageBean) throws Exception {
                        if (messageBean.isSuccess()) {
                            iGetResetPswView.showMessage(messageBean.getMessage());
                            iGetResetPswView.showIntent();
                        }else {
                            iGetResetPswView.showMessage(messageBean.getMessage());
                        }
                    }
                });
    }

}
