package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;

public class Account_ForgetActivity extends BaseActivity implements View.OnClickListener{


    private ImageView forget_return_button;
    private EditText forget_userName;
    private EditText forget_userYanZhengMa;
    private TextView forget_Number_of_seconds;
    private Button forget_But;
    private ImageView forget_Wechat;
    private ImageView forget_WeiBo;
    private ImageView forget_QQ;

    @Override
    protected int getContentView() {
        return R.layout.activity_account__forget;
    }

    @Override
    protected void initView() {
        forget_return_button = (ImageView) findViewById(R.id.forget_return_button);
        forget_userName = (EditText) findViewById(R.id.forget_userName);
        forget_userYanZhengMa = (EditText) findViewById(R.id.forget_userYanZhengMa);
        forget_Number_of_seconds = (TextView) findViewById(R.id.forget_Number_of_seconds);
        forget_But = (Button) findViewById(R.id.forget_But);
        forget_Wechat = (ImageView) findViewById(R.id.forget_Wechat);
        forget_WeiBo = (ImageView) findViewById(R.id.forget_WeiBo);
        forget_QQ = (ImageView) findViewById(R.id.forget_QQ);

        forget_return_button.setOnClickListener(this);
        forget_Number_of_seconds.setOnClickListener(this);
        forget_But.setOnClickListener(this);
        forget_Wechat.setOnClickListener(this);
        forget_WeiBo.setOnClickListener(this);
        forget_QQ.setOnClickListener(this);
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
            case R.id.forget_return_button:
                finish();
                break;
            case R.id.forget_Number_of_seconds:
                break;
            case R.id.forget_But:
                startActivity(new Intent(this,NewPasswordActivity.class));
                break;
            case R.id.forget_Wechat:
                break;
            case R.id.forget_WeiBo:
                break;
            case R.id.forget_QQ:
                break;
        }
    }
}
