package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

/**
 * Created by ASUS on 2018/9/26.
 *
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
    public void setRegister() {
//        Observable<Business> observable = iModel.getBusiness();
//        observable.subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<Business>() {
//                    @Override
//                    public void accept(final Business business) throws Exception {
//                        if (business.getMessage().equals("success")) {
//                            iGetRegisterView.showMessage("成功！");
//                        }
//                        iGetRegisterView.showRegister();
//
//                    }
//                });

        iGetRegisterView.showIntent();
    }
}
