package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.Utils.woolglass.UtilBitmap;
import com.longmingxin.talent.talents.base.BaseActivity;

public class MyAboutActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar about_toolbar;
    private ImageView about_backgrount;
    private ImageView about_head;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_about;
    }

    @Override
    protected void initView() {

        about_toolbar = (Toolbar) findViewById(R.id.about_toolbar);
        about_toolbar.setOnClickListener(this);
        about_backgrount = (ImageView) findViewById(R.id.about_backgrount);
        about_backgrount.setOnClickListener(this);
        about_head = (ImageView) findViewById(R.id.about_head);
        about_head.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        UtilBitmap.blurImageView(MyAboutActivity.this, about_backgrount, 10);
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(about_toolbar);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.about_toolbar:
                break;
            case R.id.about_backgrount:
                break;
            case R.id.about_head:
                break;
        }
    }
}
