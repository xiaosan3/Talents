package com.longmingxin.talent.talents.ui.login.newfragment;


import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setMessagePresenter;
import com.longmingxin.talent.talents.ui.register.RegisterActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Quickragment extends BaseFragment<setMessagePresenter> implements View.OnClickListener,Contract.IGetMessageView {


    private EditText login_phone;
    private EditText login_Yanzhengma;
    private TextView loging_seconds;
    private Button login_But;
    private TextView login_register;
    private ImageView login_Wechat;
    private ImageView login_WeiBo;
    private ImageView login_QQ;
    private int countdown = 60;


    public Quickragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_quickragment;
    }

    @Override
    protected void initView(View view) {
        login_phone = view.findViewById(R.id.login_phone);
        login_Yanzhengma = view.findViewById(R.id.login_Yanzhengma);
        loging_seconds = view.findViewById(R.id.loging_seconds);
        loging_seconds.setOnClickListener(this);
        login_But = view.findViewById(R.id.login_But);
        login_But.setOnClickListener(this);
        login_register = view.findViewById(R.id.login_register);
        login_register.setOnClickListener(this);
        login_Wechat = view.findViewById(R.id.login_Wechat);
        login_Wechat.setOnClickListener(this);
        login_WeiBo = view.findViewById(R.id.login_WeiBo);
        login_WeiBo.setOnClickListener(this);
        login_QQ = view.findViewById(R.id.login_Wechat);
        login_QQ.setOnClickListener(this);



    }

    @Override
    protected void initData(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
           //获取验证码接口
            case R.id.loging_seconds:
                presenter.setMessage(login_phone.getText().toString().trim());
                initCount();
                break;

            case R.id.login_But:
                presenter.setLogin(login_phone.getText().toString().trim(),login_Yanzhengma.getText().toString().trim());
                break;

            case R.id.login_register:
                startActivity(new Intent(getActivity(), RegisterActivity.class));
                break;
            case R.id.login_Wechat:
                break;

            case R.id.login_WeiBo:
                break;

            case R.id.login_QQ:
                break;
        }
    }

    private void initCount() {
        //数字倒计时
        new Thread(new Runnable() {
            @Override
            public void run() {
                //倒计时开始，循环
                while (countdown > 0) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            loging_seconds.setTextColor(Color.parseColor("#b3b3b3"));
                            loging_seconds.setText(loging_seconds + "s");
                        }
                    });
                    try {
                        Thread.sleep(1000); //强制线程休眠1秒，就是设置倒计时的间隔时间为1秒。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countdown--;
                }
                //倒计时结束
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        loging_seconds.setText("获取验证码");
                        loging_seconds.setTextColor(Color.parseColor("#f39035"));
                    }
                });
            }
        }).start();
    }


    @Override
    public void showMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showIntent() {

    }
}
