package com.longmingxin.talent.talents.ui.newactivity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Train_Data;
import com.longmingxin.talent.talents.ui.adapter.Train_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class TrainActivity extends BaseActivity implements View.OnClickListener {


    private ImageView train_return_button;
    private RecyclerView train_RecyclerView;
    private Train_SubAdapter adapter;
    private List<Train_Data> mlist = new ArrayList<>();

    @Override
    protected int getContentView() {
        return R.layout.activity_train;
    }

    @Override
    protected void initView() {
        train_return_button = (ImageView) findViewById(R.id.train_return_button);
        train_return_button.setOnClickListener(this);
        train_RecyclerView = (RecyclerView) findViewById(R.id.train_RecyclerView);
        adapter = new Train_SubAdapter(R.layout.train_layout, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        train_RecyclerView.setLayoutManager(layoutManager);
        train_RecyclerView.setAdapter(adapter);
        adapter.setOnclick(new Train_SubAdapter.Onclick() {
            @Override
            public void onclicks(View v, int option) {
                startActivity(new Intent(TrainActivity.this,Train_SchoolActivity.class));
            }
        });

    }

    @Override
    protected void initData() {

        mlist.clear();
        for (int i = 0; i < 10; i++) {
            Train_Data trainData = new Train_Data("四川华西职业培训学校", "1537", "9500", "导游： (景区讲解员)  钢筋工");
            mlist.add(trainData);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.train_return_button:
                finish();
                break;
        }

    }


}
