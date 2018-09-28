package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class MySettingActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar setting_toolbar;
    /**
     * 18510410068
     */
    private TextView setting_phone_text;
    /**
     * 未绑定
     */
    private TextView setting_weixin_text;
    private RelativeLayout setting_weixin_clike;
    /**
     * 未绑定
     */
    private TextView setting_qq_text;
    private RelativeLayout setting_qq_clike;
    /**
     * 清除缓存
     */
    private TextView setting_cache_text;
    private RelativeLayout setting_cache_clike;
    private RelativeLayout setting_blacklist_clike;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_setting;
    }

    @Override
    protected void initView() {

        //
        setting_toolbar = (Toolbar) findViewById(R.id.setting_toolbar);
        setting_phone_text = (TextView) findViewById(R.id.setting_phone_text);
        setting_weixin_text = (TextView) findViewById(R.id.setting_weixin_text);
        setting_weixin_clike = (RelativeLayout) findViewById(R.id.setting_weixin_clike);
        setting_weixin_clike.setOnClickListener(this);
        setting_qq_text = (TextView) findViewById(R.id.setting_qq_text);
        setting_qq_clike = (RelativeLayout) findViewById(R.id.setting_qq_clike);
        setting_qq_clike.setOnClickListener(this);
        setting_cache_text = (TextView) findViewById(R.id.setting_cache_text);
        setting_cache_clike = (RelativeLayout) findViewById(R.id.setting_cache_clike);
        setting_cache_clike.setOnClickListener(this);
        setting_blacklist_clike = (RelativeLayout) findViewById(R.id.setting_blacklist_clike);
        setting_blacklist_clike.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(setting_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.setting_weixin_clike:
                break;
            case R.id.setting_qq_clike:
                break;
            case R.id.setting_cache_clike:
                break;
            case R.id.setting_blacklist_clike:
                break;
        }
    }
}
