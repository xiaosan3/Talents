package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.CurriculumVitae;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class EducationActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar education_toolbar;
    private RelativeLayout education_education;
    private RelativeLayout education_school;
    private RelativeLayout education_major;
    private RelativeLayout education_time_slot;
    /**
     * 保存
     */
    private TextView education_preservation;

    @Override
    protected int getContentView() {
        return R.layout.activity_education;
    }

    @Override
    protected void initView() {

        education_toolbar = (Toolbar) findViewById(R.id.education_toolbar);
        education_toolbar.setOnClickListener(this);
        education_education = (RelativeLayout) findViewById(R.id.education_education);
        education_education.setOnClickListener(this);
        education_school = (RelativeLayout) findViewById(R.id.education_school);
        education_school.setOnClickListener(this);
        education_major = (RelativeLayout) findViewById(R.id.education_major);
        education_major.setOnClickListener(this);
        education_time_slot = (RelativeLayout) findViewById(R.id.education_time_slot);
        education_time_slot.setOnClickListener(this);
        education_preservation = (TextView) findViewById(R.id.education_preservation);
        education_preservation.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(education_toolbar);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.education_toolbar:
                break;
            case R.id.education_education:
                break;
            case R.id.education_school:
                break;
            case R.id.education_major:
                break;
            case R.id.education_time_slot:
                break;
            case R.id.education_preservation:
                //保存
                break;
        }
    }

}
