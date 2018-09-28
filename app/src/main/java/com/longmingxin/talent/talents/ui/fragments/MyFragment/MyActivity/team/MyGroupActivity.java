package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.team;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Group_Data;
import com.longmingxin.talent.talents.ui.adapter.Group_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyGroupActivity extends BaseActivity implements View.OnClickListener {

    private ImageView group_add_group;
    private Toolbar group_toolbar;
    /**
     * 搜索
     */
    private EditText group_search;
    /**
     * 龙湖山庄项目组
     */
    private TextView group_projectname;
    /**
     * 木工组
     */
    private TextView group_groupname;
    private RecyclerView group_RecyclerView;

    private List<Group_Data> mlist = new ArrayList<>();
    private Group_SubAdapter adapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_group;
    }

    @Override
    protected void initView() {

        group_add_group = (ImageView) findViewById(R.id.group_add_group);
        group_add_group.setOnClickListener(this);
        group_toolbar = (Toolbar) findViewById(R.id.group_toolbar);
        group_search = (EditText) findViewById(R.id.group_search);
        group_search.setOnClickListener(this);
        group_projectname = (TextView) findViewById(R.id.group_projectname);
        group_groupname = (TextView) findViewById(R.id.group_groupname);
        group_RecyclerView = (RecyclerView) findViewById(R.id.group_RecyclerView);

        adapter = new Group_SubAdapter(R.layout.team_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        group_RecyclerView.setLayoutManager(layoutManager);
        group_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        ToolBarUtils.getInstance().setNavigation(group_toolbar);
    }

    @Override
    protected void initToolBar() {
        mlist.clear();
        for (int i = 0; i < 2; i++) {
            Group_Data group_data = new Group_Data();
            mlist.add(group_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.group_add_group:
                //这是我写的点击RecyclerView跳转，而不是点击条目跳转，后期修改
                startActivity(new Intent(MyGroupActivity.this, MyGroupDetailsActivity.class));
                break;
            case R.id.group_search:
                break;
        }
    }
}
