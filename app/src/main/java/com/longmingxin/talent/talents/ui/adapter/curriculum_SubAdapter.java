package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.curriculum_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class curriculum_SubAdapter extends BaseQuickAdapter<curriculum_Data, BaseViewHolder> {
    public curriculum_SubAdapter(@LayoutRes int layoutResId, @Nullable List<curriculum_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, curriculum_Data item) {

    }
}
