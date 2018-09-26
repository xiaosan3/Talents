package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.bean.Course_Data;

import java.util.List;

/**
 * Created by ASUS on 2018/9/26.
 */

public class Course_SubAdapter extends BaseQuickAdapter<Course_Data, BaseViewHolder> {
    public Course_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Course_Data> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Course_Data item) {
        helper.setText(R.id.course_Open_class,item.getCourse_Open_class())
                .setText(R.id.course_KeShi,item.getCourse_KeShi())
                .setText(R.id.course_content,item.getCourse_content())
                .setText(R.id.course_BaoMing,item.getCourse_BaoMing())
                .setText(R.id.course_RenShu,item.getCourse_RenShu());
    }
}
