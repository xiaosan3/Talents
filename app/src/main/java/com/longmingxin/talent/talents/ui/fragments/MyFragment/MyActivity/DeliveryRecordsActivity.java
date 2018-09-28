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
import com.longmingxin.talent.talents.bean.Records_Data;
import com.longmingxin.talent.talents.ui.adapter.Records_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRecordsActivity extends BaseActivity implements View.OnClickListener {


    private LinearLayout records_omprehensive;
    /**
     * 推荐
     */
    private RadioButton records_recommend;
    /**
     * 时间
     */
    private RadioButton records_time;
    /**
     * 状态
     */
    private RadioButton records_state;
    private Toolbar records_toolbar;
    private RecyclerView records_RecyclerView;

    private List<Records_Data> mlist = new ArrayList<>();
    private Records_SubAdapter adapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_delivery_records;
    }

    @Override
    protected void initView() {

        records_toolbar = (Toolbar) findViewById(R.id.records_toolbar);
        records_omprehensive = (LinearLayout) findViewById(R.id.records_omprehensive);
        records_omprehensive.setOnClickListener(this);
        records_recommend = (RadioButton) findViewById(R.id.records_recommend);
        records_recommend.setOnClickListener(this);
        records_time = (RadioButton) findViewById(R.id.records_time);
        records_time.setOnClickListener(this);
        records_state = (RadioButton) findViewById(R.id.records_state);
        records_state.setOnClickListener(this);
        records_RecyclerView = (RecyclerView) findViewById(R.id.records_RecyclerView);

        adapter = new Records_SubAdapter(R.layout.records_item,mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        records_RecyclerView.setLayoutManager(layoutManager);
        records_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2 ; i++) {
            Records_Data records_data = new Records_Data();
            mlist.add(records_data);
        }
        adapter.notifyDataSetChanged();

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(records_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.records_omprehensive:
                break;
            case R.id.records_recommend:
                break;
            case R.id.records_time:
                break;
            case R.id.records_state:
                break;
        }
    }
}
