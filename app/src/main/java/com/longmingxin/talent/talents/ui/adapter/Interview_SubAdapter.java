package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Interview_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Interview_SubAdapter extends BaseQuickAdapter<Interview_Data, BaseViewHolder> {
    public Interview_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Interview_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Interview_Data item) {

    }
}
