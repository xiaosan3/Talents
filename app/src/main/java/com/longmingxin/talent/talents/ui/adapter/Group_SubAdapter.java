package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Group_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Group_SubAdapter extends BaseQuickAdapter<Group_Data, BaseViewHolder> {
    public Group_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Group_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Group_Data item) {

    }
}
