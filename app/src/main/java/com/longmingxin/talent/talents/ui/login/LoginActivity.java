package com.longmingxin.talent.talents.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.ui.activity.MainActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener {


//    private Toolbar m_toolbar;
    private Button login;

    @Override
    protected int getContentView() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                break;
        }
    }
}
