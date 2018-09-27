package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.ui.activity.MainActivity;
import com.longmingxin.talent.talents.ui.register.RegisterActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private TextView login_Quick_text;
    private TextView login_Account_text;
    private EditText login_phone;
    private EditText login_Yanzhengma;
    private TextView loging_Number_of_seconds;
    private Button login_But;
    private TextView login_register;
    private ImageView login_Wechat;
    private ImageView login_WeiBo;
    private ImageView login_QQ;
    private View login_Quick_view;
    private LinearLayout login_Quick;
    private View login_Account_view;
    private LinearLayout login_Account;


    @Override
    protected int getContentView() {
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
        loging_Number_of_seconds = (TextView) findViewById(R.id.loging_Number_of_seconds);
        loging_Number_of_seconds.setOnClickListener(this);
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
            case R.id.login_But:
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                break;
            case R.id.login_register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            case R.id.login_Quick:
                break;
            case R.id.login_Account:
                startActivity(new Intent(this, Login_Account_numberActivity.class));
                break;
            //获取验证码接口
            case R.id.loging_Number_of_seconds:
                String phone = login_phone.getText().toString();
                if (phone.length() != 0) {
                    loging_Number_of_seconds.setText("正在发送..");
                    loging_Number_of_seconds.setTextColor(ContextCompat.getColor(this, R.color.colorGray));
                }
                break;
        }
    }


    private void submit() {
        // validate
        String phone = login_phone.getText().toString().trim();
        if (TextUtils.isEmpty(phone)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        String Yanzhengma = login_Yanzhengma.getText().toString().trim();
        if (TextUtils.isEmpty(Yanzhengma)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }

}
