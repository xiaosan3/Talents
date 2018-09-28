package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.team;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Team_Data;
import com.longmingxin.talent.talents.ui.adapter.Team_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyTeamActivity extends BaseActivity implements View.OnClickListener {


    private ImageView team_add;
    private Toolbar team_toolbar;
    /**
     * 5人
     */
    private TextView team_carpentry_text;
    private RelativeLayout team_carpentry_clike;
    /**
     * 5人
     */
    private TextView team_tile_worker_text;
    private RelativeLayout team_tile_worker_clike;
    /**
     * 5人
     */
    private TextView team_rebar_worker_text;
    private RelativeLayout team_rebar_worker_clike;
    /**
     * 5人
     */
    private TextView team_plumber_and_electrician_text;
    private RelativeLayout team_plumber_and_electrician_clike;
    private RecyclerView team_RecyclerView;

    private List<Team_Data> mlist = new ArrayList<>();
    private Team_SubAdapter adapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_team;
    }

    @Override
    protected void initView() {

        team_add = (ImageView) findViewById(R.id.team_add);
        team_add.setOnClickListener(this);
        team_toolbar = (Toolbar) findViewById(R.id.team_toolbar);
        team_carpentry_text = (TextView) findViewById(R.id.team_carpentry_text);
        team_carpentry_clike = (RelativeLayout) findViewById(R.id.team_carpentry_clike);
        team_carpentry_clike.setOnClickListener(this);
        team_tile_worker_text = (TextView) findViewById(R.id.team_tile_worker_text);
        team_tile_worker_clike = (RelativeLayout) findViewById(R.id.team_tile_worker_clike);
        team_tile_worker_clike.setOnClickListener(this);
        team_rebar_worker_text = (TextView) findViewById(R.id.team_rebar_worker_text);
        team_rebar_worker_clike = (RelativeLayout) findViewById(R.id.team_rebar_worker_clike);
        team_rebar_worker_clike.setOnClickListener(this);
        team_plumber_and_electrician_text = (TextView) findViewById(R.id.team_plumber_and_electrician_text);
        team_plumber_and_electrician_clike = (RelativeLayout) findViewById(R.id.team_plumber_and_electrician_clike);
        team_plumber_and_electrician_clike.setOnClickListener(this);
        team_RecyclerView = (RecyclerView) findViewById(R.id.team_RecyclerView);
        team_RecyclerView.setOnClickListener(this);

        adapter = new Team_SubAdapter(R.layout.team_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        team_RecyclerView.setLayoutManager(layoutManager);
        team_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2; i++) {
            Team_Data team_data = new Team_Data();
            mlist.add(team_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(team_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.team_add:
                //这是我写的点击RecyclerView跳转，而不是点击条目跳转，后期修改
                startActivity(new Intent(MyTeamActivity.this, MyGroupActivity.class));
                break;
            case R.id.team_carpentry_clike:
                break;
            case R.id.team_tile_worker_clike:
                break;
            case R.id.team_rebar_worker_clike:
                break;
            case R.id.team_plumber_and_electrician_clike:
                break;
            case R.id.team_RecyclerView:
                break;
        }
    }
}
