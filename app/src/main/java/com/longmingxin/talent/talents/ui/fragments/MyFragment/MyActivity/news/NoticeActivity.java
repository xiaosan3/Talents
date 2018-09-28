package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.news;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Notice_Data;
import com.longmingxin.talent.talents.ui.adapter.Notice_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class NoticeActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar notice_toolbar;
    private RecyclerView notice_RecyclerView;

    private List<Notice_Data> mlist = new ArrayList<>();
    private Notice_SubAdapter adapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_notice;
    }

    @Override
    protected void initView() {

        notice_toolbar = (Toolbar) findViewById(R.id.notice_toolbar);
        notice_toolbar.setOnClickListener(this);
        notice_RecyclerView = (RecyclerView) findViewById(R.id.notice_RecyclerView);
        notice_RecyclerView.setOnClickListener(this);

        adapter = new Notice_SubAdapter(R.layout.notice_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        notice_RecyclerView.setLayoutManager(layoutManager);
        notice_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2; i++) {
            Notice_Data notice_data = new Notice_Data();
            mlist.add(notice_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(notice_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.notice_toolbar:
                break;
            case R.id.notice_RecyclerView:
                break;
        }
    }
}
