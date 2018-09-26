package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.Login;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ASUS on 2018/9/26.
 *
 */

public class setLoginPresenter implements Contract.IsetLoginPresenter {

    private IModel iModel;
    private Contract.IGetLoginView iGetLoginView;

    public setLoginPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetLoginView view) {
        this.iGetLoginView = view;
    }

    @Override
    public void detachView() {

    }


    @Override
    public void setLogin(String userName, String password) {
        if (userName.equals("")) {
            iGetLoginView.showMessage("用户名不能为空");
            return;
        }
        if (password.equals("")) {
            iGetLoginView.showMessage("密码不能为空");
            return;
        }

        Observable<Login> observable = iModel.getLogin("application/x-www-form-urlencoded", userName, password);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Login>() {
                    @Override
                    public void accept(final Login login) throws Exception {
                        if (login.getMessage().equals("success")) {
                            iGetLoginView.showMessage("成功！");
                            //iGetLoginView.showLogin(login);
                            iGetLoginView.showIntent();

                        } else {
                            iGetLoginView.showMessage("用户名或者密码错误");
                        }

                    }
                });

    }
}
