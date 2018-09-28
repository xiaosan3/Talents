package com.longmingxin.talent.talents.ui.register;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {


    private ImageView register_return_button;
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

    @Override
    protected int getContentView() {
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
        register_return_button = (ImageView) findViewById(R.id.register_return_button);
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

        register_return_button.setOnClickListener(this);
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

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register_return_button:
                finish();
                break;
            case R.id.register_login:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.register_HouQu:
                break;
            case R.id.register:
                break;
            case R.id.register_Wechat:
                break;
            case R.id.register_WeiBo:
                break;
            case R.id.register_QQ:
                break;
            case R.id.register_Agreement:
            startActivity(new Intent(RegisterActivity.this,Register_AgreementActivity.class));
                break;

        }
    }

}
