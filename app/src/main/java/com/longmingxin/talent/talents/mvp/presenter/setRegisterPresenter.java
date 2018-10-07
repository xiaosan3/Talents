package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.CodeBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setRegisterPresenter implements Contract.IsetRegisterPresenter {

    private IModel iModel;
    private Contract.IGetRegisterView iGetRegisterView;

    public setRegisterPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetRegisterView view) {
        this.iGetRegisterView = view;
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
                            iGetRegisterView.showMessage(codeBean.getMessage());
                        }
                    }
                });

    }

    @Override
    public void setRegister(String username, String passwd, String vcode) {
        if (username.isEmpty()) {
            iGetRegisterView.showMessage("用户名不能为空");
            return;
        }
        if (passwd.isEmpty()) {
            iGetRegisterView.showMessage("密码不能为空");
            return;
        }
        Observable<CodeBean> observable = iModel.getRegister(username, passwd,vcode);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CodeBean>() {
                    @Override
                    public void accept(final CodeBean codeBean) throws Exception {
                        if (codeBean.isSuccess()) {
                            iGetRegisterView.showMessage(codeBean.getMessage());
                            iGetRegisterView.showIntent();

                        } else {
                            iGetRegisterView.showMessage(codeBean.getMessage());
                        }

                    }
                });
    }
}
