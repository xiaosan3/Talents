package com.longmingxin.talent.talents.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ASUS on 2018/10/7.
 */

public class Login_ViewPager extends FragmentPagerAdapter {

    private List<Fragment> mList;
    private List<String> mTitleList;

    public Login_ViewPager(FragmentManager fm, List<Fragment> mList, List<String> mTitleList) {
        super(fm);
        this.mList = mList;
        this.mTitleList = mTitleList;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList==null?"":mTitleList.get(position);
    }
}
