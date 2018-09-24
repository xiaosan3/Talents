package com.longmingxin.talent.talents.ui.activity;

import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.ui.fragments.JobHuntingFragment;
import com.longmingxin.talent.talents.ui.fragments.LairFragment;
import com.longmingxin.talent.talents.ui.fragments.LearningAbilityFragment;
import com.longmingxin.talent.talents.ui.fragments.MyFragment;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    private FrameLayout mian_fragment;
    private RadioButton transaction;
    private RadioButton order;
    private RadioButton property;
    private RadioButton my;
    private RadioGroup rg_all;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        mian_fragment = (FrameLayout) findViewById(R.id.mian_fragment);
        rg_all = (RadioGroup) findViewById(R.id.rg_all);
        transaction = (RadioButton) findViewById(R.id.transaction);
        order = (RadioButton) findViewById(R.id.order);
        property = (RadioButton) findViewById(R.id.property);
        my = (RadioButton) findViewById(R.id.my);
        rg_all.setOnCheckedChangeListener(this);
    }
    @Override
    protected void initData() {
        setContentView(LairFragment.class, R.id.mian_fragment);
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.transaction:
                setContentView(LairFragment.class, R.id.mian_fragment);
                break;
            case R.id.order:
                setContentView(LearningAbilityFragment.class, R.id.mian_fragment);
                break;
            case R.id.property:
                setContentView(JobHuntingFragment.class, R.id.mian_fragment);
                break;
            case R.id.my:
                setContentView(MyFragment.class, R.id.mian_fragment);
                break;
        }
    }
}
