package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.Business;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setBusinessPresenter implements Contract.IsetBusinessPresenter {

    private IModel iModel;
    private Contract.IGetBusinessView iGetBusinessView;

    public setBusinessPresenter() {
        iModel = RetrofitUtils.getInstance();
    }


    @Override
    public void attachView(Contract.IGetBusinessView view) {
        this.iGetBusinessView = view;
    }

    @Override
    public void detachView() {

    }


    @Override
    public void setBusiness(String advertiseType, String isCertified, String unit, String coinType, String paymentType) {
        Observable<Business> observable = iModel.getBusiness("application/x-www-form-urlencoded", advertiseType, isCertified, unit, coinType, paymentType);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Business>() {
                    @Override
                    public void accept(final Business business) throws Exception {
                        if (business.getMessage().equals("success")) {
                            iGetBusinessView.showMessage("成功！");
                        }
                        iGetBusinessView.showBusiness(business);

                    }
                });
    }
}
