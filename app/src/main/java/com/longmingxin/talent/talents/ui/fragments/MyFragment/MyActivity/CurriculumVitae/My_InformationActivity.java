package com.longmingxin.talent.talents.ui.fragments.MyFragment.MyActivity.CurriculumVitae;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.Utils.toolbar.ToolBarUtils;
import com.longmingxin.talent.talents.base.BaseActivity;

public class My_InformationActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar info_toolbar;
    private ImageView info_head;
    /**
     * 小明
     */
    private TextView info_name;
    /**
     * 请输入身份证号
     */
    private EditText info_id;
    private RelativeLayout info_working_life;
    private RelativeLayout info_name_family;
    private RelativeLayout info_marital_status;
    private RelativeLayout info_permanent_address;
    private RelativeLayout info_present_address;
    private RelativeLayout info_special_description;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_information;
    }

    @Override
    protected void initView() {

        info_toolbar = (Toolbar) findViewById(R.id.info_toolbar);
        info_toolbar.setOnClickListener(this);
        info_head = (ImageView) findViewById(R.id.info_head);
        info_head.setOnClickListener(this);
        info_name = (TextView) findViewById(R.id.info_name);
        info_name.setOnClickListener(this);
        info_id = (EditText) findViewById(R.id.info_id);
        info_id.setOnClickListener(this);
        info_working_life = (RelativeLayout) findViewById(R.id.info_working_life);
        info_working_life.setOnClickListener(this);
        info_name_family = (RelativeLayout) findViewById(R.id.info_name_family);
        info_name_family.setOnClickListener(this);
        info_marital_status = (RelativeLayout) findViewById(R.id.info_marital_status);
        info_marital_status.setOnClickListener(this);
        info_permanent_address = (RelativeLayout) findViewById(R.id.info_permanent_address);
        info_permanent_address.setOnClickListener(this);
        info_present_address = (RelativeLayout) findViewById(R.id.info_present_address);
        info_present_address.setOnClickListener(this);
        info_special_description = (RelativeLayout) findViewById(R.id.info_special_description);
        info_special_description.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {
        ToolBarUtils.getInstance().setNavigation(info_toolbar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.info_head:
                break;
            case R.id.info_name:
                break;
            case R.id.info_id:
                break;
            case R.id.info_working_life:
                break;
            case R.id.info_name_family:
                break;
            case R.id.info_marital_status:
                break;
            case R.id.info_permanent_address:
                break;
            case R.id.info_present_address:
                break;
            case R.id.info_special_description:
                break;
        }
    }
}
