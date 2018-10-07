package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.bean.HomePagerBean;

import java.util.List;

/**
 * Created by ASUS on 2018/9/26.
 */

public class Exclusive_SubAdapter extends BaseQuickAdapter<HomePagerBean.DataBean.JobsBean,BaseViewHolder> {
    public Exclusive_SubAdapter(@LayoutRes int layoutResId, @Nullable List<HomePagerBean.DataBean.JobsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomePagerBean.DataBean.JobsBean item) {
                helper.setText(R.id.exclusive_Engineer,item.getJobName())
                .setText(R.id.exclusive_price,item.getSalaryRange())
                .setText(R.id.exclusive_company,item.getEnterpriseName())
                .setText(R.id.exclusive_position,item.getLocation())
                .setText(R.id.exclusive_Education,item.getWorkExperience());
    }



}
