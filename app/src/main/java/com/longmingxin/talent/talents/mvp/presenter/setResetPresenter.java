package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.CodeBean;
import com.longmingxin.talent.talents.bean.ResetPassword;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setResetPresenter implements Contract.IsetResetPresenter {

    private IModel iModel;
    private Contract.IGetResetView iGetResetView;

    public setResetPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetResetView view) {
        this.iGetResetView = view;
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
                            iGetResetView.showReset(codeBean.getMessage());
                        }
                    }
                });

    }

    @Override
    public void setReset(String phone, String vcode) {
        iModel.getReset_Password(phone,vcode)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResetPassword>() {
                    @Override
                    public void accept(ResetPassword resetPassword) throws Exception {
                        if (resetPassword.isSuccess()) {
                            iGetResetView.showIntent(resetPassword.getData().getToken());
                        }else {
                            iGetResetView.showReset(resetPassword.getMessage().toString());
                        }
                    }
                });
    }
}
