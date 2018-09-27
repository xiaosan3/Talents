package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Notice_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Notice_SubAdapter extends BaseQuickAdapter<Notice_Data, BaseViewHolder> {
    public Notice_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Notice_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Notice_Data item) {

    }
}
