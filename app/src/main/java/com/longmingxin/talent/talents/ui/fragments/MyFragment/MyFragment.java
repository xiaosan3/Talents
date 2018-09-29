package com.longmingxin.talent.talents.ui.fragments.MyFragment;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.CurriculumVitae.CurriculumVitaeActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.DeliveryRecordsActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.InterviewRecordsActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.MyAboutActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.MyCurriculumActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.MyFollowActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.news.MyNewsActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.myorder.MyOrderActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.MySettingActivity;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.team.MyTeamActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment implements View.OnClickListener {
    private ImageView my_head;
    /**
     * 点击登录
     */
    private TextView clike_logini;
    /**
     * 未登录
     */
    private TextView not_logged;
    private RelativeLayout my_curriculum_vitae;
    private RelativeLayout my_delivery_records;
    private RelativeLayout my_interview_records;
    private RelativeLayout my_curriculum;
    private RelativeLayout my_order;
    private RelativeLayout my_follow;
    private RelativeLayout my_news;
    private RelativeLayout my_team;
    private RelativeLayout my_about;
    private RelativeLayout my_setting;
    private RelativeLayout my_information;


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView(View view) {

        my_head = (ImageView) view.findViewById(R.id.my_head);
        my_head.setOnClickListener(this);
        clike_logini = (TextView) view.findViewById(R.id.clike_logini);
        clike_logini.setOnClickListener(this);
        not_logged = (TextView) view.findViewById(R.id.not_logged);
        not_logged.setOnClickListener(this);
        my_curriculum_vitae = (RelativeLayout) view.findViewById(R.id.my_curriculum_vitae);
        my_curriculum_vitae.setOnClickListener(this);
        my_delivery_records = (RelativeLayout) view.findViewById(R.id.my_delivery_records);
        my_delivery_records.setOnClickListener(this);
        my_interview_records = (RelativeLayout) view.findViewById(R.id.my_interview_records);
        my_interview_records.setOnClickListener(this);
        my_curriculum = (RelativeLayout) view.findViewById(R.id.my_curriculum);
        my_curriculum.setOnClickListener(this);
        my_order = (RelativeLayout) view.findViewById(R.id.my_order);
        my_order.setOnClickListener(this);
        my_follow = (RelativeLayout) view.findViewById(R.id.my_follow);
        my_follow.setOnClickListener(this);
        my_news = (RelativeLayout) view.findViewById(R.id.my_news);
        my_news.setOnClickListener(this);
        my_team = (RelativeLayout) view.findViewById(R.id.my_team);
        my_team.setOnClickListener(this);
        my_about = (RelativeLayout) view.findViewById(R.id.my_about);
        my_about.setOnClickListener(this);
        my_setting = (RelativeLayout) view.findViewById(R.id.my_setting);
        my_setting.setOnClickListener(this);
        my_information = (RelativeLayout) view.findViewById(R.id.my_information);
        my_information.setOnClickListener(this);
    }

    @Override
    protected void initData(View view) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_information:
                break;
            case R.id.my_head:
                break;
            case R.id.clike_logini:
                break;
            case R.id.not_logged:
                break;
            case R.id.my_curriculum_vitae:
                startActivity(new Intent(getContext(), CurriculumVitaeActivity.class));
                break;
            case R.id.my_delivery_records:
                startActivity(new Intent(getContext(), DeliveryRecordsActivity.class));
                break;
            case R.id.my_interview_records:
                startActivity(new Intent(getContext(), InterviewRecordsActivity.class));
                break;
            case R.id.my_curriculum:
                startActivity(new Intent(getContext(), MyCurriculumActivity.class));
                break;
            case R.id.my_order:
                startActivity(new Intent(getContext(), MyOrderActivity.class));
                break;
            case R.id.my_follow:
                startActivity(new Intent(getContext(), MyFollowActivity.class));
                break;
            case R.id.my_news:
                startActivity(new Intent(getContext(), MyNewsActivity.class));
                break;
            case R.id.my_team:
                startActivity(new Intent(getContext(), MyTeamActivity.class));
                break;
            case R.id.my_about:
                startActivity(new Intent(getContext(), MyAboutActivity.class));
                break;
            case R.id.my_setting:
                startActivity(new Intent(getContext(), MySettingActivity.class));
                break;

        }
    }


}
