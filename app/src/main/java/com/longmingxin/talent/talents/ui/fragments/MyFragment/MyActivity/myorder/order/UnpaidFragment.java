package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.myorder.order;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UnpaidFragment extends BaseFragment implements View.OnClickListener {

    private View view;
    private ImageView unpaid_video;
    /**
     * 工业机器人入门实用课程
     */
    private TextView unpaid_name;
    /**
     * 课时：7
     */
    private TextView unpaid_hour;
    /**
     * 视频
     */
    private TextView unpaid_videtype;
    /**
     * 来源：内购
     */
    private TextView unpaid_degree;
    /**
     * 需要支付：¥18.00
     */
    private TextView unpaid_money;
    /**
     * 取消订单
     */
    private TextView unpaid_cancel_order;
    /**
     * 立即支付
     */
    private TextView unpaid_payment_ok;

    @Override
    protected int getCreateView() {
        return R.layout.fragment_unpaid;
    }

    @Override
    protected void initView(View view) {

        unpaid_video = (ImageView) view.findViewById(R.id.unpaid_video);
        unpaid_video.setOnClickListener(this);
        unpaid_name = (TextView) view.findViewById(R.id.unpaid_name);
        unpaid_hour = (TextView) view.findViewById(R.id.unpaid_hour);
        unpaid_videtype = (TextView) view.findViewById(R.id.unpaid_videtype);
        unpaid_degree = (TextView) view.findViewById(R.id.unpaid_degree);
        unpaid_money = (TextView) view.findViewById(R.id.unpaid_money);
        unpaid_cancel_order = (TextView) view.findViewById(R.id.unpaid_cancel_order);
        unpaid_cancel_order.setOnClickListener(this);
        unpaid_payment_ok = (TextView) view.findViewById(R.id.unpaid_payment_ok);
        unpaid_payment_ok.setOnClickListener(this);
    }

    @Override
    protected void initData(View view) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.unpaid_video:
                break;
            case R.id.unpaid_cancel_order:
                break;
            case R.id.unpaid_payment_ok:
                break;
        }
    }
}
