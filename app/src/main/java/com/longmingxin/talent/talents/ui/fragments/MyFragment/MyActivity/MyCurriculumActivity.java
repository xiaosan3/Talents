package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Curriculum_Data;
import com.longmingxin.talent.talents.ui.adapter.Curriculum_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyCurriculumActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar curriculum_toolbar;
    /**
     * 课程分类
     */
    private RadioButton curriculum_classification;
    /**
     * 课程类型
     */
    private RadioButton curriculum_type;
    private RecyclerView curriculum_RecyclerView;

    private List<Curriculum_Data> mlist = new ArrayList<>();
    private Curriculum_SubAdapter adapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_curriculum;
    }

    @Override
    protected void initView() {

        curriculum_toolbar = (Toolbar) findViewById(R.id.curriculum_toolbar);
        curriculum_toolbar.setOnClickListener(this);
        curriculum_classification = (RadioButton) findViewById(R.id.curriculum_classification);
        curriculum_classification.setOnClickListener(this);
        curriculum_type = (RadioButton) findViewById(R.id.curriculum_type);
        curriculum_type.setOnClickListener(this);
        curriculum_RecyclerView = (RecyclerView) findViewById(R.id.curriculum_RecyclerView);
        curriculum_RecyclerView.setOnClickListener(this);

        adapter = new Curriculum_SubAdapter(R.layout.curriculum_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        curriculum_RecyclerView.setLayoutManager(layoutManager);
        curriculum_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2; i++) {
            Curriculum_Data curriculum_data = new Curriculum_Data();
            mlist.add(curriculum_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(curriculum_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.curriculum_toolbar:
                break;
            case R.id.curriculum_classification:
                break;
            case R.id.curriculum_type:
                break;
            case R.id.curriculum_RecyclerView:
                break;
        }
    }
}
