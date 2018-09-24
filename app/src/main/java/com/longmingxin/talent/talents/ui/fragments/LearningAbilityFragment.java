package com.longmingxin.talent.talents.ui.fragments;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;
import com.longmingxin.talent.talents.ui.newactivity.CourseActivity;
import com.longmingxin.talent.talents.ui.newactivity.SkillActivity;
import com.longmingxin.talent.talents.ui.newactivity.TrainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LearningAbilityFragment extends BaseFragment implements View.OnClickListener {


    private ImageView course;
    private ImageView train;
    private ImageView skill;

    public LearningAbilityFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_learning_ability;
    }

    @Override
    protected void initView(View view) {
        course = view.findViewById(R.id.course);
        train = view.findViewById(R.id.train);
        skill = view.findViewById(R.id.skill);

        course.setOnClickListener(this);
        train.setOnClickListener(this);
        skill.setOnClickListener(this);

    }

    @Override
    protected void initData(View view) {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.course:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.train:
                startActivity(new Intent(getActivity(), TrainActivity.class));
                break;
            case R.id.skill:
                startActivity(new Intent(getActivity(), SkillActivity.class));
                break;
        }

    }
}
