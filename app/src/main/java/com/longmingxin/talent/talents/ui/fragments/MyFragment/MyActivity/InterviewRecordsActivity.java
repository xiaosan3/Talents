package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Interview_Data;
import com.longmingxin.talent.talents.ui.adapter.Interview_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class InterviewRecordsActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar interview_toolbar;
    private LinearLayout interview_omprehensive;
    /**
     * 推荐
     */
    private RadioButton interview_recommend;
    /**
     * 时间
     */
    private RadioButton interview_time;
    /**
     * 状态
     */
    private RadioButton interview_state;
    private RecyclerView interview_RecyclerView;

    private List<Interview_Data> mlist = new ArrayList<>();
    private Interview_SubAdapter adapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_interview_records;
    }

    @Override
    protected void initView() {

        interview_toolbar = (Toolbar) findViewById(R.id.interview_toolbar);
        interview_toolbar.setOnClickListener(this);
        interview_omprehensive = (LinearLayout) findViewById(R.id.interview_omprehensive);
        interview_omprehensive.setOnClickListener(this);
        interview_recommend = (RadioButton) findViewById(R.id.interview_recommend);
        interview_recommend.setOnClickListener(this);
        interview_time = (RadioButton) findViewById(R.id.interview_time);
        interview_time.setOnClickListener(this);
        interview_state = (RadioButton) findViewById(R.id.interview_state);
        interview_state.setOnClickListener(this);
        interview_RecyclerView = (RecyclerView) findViewById(R.id.interview_RecyclerView);
        interview_RecyclerView.setOnClickListener(this);

        adapter = new Interview_SubAdapter(R.layout.interview_item,mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        interview_RecyclerView.setLayoutManager(layoutManager);
        interview_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2 ; i++) {
            Interview_Data interview_data = new Interview_Data();
            mlist.add(interview_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(interview_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.interview_toolbar:
                break;
            case R.id.interview_omprehensive:
                break;
            case R.id.interview_recommend:
                break;
            case R.id.interview_time:
                break;
            case R.id.interview_state:
                break;
            case R.id.interview_RecyclerView:
                break;
        }
    }
}
