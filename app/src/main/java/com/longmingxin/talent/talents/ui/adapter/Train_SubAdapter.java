package com.longmingxin.talent.talents.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.bean.Train_Data;

import java.util.List;

/**
 * Created by ASUS on 2018/9/26.
 */

public class Train_SubAdapter extends BaseQuickAdapter<Train_Data,BaseViewHolder> {
    public  Onclick onclick;
    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }
    public Train_SubAdapter(@LayoutRes int layoutResId, @Nullable List<Train_Data> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(final BaseViewHolder helper, Train_Data item) {
        RelativeLayout rl = helper.getView(R.id.train_RelativeLayout);
        helper.setText(R.id.train_SchoolName,item.getTrain_SchoolName())
                .setText(R.id.train_RuXue,item.getTrain_RuXue())
                .setText(R.id.train_TuiJianRenShu,item.getTrain_TuiJianRenShu())
                .setText(R.id.train_TeSe,item.getTrain_TeSe())
                .addOnClickListener(R.id.train_RelativeLayout);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onclick!=null){
                    onclick.onclicks(view,helper.getAdapterPosition());
                }
            }
        });

    }
    public interface  Onclick{
        void onclicks(View v, int option);
    }
}
