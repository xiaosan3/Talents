package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.CurriculumVitae;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class CurriculumVitaeActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar vitae_toolbar;
    private RelativeLayout vitae_information;
    private RelativeLayout vitae_education;
    private RelativeLayout vitae_background;

    @Override
    protected int getContentView() {
        return R.layout.activity_curriculum_vitae;
    }

    @Override
    protected void initView() {

        vitae_toolbar = (Toolbar) findViewById(R.id.vitae_toolbar);
        vitae_information = (RelativeLayout) findViewById(R.id.vitae_information);
        vitae_information.setOnClickListener(this);
        vitae_education = (RelativeLayout) findViewById(R.id.vitae_education);
        vitae_education.setOnClickListener(this);
        vitae_background = (RelativeLayout) findViewById(R.id.vitae_background);
        vitae_background.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(vitae_toolbar);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.vitae_information:
                startActivity(new Intent(CurriculumVitaeActivity.this, My_InformationActivity.class));
                break;
            case R.id.vitae_education:
                startActivity(new Intent(CurriculumVitaeActivity.this, EducationActivity.class));
                break;
            case R.id.vitae_background:
                startActivity(new Intent(CurriculumVitaeActivity.this, BackgroundActivity.class));
                break;
        }
    }
}
