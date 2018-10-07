package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.CodeBean;
import com.longmingxin.talent.talents.bean.PictureBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setPicturePresenter implements Contract.IsetPicturePresenter {

    private IModel iModel;
    private Contract.IGetPictureView iGetPictureView;

    public setPicturePresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetPictureView view) {
        this.iGetPictureView = view;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void setPicture(String phone) {
        iModel.getPicture(phone)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PictureBean>() {
                    @Override
                    public void accept(PictureBean pictureBean) throws Exception {
                        if (pictureBean.isStatus()) {
                            iGetPictureView.showMessage(pictureBean.getMessage());
                            iGetPictureView.showContent(pictureBean.getData());
                        }
                    }
                });

    }

    @Override
    public void setLogin(String username, String passwd, String vcode) {
        if (username.isEmpty()) {
            iGetPictureView.showMessage("用户名不能为空");
            return;
        }
        if (passwd.isEmpty()) {
            iGetPictureView.showMessage("密码不能为空");
            return;
        }
        Observable<CodeBean> observable = iModel.getRegister( username, passwd,vcode);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CodeBean>() {
                    @Override
                    public void accept(final CodeBean codeBean) throws Exception {
                        if (codeBean.isSuccess()) {
                            iGetPictureView.showMessage(codeBean.getMessage());
                            iGetPictureView.showIntent();

                        } else {
                            iGetPictureView.showMessage(codeBean.getMessage());
                        }

                    }
                });
    }


}
