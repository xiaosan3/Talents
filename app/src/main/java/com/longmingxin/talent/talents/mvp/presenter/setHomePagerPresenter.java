package com.longmingxin.talent.talents.mvp.presenter;


import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.HomePagerBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.IModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 77 on 2018/8/8.
 */

public class setHomePagerPresenter implements Contract.IsetHomePagePresenter {

    private IModel iModel;
    private Contract.IGetHomePagerView iGetHomePagerView;

    public setHomePagerPresenter() {
        iModel = RetrofitUtils.getInstance();

    }



    @Override
    public void attachView(Contract.IGetHomePagerView view) {
        this.iGetHomePagerView = view;
    }

    @Override
    public void detachView() {

    }
    @Override
    public void setHomePage(String token) {
        iModel.getHome(token)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomePagerBean>() {
                    @Override
                    public void accept(HomePagerBean homePagerBean) throws Exception {

                        if (homePagerBean.isSuccess()){
                            iGetHomePagerView.showHome(homePagerBean.getMessage().toString());
                            iGetHomePagerView.showIntent();
                        }else {
                            iGetHomePagerView.showHome(homePagerBean.getMessage().toString());
                        }

                    }
                });

    }

}
