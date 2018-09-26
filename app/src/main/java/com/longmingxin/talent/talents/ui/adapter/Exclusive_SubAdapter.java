package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.bean.Exclusive_Data;

import java.util.List;

/**
 * Created by ASUS on 2018/9/26.
 */

public class Exclusive_SubAdapter extends BaseQuickAdapter<Exclusive_Data,BaseViewHolder> {
    public Exclusive_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Exclusive_Data> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Exclusive_Data item) {
        helper.setText(R.id.exclusive_Engineer,item.getExclusive_Engineer())
                .setText(R.id.exclusive_price,item.getExclusive_price())
                .setText(R.id.exclusive_company,item.getExclusive_company())
                .setText(R.id.exclusive_position,item.getExclusive_position())
                .setText(R.id.exclusive_Education,item.getExclusive_Education());
    }
}
