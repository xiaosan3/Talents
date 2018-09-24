package com.longmingxin.talent.talents.ui.fragments;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment implements View.OnClickListener {


    private View view;
    private ImageView mMyHead;
    /**
     * 点击登录
     */
    private TextView mClikeLogini;
    /**
     * 未登录
     */
    private TextView mNotLogged;
    private RelativeLayout mMyJianli;
    private RelativeLayout mMyToudi;
    private RelativeLayout mMyMiahsi;
    private RelativeLayout mMyKecheng;
    private RelativeLayout mMyDingdan;
    private RelativeLayout mMyGuanzhu;
    private RelativeLayout mMyXiaoxi;
    private RelativeLayout mMyZuzhi;
    private RelativeLayout mMyGuanyu;
    private RelativeLayout mMyShezhi;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView(View view) {

        mMyHead = (ImageView) view.findViewById(R.id.my_head);
        mClikeLogini = (TextView) view.findViewById(R.id.clike_logini);
        mNotLogged = (TextView) view.findViewById(R.id.not_logged);
        mMyJianli = (RelativeLayout) view.findViewById(R.id.my_jianli);
        mMyToudi = (RelativeLayout) view.findViewById(R.id.my_toudi);
        mMyMiahsi = (RelativeLayout) view.findViewById(R.id.my_miahsi);
        mMyKecheng = (RelativeLayout) view.findViewById(R.id.my_kecheng);
        mMyDingdan = (RelativeLayout) view.findViewById(R.id.my_dingdan);
        mMyGuanzhu = (RelativeLayout) view.findViewById(R.id.my_guanzhu);
        mMyXiaoxi = (RelativeLayout) view.findViewById(R.id.my_xiaoxi);
        mMyZuzhi = (RelativeLayout) view.findViewById(R.id.my_zuzhi);
        mMyGuanyu = (RelativeLayout) view.findViewById(R.id.my_guanyu);
        mMyShezhi = (RelativeLayout) view.findViewById(R.id.my_shezhi);
        mMyHead.setOnClickListener(this);
        mClikeLogini.setOnClickListener(this);
        mNotLogged.setOnClickListener(this);
        mMyJianli.setOnClickListener(this);
        mMyToudi.setOnClickListener(this);
        mMyMiahsi.setOnClickListener(this);
        mMyKecheng.setOnClickListener(this);
        mMyDingdan.setOnClickListener(this);
        mMyGuanzhu.setOnClickListener(this);
        mMyXiaoxi.setOnClickListener(this);
        mMyZuzhi.setOnClickListener(this);
        mMyGuanyu.setOnClickListener(this);
        mMyShezhi.setOnClickListener(this);
    }

    @Override
    protected void initData(View view) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.my_head:
                break;
            case R.id.clike_logini:
                break;
            case R.id.not_logged:
                break;
            case R.id.my_jianli:
                break;
            case R.id.my_toudi:
                break;
            case R.id.my_miahsi:
                break;
            case R.id.my_kecheng:
                break;
            case R.id.my_dingdan:
                break;
            case R.id.my_guanzhu:
                break;
            case R.id.my_xiaoxi:
                break;
            case R.id.my_zuzhi:
                break;
            case R.id.my_guanyu:
                break;
            case R.id.my_shezhi:
                break;
        }
    }
}
