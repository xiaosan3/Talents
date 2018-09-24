package com.longmingxin.talent.talents.ui.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.ui.login.LoginActivity;

public class StartpageActivity extends BaseActivity implements View.OnClickListener{


    private TextView skip;
    private int seconds = 0;

    @Override
    protected int getContentView() {
        initSeconds();
        return R.layout.activity_startpage;
    }

    private void initSeconds() {
        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(StartpageActivity.this, LoginActivity.class));
            }
        }.start();


    }

    @Override
    protected void initView() {
        skip = (TextView) findViewById(R.id.skip);
        skip.setOnClickListener(this);

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
            case R.id.skip:
                startActivity(new Intent(StartpageActivity.this,LoginActivity.class));
                finish();
                break;
        }

    }
}
