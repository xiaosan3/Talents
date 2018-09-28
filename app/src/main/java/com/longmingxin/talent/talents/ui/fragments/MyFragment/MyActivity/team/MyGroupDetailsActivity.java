package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.team;

import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class MyGroupDetailsActivity extends BaseActivity {


    private Toolbar details_toolbar;
    /**
     * eaglar006
     */
    private TextView details_name;
    /**
     * 17785461235
     */
    private TextView details_phone;
    private LinearLayout activity_my_group_details;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_group_details;
    }

    @Override
    protected void initView() {

        details_toolbar = (Toolbar) findViewById(R.id.details_toolbar);
        details_name = (TextView) findViewById(R.id.details_name);
        details_phone = (TextView) findViewById(R.id.details_phone);
        activity_my_group_details = (LinearLayout) findViewById(R.id.activity_my_group_details);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(details_toolbar);
    }
}
