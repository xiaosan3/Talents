package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Follow_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Follow_SubAdapter extends BaseQuickAdapter<Follow_Data, BaseViewHolder> {
    public Follow_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Follow_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Follow_Data item) {

    }
}
