package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.bean.Train_Data;

import java.util.List;

/**
 * Created by ASUS on 2018/9/25.
 */

public class Train_SubAdapter extends BaseQuickAdapter<Train_Data,BaseViewHolder> {
    public Train_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Train_Data> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Train_Data item) {
        helper.setText(R.id.train_Welder,item.getTrain_Welder())
                .setText(R.id.train_price,item.getTrain_price())
                .setText(R.id.train_sign_up,item.getTrain_sign_up())
                .setText(R.id.train_tuijianruzhi,item.getTrain_tuijianruzhi());

    }
}
