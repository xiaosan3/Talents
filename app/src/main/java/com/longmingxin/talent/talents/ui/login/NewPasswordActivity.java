package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.sharedpreferences.SharedPreferencesUtils;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setResetPswPresenter;
import com.longmingxin.talent.talents.ui.fragments.LearningAbilityFragment;

public class NewPasswordActivity extends BaseActivity<setResetPswPresenter> implements View.OnClickListener, Contract.IGetResetPswView {


    private EditText password_userName;
    private EditText password_userYanZhengMa;
    private Button password_But;
    private Toolbar pwd_toolbar;

    @Override
    protected int getContentView() {
        return R.layout.activity_new_password;
    }

    @Override
    protected void initView() {
        password_userName = (EditText) findViewById(R.id.password_userName);
        password_userYanZhengMa = (EditText) findViewById(R.id.password_userYanZhengMa);
        password_But = (Button) findViewById(R.id.password_But);
        pwd_toolbar = (Toolbar) findViewById(R.id.pwd_toolbar);

        pwd_toolbar.setOnClickListener(this);
        password_But.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(pwd_toolbar);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pwd_toolbar:
                break;
            case R.id.password_But:
                String token = SharedPreferencesUtils.getInstance().getSharedPreferencesString("token");
                Log.e("TAG",token);
                presenter.setResetPsw(password_userName.getText().toString().trim(),token);
                break;
        }

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showIntent() {
        startActivity(new Intent(this, LearningAbilityFragment.Login_Account_numberActivity.class));

    }

}
