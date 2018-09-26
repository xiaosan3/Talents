package com.longmingxin.talent.talents.ui.newactivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Train_School_Data;
import com.longmingxin.talent.talents.ui.adapter.Train_School_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class Train_SchoolActivity extends BaseActivity implements View.OnClickListener{

    private ImageView train_return_button;
    private ImageView train_image;
    private TextView train_School_name;
    private ImageView tarin_Location_map;
    private TextView train_School_address;
    private TextView train_School_content;
    private RecyclerView train_RecyclerView;
    private List<Train_School_Data> mlist = new ArrayList<>();
    private Train_School_SubAdapter adapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_course__school;
    }

    @Override
    protected void initView() {
        train_return_button = (ImageView) findViewById(R.id.train_return_button);
        train_image = (ImageView) findViewById(R.id.train_image);
        train_School_name = (TextView) findViewById(R.id.train_School_name);
        tarin_Location_map = (ImageView) findViewById(R.id.tarin_Location_map);
        train_School_address = (TextView) findViewById(R.id.train_School_address);
        train_School_content = (TextView) findViewById(R.id.train_School_content);
        train_RecyclerView = (RecyclerView) findViewById(R.id.train_RecyclerView);

        train_return_button.setOnClickListener(this);

        adapter = new Train_School_SubAdapter(R.layout.train_item,mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        train_RecyclerView.setLayoutManager(layoutManager);
        train_RecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mlist.clear();
        for (int i = 0; i < 2 ; i++) {
            Train_School_Data train_data = new Train_School_Data("焊工", "￥6000", "10560人报名", "2336");
            mlist.add(train_data);
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
