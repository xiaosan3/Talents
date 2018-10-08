package com.longmingxin.talent.talents.ui.register;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setRegisterPresenter;
import com.longmingxin.talent.talents.ui.login.LoginActivity;
import com.longmingxin.talent.talents.ui.login.Login_ToActivity;

import javax.security.auth.login.LoginException;

public class RegisterActivity extends BaseActivity<setRegisterPresenter>implements View.OnClickListener,Contract.IGetRegisterView {


    private TextView register_login;
    private EditText register_phone;
    private EditText register_pwd;
    private EditText register_YanZhengMa;
    private TextView register_HouQu;
    private Button register;
    private ImageView register_Agree;
    private ImageView register_Wechat;
    private ImageView register_WeiBo;
    private ImageView register_QQ;
    private LinearLayout register_Agreement;
    private Toolbar login_toolbar;
    private int countdown = 60;

    @Override
    protected int getContentView() {
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
        register_login = (TextView) findViewById(R.id.register_login);
        register_Agreement = (LinearLayout) findViewById(R.id.register_Agreement);
        register_phone = (EditText) findViewById(R.id.register_phone);
        register_pwd = (EditText) findViewById(R.id.register_pwd);
        register_YanZhengMa = (EditText) findViewById(R.id.register_YanZhengMa);
        register_HouQu = (TextView) findViewById(R.id.register_HouQu);
        register = (Button) findViewById(R.id.register);
        register_Agree = (ImageView) findViewById(R.id.register_Agree);
        register_Wechat = (ImageView) findViewById(R.id.register_Wechat);
        register_WeiBo = (ImageView) findViewById(R.id.register_WeiBo);
        register_QQ = (ImageView) findViewById(R.id.register_QQ);
        login_toolbar = (Toolbar) findViewById(R.id.login_toolbar);
        login_toolbar.setOnClickListener(this);

        register_login.setOnClickListener(this);
        register_HouQu.setOnClickListener(this);
        register.setOnClickListener(this);
        register_Wechat.setOnClickListener(this);
        register_WeiBo.setOnClickListener(this);
        register_QQ.setOnClickListener(this);
        register_Agreement.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(login_toolbar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register_login:
                startActivity(new Intent(this, Login_ToActivity.class));
                break;
            case R.id.register_HouQu:
                presenter.setMessage(register_phone.getText().toString());
                initCount();
                break;
            case R.id.register:
                presenter.setRegister(register_phone.getText().toString(), register_pwd.getText().toString(), register_YanZhengMa.getText().toString());
                break;
            case R.id.register_Wechat:
                break;
            case R.id.register_WeiBo:
                break;
            case R.id.register_QQ:
                break;
            case R.id.register_Agreement:
                startActivity(new Intent(RegisterActivity.this, Register_AgreementActivity.class));
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
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            register_HouQu.setTextColor(Color.parseColor("#b3b3b3"));
                            register_HouQu.setText(countdown + "s");
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
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        register_HouQu.setText("获取验证码");
                        register_HouQu.setTextColor(Color.parseColor("#f39035"));
                    }
                });
            }
        }).start();
    }


    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showIntent() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
