package com.longmingxin.talent.talents.mvp.presenter;

import android.util.Log;
import com.longmingxin.talent.talents.Utils.RetrofitUtils;
import com.longmingxin.talent.talents.bean.CodeBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.model.CodeLoginModleImpl;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ASUS on 2018/9/27.
 */

public class CodeLoginPresenter implements Contract.ICodeLoginPresenter {
    private  Contract.ICodeLoginView iCodeLoginView;
    private final CodeLoginModleImpl codeLoginModle;

    public CodeLoginPresenter(Contract.ICodeLoginView iCodeLoginView) {
        this.iCodeLoginView = iCodeLoginView;
        iCodeLoginView.setPresenter(this);
        codeLoginModle = new CodeLoginModleImpl();
    }

    @Override
    public void setCode(String phone) {
        RetrofitUtils.getInstance().getCodeLogin(phone)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CodeBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull CodeBean codeBean) {
                        Log.e("TAG",codeBean.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


}
