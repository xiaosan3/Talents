package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Follow_Data;
import com.longmingxin.talent.talents.ui.adapter.Follow_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFollowActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar follow_toolbar;
    /**
     * 地区
     */
    private RadioButton follow_region;
    /**
     * 时间
     */
    private RadioButton follow_time;
    private LinearLayout follow_money;
    private RecyclerView follow_RecyclerView;

    private List<Follow_Data> mlist = new ArrayList<>();
    private Follow_SubAdapter adapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_my_follow;
    }

    @Override
    protected void initView() {

        follow_toolbar = (Toolbar) findViewById(R.id.follow_toolbar);
        follow_toolbar.setOnClickListener(this);
        follow_region = (RadioButton) findViewById(R.id.follow_region);
        follow_region.setOnClickListener(this);
        follow_time = (RadioButton) findViewById(R.id.follow_time);
        follow_time.setOnClickListener(this);
        follow_money = (LinearLayout) findViewById(R.id.follow_money);
        follow_money.setOnClickListener(this);
        follow_RecyclerView = (RecyclerView) findViewById(R.id.follow_RecyclerView);
        follow_RecyclerView.setOnClickListener(this);

        adapter = new Follow_SubAdapter(R.layout.records_item,mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        follow_RecyclerView.setLayoutManager(layoutManager);
        follow_RecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MyFollowActivity.this,mlist.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2 ; i++) {
            Follow_Data follow_data = new Follow_Data();
            mlist.add(follow_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(follow_toolbar);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.follow_toolbar:
                break;
            case R.id.follow_region:
                break;
            case R.id.follow_time:
                break;
            case R.id.follow_money:
                break;
            case R.id.follow_RecyclerView:
                break;
        }
    }
}
