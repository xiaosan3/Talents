package com.longmingxin.talent.talents.ui.register;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class Register_AgreementActivity extends BaseActivity implements View.OnClickListener{


    private Toolbar agreement_toolbar;
    private WebView mWebView;

    @Override
    protected int getContentView() {
        return R.layout.activity_register__agreement;
    }

    @Override
    protected void initView() {
        agreement_toolbar = (Toolbar) findViewById(R.id.agreement_toolbar);
        agreement_toolbar.setOnClickListener(this);
        mWebView = (WebView) findViewById(R.id.mWebView);

    }

    @Override
    protected void initData() {
        mWebView.loadUrl("http://agri.bnzxsoft.cn/xmzp/agreement");

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(agreement_toolbar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.agreement_toolbar:
                break;
        }
    }





}
