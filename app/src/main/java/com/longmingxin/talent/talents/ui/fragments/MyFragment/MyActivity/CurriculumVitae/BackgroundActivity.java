package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.CurriculumVitae;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class BackgroundActivity extends BaseActivity implements View.OnClickListener {
    /**
     * 保存
     */
    private TextView background_preservation;
    private Toolbar background_toolbar;
    private RelativeLayout background_enterprise;
    private RelativeLayout background_work_time;
    private ImageView background_picture;

    @Override
    protected int getContentView() {
        return R.layout.activity_background;
    }

    @Override
    protected void initView() {

        background_preservation = (TextView) findViewById(R.id.background_preservation);
        background_preservation.setOnClickListener(this);
        background_toolbar = (Toolbar) findViewById(R.id.background_toolbar);
        background_toolbar.setOnClickListener(this);
        background_enterprise = (RelativeLayout) findViewById(R.id.background_enterprise);
        background_enterprise.setOnClickListener(this);
        background_work_time = (RelativeLayout) findViewById(R.id.background_work_time);
        background_work_time.setOnClickListener(this);
        background_picture = (ImageView) findViewById(R.id.background_picture);
        background_picture.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(background_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.background_preservation:
                break;
            case R.id.background_toolbar:
                break;
            case R.id.background_enterprise:
                break;
            case R.id.background_work_time:
                break;
            case R.id.background_picture:
                break;
        }
    }
}
