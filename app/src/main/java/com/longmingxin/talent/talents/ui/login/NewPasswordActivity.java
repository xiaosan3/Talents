package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setResetPswPresenter;

public class NewPasswordActivity extends BaseActivity<setResetPswPresenter> implements View.OnClickListener,Contract.IGetResetPswView{


    private ImageView password_return_button;
    private EditText password_userName;
    private EditText password_userYanZhengMa;
    private Button password_But;
    private ImageView password_Wechat;
    private ImageView password_WeiBo;
    private ImageView password_QQ;
    private String token;

    @Override
    protected int getContentView() {
        return R.layout.activity_new_password;
    }

    @Override
    protected void initView() {
        password_return_button = (ImageView) findViewById(R.id.password_return_button);
        password_userName = (EditText) findViewById(R.id.password_userName);
        password_userYanZhengMa = (EditText) findViewById(R.id.password_userYanZhengMa);
        password_But = (Button) findViewById(R.id.password_But);
        password_Wechat = (ImageView) findViewById(R.id.password_Wechat);
        password_WeiBo = (ImageView) findViewById(R.id.password_WeiBo);
        password_QQ = (ImageView) findViewById(R.id.password_QQ);

        password_return_button.setOnClickListener(this);
        password_But.setOnClickListener(this);
        password_Wechat.setOnClickListener(this);
        password_WeiBo.setOnClickListener(this);
        password_QQ.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        token = getIntent().getStringExtra("token");
    }

    @Override
    protected void initToolBar() {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.password_return_button:
                finish();
                break;
            case R.id.password_But:
                presenter.setResetPsw(password_userName.getText().toString().trim(),token);
                break;
            case R.id.password_Wechat:
                break;
            case R.id.password_WeiBo:
                break;
            case R.id.password_QQ:
                break;
        }

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showIntent() {
        startActivity(new Intent(this,Login_Account_numberActivity.class));

    }
}
