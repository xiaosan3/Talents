package com.longmingxin.talent.talents.ui.fragments;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;
import com.longmingxin.talent.talents.bean.HomePagerBean;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setHomePagerPresenter;
import com.longmingxin.talent.talents.ui.adapter.Exclusive_SubAdapter;
import com.longmingxin.talent.talents.ui.newactivity.CourseActivity;
import com.longmingxin.talent.talents.ui.newactivity.lair.Exclusive_channelActivity;
import com.longmingxin.talent.talents.ui.newactivity.lair.High_salary_postActivity;
import com.longmingxin.talent.talents.ui.newactivity.lair.Intelligent_recommendationActivity;
import com.longmingxin.talent.talents.ui.newactivity.lair.Urgent_jobActivity;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LairFragment extends BaseFragment<setHomePagerPresenter> implements View.OnClickListener,Contract.IGetHomePagerView {


    private ImageView lair_Location;
    private TextView lair_address;
    private ImageView lair_search_image;
    private EditText lair_search_ed;
    private Banner lair_Banner;
    private RadioButton lair_High_salary_post;
    private RadioButton lair_Intelligent_recommendation;
    private RadioButton lair_Urgent_job;
    private RadioButton lair_Exclusive_channel;
    private RecyclerView lair_RecyclerView;
    private RelativeLayout lair_Learning_ability;
    private RelativeLayout lair_Teacher_lecture_hall;
    private LinearLayout lair_Free_course;
    private RelativeLayout lair_Skill_assessment;
    private RelativeLayout lair_The_industry_standard;
    private Button lair_plumber_and_electrician;
    private Button lair_Welder;
    private Button lair_Architect;
    private Button lair_Designer;
    private Button lair_Security_officer;
    private Button lair_Bricklayer;
    private Button lair_Machinist;
    private Button lair_More;
    private RadioGroup rg_all;
    private TextView learnint_text;
    private TextView mianfei;
    private TextView teacher;
    private TextView jineng;
    private TextView hangye;
    private RecyclerView lair_zaizhao_rv;
    private RecyclerView lair_tuijian_rv;
    private List<HomePagerBean.DataBean.JobsBean> mlist = new ArrayList<>();
    private Exclusive_SubAdapter adapter;
    private HomePagerBean pagerBean;

    public LairFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_lair;
    }

    @Override
    protected void initView(View view) {
        lair_High_salary_post = view.findViewById(R.id.lair_High_salary_post);
        lair_Intelligent_recommendation = view.findViewById(R.id.lair_Intelligent_recommendation);
        lair_Urgent_job = view.findViewById(R.id.lair_Urgent_job);
        lair_Exclusive_channel = view.findViewById(R.id.lair_Exclusive_channel);
        lair_tuijian_rv = view.findViewById(R.id.lair_tuijian_rv);

        lair_plumber_and_electrician = view.findViewById(R.id.lair_plumber_and_electrician);
        lair_Welder = view.findViewById(R.id.lair_Welder);
        lair_Architect = view.findViewById(R.id.lair_Architect);
        lair_Designer = view.findViewById(R.id.lair_Designer);
        lair_Security_officer = view.findViewById(R.id.lair_Security_officer);
        lair_Bricklayer = view.findViewById(R.id.lair_Bricklayer);
        lair_Machinist = view.findViewById(R.id.lair_Machinist);
        lair_More = view.findViewById(R.id.lair_More);

        lair_High_salary_post.setOnClickListener(this);
        lair_Intelligent_recommendation.setOnClickListener(this);
        lair_Urgent_job.setOnClickListener(this);
        lair_Exclusive_channel.setOnClickListener(this);

        lair_plumber_and_electrician.setOnClickListener(this);
        lair_Welder.setOnClickListener(this);
        lair_Architect.setOnClickListener(this);
        lair_Designer.setOnClickListener(this);
        lair_Security_officer.setOnClickListener(this);
        lair_Bricklayer.setOnClickListener(this);
        lair_Machinist.setOnClickListener(this);
        lair_More.setOnClickListener(this);


        initBanner();
        presenter.setHomePage("1");

    }

    private void initBanner() {

    }

    @Override
    protected void initData(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lair_High_salary_post:
                startActivity(new Intent(getActivity(), High_salary_postActivity.class));
                break;

            case R.id.lair_Intelligent_recommendation:
                startActivity(new Intent(getActivity(), Intelligent_recommendationActivity.class));
                break;

            case R.id.lair_Urgent_job:
                startActivity(new Intent(getActivity(), Urgent_jobActivity.class));
                break;

            case R.id.lair_Exclusive_channel:
                startActivity(new Intent(getActivity(), Exclusive_channelActivity.class));
                break;
            case R.id.lair_plumber_and_electrician:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_Welder:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_Architect:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_Designer:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_Security_officer:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_Bricklayer:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_Machinist:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.lair_More:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
        }
    }

    @Override
    public void showHome(HomePagerBean homePagerBean) {
        pagerBean = homePagerBean;
        List<HomePagerBean.DataBean.JobsBean> jobs = pagerBean.getData().getJobs();
        mlist.addAll(jobs);
        adapter = new Exclusive_SubAdapter(R.layout.exclusive_item, mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        lair_tuijian_rv.setLayoutManager(layoutManager);
        lair_tuijian_rv.setAdapter(adapter);
    }

    @Override
    public void showIntent() {

    }
}
