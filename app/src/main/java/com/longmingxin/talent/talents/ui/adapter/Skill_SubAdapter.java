package com.longmingxin.talent.talents.ui.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.bean.Skill_Data;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ASUS on 2018/9/21.
 */

public class Skill_SubAdapter extends BaseQuickAdapter<Skill_Data,BaseViewHolder> {
    private Context context;
    public     Onclick onclick;

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    public Skill_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Skill_Data> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(final BaseViewHolder helper, Skill_Data item) {
        ImageView image = helper.getView(R.id.skill_image);
        ImageView image_measuring = helper.getView(R.id.skill_measuring);
        Picasso.with(mContext).load(R.drawable.learning_ability).into(image);
        helper.setText(R.id.skill_type,item.getSkill_type())
                .setText(R.id.skill_content,item.getSkill_content())
                .setText(R.id.skill_time,item.getSill_time())
                .addOnClickListener(R.id.skill_measuring);
        image_measuring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onclick!=null){
                    onclick.onclicks(view,helper.getAdapterPosition());
                }
            }
        });
    }
    public interface  Onclick{
        void onclicks(View v,int option);
    }

}
