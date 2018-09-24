package com.longmingxin.talent.talents.ui.fragments;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobHuntingFragment extends BaseFragment implements View.OnClickListener {


    private TextView zai;

    public JobHuntingFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_job_hunting;
    }

    @Override
    protected void initView(View view) {
        zai = view.findViewById(R.id.zai);
        zai.setOnClickListener(this);

    }

    @Override
    protected void initData(View view) {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zai:
                Toast.makeText(getActivity(), "111", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
