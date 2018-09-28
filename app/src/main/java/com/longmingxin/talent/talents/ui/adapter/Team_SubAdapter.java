package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.bean.Team_Data;

import java.util.List;

/**
 * Created by EDZ on 2018/9/27.
 */

public class Team_SubAdapter extends BaseQuickAdapter<Team_Data, BaseViewHolder> {
    public Team_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Team_Data> data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Team_Data item) {

    }
}
