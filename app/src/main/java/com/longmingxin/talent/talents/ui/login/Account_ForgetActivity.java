package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setResetPresenter;

public class Account_ForgetActivity extends BaseActivity<setResetPresenter> implements View.OnClickListener, Contract.IGetResetView {


    private EditText forget_userName;
    private EditText forget_userYanZhengMa;
    private TextView forget_Number_of_seconds;
    private Button forget_But;
    private Toolbar forget_toolbar;

    @Override
    protected int getContentView() {
        return R.layout.activity_account__forget;
    }

    @Override
    protected void initView() {
        forget_userName = (EditText) findViewById(R.id.forget_userName);
        forget_userYanZhengMa = (EditText) findViewById(R.id.forget_userYanZhengMa);
        forget_Number_of_seconds = (TextView) findViewById(R.id.forget_Number_of_seconds);
        forget_But = (Button) findViewById(R.id.forget_But);
        forget_toolbar = (Toolbar) findViewById(R.id.forget_toolbar);

        forget_toolbar.setOnClickListener(this);
        forget_Number_of_seconds.setOnClickListener(this);
        forget_But.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(forget_toolbar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.forget_Number_of_seconds:
                presenter.setMessage(forget_userName.getText().toString());
                break;
            case R.id.forget_But:
                presenter.setReset(forget_userName.getText().toString(), forget_userYanZhengMa.getText().toString());
                break;

        }
    }


    @Override
    public void showReset(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showIntent(String token) {
        Intent intent = new Intent(Account_ForgetActivity.this, NewPasswordActivity.class);
        intent.putExtra("token", token);
        Log.e("TAG",token);
        startActivity(intent);
    }

}
