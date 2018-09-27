package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Records_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Records_SubAdapter extends BaseQuickAdapter<Records_Data, BaseViewHolder> {
    public Records_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Records_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Records_Data item) {

    }
}
