package com.longmingxin.talent.talents.ui.newactivity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Skill_Data;
import com.longmingxin.talent.talents.ui.adapter.Skill_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class SkillActivity extends BaseActivity implements View.OnClickListener{
    private Skill_SubAdapter adapter;
    private List<Skill_Data> mlist = new ArrayList<>();
    private RecyclerView skill_rv;
    private ImageView skill_return_button;

    @Override
    protected int getContentView() {
        return R.layout.activity_skill;
    }

    @Override
    protected void initView() {
        skill_return_button = (ImageView) findViewById(R.id.skill_return_button);
        skill_return_button.setOnClickListener(this);
        skill_rv = (RecyclerView) findViewById(R.id.skill_rv);
        //创建适配器
        adapter = new Skill_SubAdapter(R.layout.skill_item, mlist);
        //创建布局管理
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        skill_rv.setLayoutManager(layoutManager);
        //给RecyclerView设置适配器
        skill_rv.setAdapter(adapter);
        adapter.setOnclick(new Skill_SubAdapter.Onclick() {
            @Override
            public void onclicks(View v, int option) {
                startActivity(new Intent(SkillActivity.this,MeasuringActivity.class));
            }
        });
    }


    @Override
    protected void initData() {
        for (int i = 0; i < 10; i++) {
            Skill_Data skill_data = new Skill_Data(R.drawable.learning_ability, "每天步行3600公里", "但依旧很胖", "2018-09-09");
            mlist.add(skill_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.skill_return_button:
                finish();
                break;
        }
    }
}
