package com.longmingxin.talent.talents.ui.newactivity.lair;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Exclusive_Data;
import com.longmingxin.talent.talents.ui.adapter.Exclusive_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class Exclusive_channelActivity extends BaseActivity {


    private ImageView exclusive_return_button;
    private ImageView exclusive_soldier;
    private ImageView exclusive_College_student;
    private ImageView exclusive_Disabled;
    private ImageView exclusive_Poverty_alleviation;
    private RecyclerView exclusive_RecyclerView;
    private LinearLayout activity_exclusive_channel;
    private List<Exclusive_Data> mlist = new ArrayList<>();
    private Exclusive_SubAdapter adapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_exclusive_channel;
    }

    @Override
    protected void initView() {
        exclusive_RecyclerView = (RecyclerView) findViewById(R.id.exclusive_RecyclerView);
        adapter = new Exclusive_SubAdapter(R.layout.exclusive_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        exclusive_RecyclerView.setLayoutManager(layoutManager);
        exclusive_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        for (int i = 0; i < 2; i++) {
            Exclusive_Data exclusive_data = new Exclusive_Data("土建/监理工程师", "6K-12K", "山东-济南市", "三年经验  大专以上学历", "", "2018-09-02");
            mlist.add(exclusive_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
}
