package com.longmingxin.talent.talents.ui.newactivity;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;

public class CourseActivity extends BaseActivity {

    private ImageView course_return_button;
    private RelativeLayout course_QuanBu;
    private RelativeLayout course_WeiXiu;
    private RelativeLayout course_DianNao;
    private RelativeLayout course_ShuJu;
    private RelativeLayout course_QiChe;
    private RecyclerView course_RecyclerView;

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

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }

}
