package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.myorder;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.ui.adapter.TabLayoutAdapter;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.myorder.order.PaidFragment;
import com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.myorder.order.UnpaidFragment;

import java.util.ArrayList;

public class MyOrderActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar order_toolbar;
    private TabLayout order_tablayout;
    private ViewPager order_viewpager;
    private ArrayList<String> arrayList;
    private ArrayList<Fragment> fragments;
    private TabLayoutAdapter tabLayoutAdapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_order;
    }

    @Override
    protected void initView() {

        order_toolbar = (Toolbar) findViewById(R.id.order_toolbar);
        order_toolbar.setOnClickListener(this);
        order_tablayout = (TabLayout) findViewById(R.id.order_tablayout);
        order_tablayout.setOnClickListener(this);
        order_viewpager = (ViewPager) findViewById(R.id.order_viewpager);
        order_viewpager.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        arrayList = new ArrayList<>();
        arrayList.add("未支付");
        arrayList.add("已支付");
        fragments = new ArrayList<>();
        fragments.add(new UnpaidFragment());
        fragments.add(new PaidFragment());
        tabLayoutAdapter = new TabLayoutAdapter(this.getSupportFragmentManager(), arrayList, fragments);
        order_viewpager.setAdapter(tabLayoutAdapter);
        //我让我的TabLayout和Fragment交互使用
        order_tablayout.setupWithViewPager(order_viewpager);

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(order_toolbar);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.order_tablayout:
                break;
            case R.id.order_viewpager:
                break;
            case R.id.order_toolbar:
                break;
        }
    }
}
