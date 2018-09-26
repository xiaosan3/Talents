package com.longmingxin.talent.talents.ui.newactivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.bean.Course_Data;
import com.longmingxin.talent.talents.ui.adapter.Course_SubAdapter;

import java.util.ArrayList;
import java.util.List;

public class CourseActivity extends BaseActivity implements View.OnClickListener {

    private ImageView course_return_button;
    private RelativeLayout course_QuanBu;
    private RelativeLayout course_WeiXiu;
    private RelativeLayout course_DianNao;
    private RelativeLayout course_ShuJu;
    private RelativeLayout course_QiChe;
    private RecyclerView course_RecyclerView;
    private List<Course_Data> mlist = new ArrayList<>();
    private Course_SubAdapter adapter;

    @Override
    protected int getContentView() {

        return R.layout.activity_course;
    }

    @Override
    protected void initView() {
        course_return_button = (ImageView) findViewById(R.id.course_return_button);
        course_QuanBu = (RelativeLayout) findViewById(R.id.course_QuanBu);
        course_WeiXiu = (RelativeLayout) findViewById(R.id.course_WeiXiu);
        course_DianNao = (RelativeLayout) findViewById(R.id.course_DianNao);
        course_ShuJu = (RelativeLayout) findViewById(R.id.course_ShuJu);
        course_QiChe = (RelativeLayout) findViewById(R.id.course_QiChe);
        course_RecyclerView = (RecyclerView) findViewById(R.id.course_RecyclerView);
        course_return_button.setOnClickListener(this);

        adapter = new Course_SubAdapter(R.layout.course_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        course_RecyclerView.setLayoutManager(layoutManager);
        course_RecyclerView.setAdapter(adapter);

    }

    @Override
    protected void initData() {
        for (int i = 0; i < 10; i++) {
            Course_Data course_data = new Course_Data("零基础入门，电气公开课", "1" + i, "通过公开课试听了解更多关于课程内容，对整个学习", "1537人报名", "982");
            mlist.add(course_data);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.course_return_button:
                finish();
                break;
        }
    }
}
