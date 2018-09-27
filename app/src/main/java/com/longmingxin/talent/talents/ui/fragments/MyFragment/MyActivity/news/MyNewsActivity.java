package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.news;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class MyNewsActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar news_toolbar;
    private LinearLayout news_notice;
    private LinearLayout news_activity;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_news;
    }

    @Override
    protected void initView() {

        news_toolbar = (Toolbar) findViewById(R.id.news_toolbar);
        news_toolbar.setOnClickListener(this);
        news_notice = (LinearLayout) findViewById(R.id.news_notice);
        news_notice.setOnClickListener(this);
        news_activity = (LinearLayout) findViewById(R.id.news_activity);
        news_activity.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(news_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.news_notice:
                startActivity(new Intent(MyNewsActivity.this, NoticeActivity.class));
                break;
            case R.id.news_activity:
                break;
        }
    }
}
