package com.longmingxin.talent.talents.ui.login;

import android.graphics.Color;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.ui.login.newfragment.Account_numberFragment;
import com.longmingxin.talent.talents.ui.login.newfragment.Quickragment;

public class Login_ToActivity extends BaseActivity implements View.OnClickListener {
    private TextView login_Quick_text;
    private View login_Quick_buttom;
    private RelativeLayout login_Quick_rl;
    private TextView login_Account_text;
    private View login_Account_buttom;
    private RelativeLayout login_Account_rl;
    private FrameLayout login_fragment;
    private LinearLayout activity_login__to;
    private Toolbar login_mtoolbar;

    @Override
    protected int getContentView() {

        return R.layout.activity_login__to;

    }

    @Override
    protected void initView() {
        login_Quick_text = (TextView) findViewById(R.id.login_Quick_text);
        login_Account_text = (TextView) findViewById(R.id.login_Account_text);
        login_Quick_buttom = (View) findViewById(R.id.login_Quick_buttom);
        login_Account_buttom = (View) findViewById(R.id.login_Account_buttom);
        login_Quick_rl = (RelativeLayout) findViewById(R.id.login_Quick_rl);
        login_Account_rl = (RelativeLayout) findViewById(R.id.login_Account_rl);
        login_fragment = (FrameLayout) findViewById(R.id.login_fragment);
        login_mtoolbar = (Toolbar) findViewById(R.id.login_mtoolbar);
        login_mtoolbar.setOnClickListener(this);
        login_Quick_rl.setOnClickListener(this);
        login_Account_rl.setOnClickListener(this);

    }

    @Override
    protected void initData() {


        setContentView(Quickragment.class, R.id.login_fragment);

        login_Quick_buttom.setVisibility(View.VISIBLE);
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(login_mtoolbar);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_Quick_rl:
                //快捷登录
                login_Quick_buttom.setVisibility(View.VISIBLE);
                login_Account_buttom.setVisibility(View.GONE);
                login_Quick_text.setTextColor(Color.parseColor("#f39035"));
                login_Account_text.setTextColor(Color.parseColor("#b3b3b3"));
                login_Account_buttom.setVisibility(View.GONE);

                setContentView(Quickragment.class, R.id.login_fragment);

                break;

            case R.id.login_Account_rl:
                //账号登录
                login_Quick_buttom.setVisibility(View.GONE);
                login_Account_buttom.setVisibility(View.VISIBLE);
                login_Account_text.setTextColor(Color.parseColor("#f39035"));
                login_Quick_text.setTextColor(Color.parseColor("#b3b3b3"));
                setContentView(Account_numberFragment.class, R.id.login_fragment);

                break;
        }
    }

}
