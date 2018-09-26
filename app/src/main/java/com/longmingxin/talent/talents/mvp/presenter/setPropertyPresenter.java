package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.Property;
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

public class setPropertyPresenter implements Contract.IsetPropertyPresenter {

    private IModel iModel;
    private Contract.IGetPropertyView iGetPropertyView;

    public setPropertyPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetPropertyView view) {
        this.iGetPropertyView = view;
    }


    @Override
    public void detachView() {

    }


    @Override
    public void setProperty() {
        Observable<Property> observable = iModel.getProperty("application/x-www-form-urlencoded");
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Property>() {
                    @Override
                    public void accept(final Property property) throws Exception {
                        if (property.getCode() == 0) {
                            iGetPropertyView.showMessage("成功！");
                            //iGetPropertyView.showProperty(property);
                        } else {
                            iGetPropertyView.showMessage("请先去登录！");
                            iGetPropertyView.showIntent();
                        }

                    }
                });

    }
}
