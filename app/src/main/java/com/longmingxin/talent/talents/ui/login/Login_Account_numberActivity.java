package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;

public class Login_Account_numberActivity extends BaseActivity implements View.OnClickListener {


    private LinearLayout account_Quick;
    private EditText account_userName;
    private EditText account_userPassWord;
    private EditText account_userYanZhengMa;
    private TextView loging_Number_of_seconds;
    private Button account_But;
    private TextView account_Forget;
    private TextView account_register;
    private ImageView account_Wechat;
    private ImageView account_WeiBo;
    private ImageView account_QQ;

    @Override
    protected int getContentView() {
        return R.layout.activity_login__account_number;
    }

    @Override
    protected void initView() {
        account_Quick = (LinearLayout) findViewById(R.id.account_Quick);
        account_userName = (EditText) findViewById(R.id.account_userName);
        account_userPassWord = (EditText) findViewById(R.id.account_userPassWord);
        account_userYanZhengMa = (EditText) findViewById(R.id.account_userYanZhengMa);
        loging_Number_of_seconds = (TextView) findViewById(R.id.loging_Number_of_seconds);
        account_But = (Button) findViewById(R.id.account_But);
        account_Forget = (TextView) findViewById(R.id.account_Forget);
        account_register = (TextView) findViewById(R.id.account_register);
        account_Wechat = (ImageView) findViewById(R.id.account_Wechat);
        account_WeiBo = (ImageView) findViewById(R.id.account_WeiBo);
        account_QQ = (ImageView) findViewById(R.id.account_QQ);

        account_Quick.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.account_Quick:
                startActivity(new Intent(this,Login_Account_numberActivity.class));
                break;
        }

    }
}
