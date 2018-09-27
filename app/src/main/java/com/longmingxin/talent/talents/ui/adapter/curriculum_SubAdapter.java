package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Curriculum_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Curriculum_SubAdapter extends BaseQuickAdapter<Curriculum_Data, BaseViewHolder> {
    public Curriculum_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Curriculum_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Curriculum_Data item) {

    }
}
