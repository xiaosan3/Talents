package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.mvp.presenter.setMessagePresenter;
import com.longmingxin.talent.talents.ui.activity.MainActivity;
import com.longmingxin.talent.talents.ui.fragments.LearningAbilityFragment;
import com.longmingxin.talent.talents.ui.register.RegisterActivity;

public class LoginActivity extends BaseActivity<setMessagePresenter> implements View.OnClickListener,com.longmingxin.talent.talents.mvp.contract.Contract.IGetMessageView {

    private TextView login_Quick_text;
    private TextView login_Account_text;
    private EditText login_phone;
    private EditText login_Yanzhengma;
    private TextView loging_seconds;
    private Button login_But;
    private TextView login_register;
    private ImageView login_Wechat;
    private ImageView login_WeiBo;
    private ImageView login_QQ;
    private View login_Quick_view;
    private LinearLayout login_Quick;
    private View login_Account_view;
    private LinearLayout login_Account;
    private String phone;
    private int countdown = 60;


    @Override
    protected int getContentView() {
        SharedPreferences sp = getSharedPreferences("sp", 0);
        String string = sp.getString("1", "1");
        if (string.equals("1")){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

        login_But = (Button) findViewById(R.id.login_But);
        login_But.setOnClickListener(this);
        login_Quick_text = (TextView) findViewById(R.id.login_Quick_text);
        login_Account_text = (TextView) findViewById(R.id.login_Account_text);
        login_phone = (EditText) findViewById(R.id.login_phone);
        login_phone.setOnClickListener(this);
        login_Yanzhengma = (EditText) findViewById(R.id.login_Yanzhengma);
        login_Yanzhengma.setOnClickListener(this);
        loging_seconds = (TextView) findViewById(R.id.loging_seconds);
        loging_seconds.setOnClickListener(this);
        login_register = (TextView) findViewById(R.id.login_register);
        login_register.setOnClickListener(this);
        login_Wechat = (ImageView) findViewById(R.id.login_Wechat);
        login_Wechat.setOnClickListener(this);
        login_WeiBo = (ImageView) findViewById(R.id.login_WeiBo);
        login_WeiBo.setOnClickListener(this);
        login_QQ = (ImageView) findViewById(R.id.login_QQ);
        login_QQ.setOnClickListener(this);
        login_Quick_view = (View) findViewById(R.id.login_Quick_view);
        login_Account_view = (View) findViewById(R.id.login_Account_view);
        login_Quick = (LinearLayout) findViewById(R.id.login_Quick);
        login_Quick.setOnClickListener(this);
        login_Account = (LinearLayout) findViewById(R.id.login_Account);
        login_Account.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            case R.id.login_Quick:
                break;
            case R.id.login_Account:
                startActivity(new Intent(this, LearningAbilityFragment.Login_Account_numberActivity.class));
                break;
            //获取验证码接口
            case R.id.loging_seconds:
                presenter.setMessage(login_phone.getText().toString().trim());
                initCount();
                break;

            case R.id.login_But:
                presenter.setLogin(login_phone.getText().toString().trim(),login_Yanzhengma.getText().toString().trim());
                break;
            case R.id.login_QQ:
                startActivity(new Intent(this,Login_ToActivity.class));
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
                            loging_seconds.setTextColor(Color.parseColor("#b3b3b3"));
                            loging_seconds.setText(countdown + "s");
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
                        loging_seconds.setText("获取验证码");
                        loging_seconds.setTextColor(Color.parseColor("#f39035"));
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
        SharedPreferences sp = getSharedPreferences("sp", 0);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("1","");
        edit.commit();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
