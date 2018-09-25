package com.longmingxin.talent.talents.ui.newactivity;

import android.view.View;
import android.widget.ImageView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;

public class MeasuringActivity extends BaseActivity implements View.OnClickListener {


    private ImageView measring_one;
    private ImageView measuring_return_button;

    @Override
    protected int getContentView() {
        return R.layout.activity_measuring;
    }

    @Override
    protected void initView() {
        measring_one = (ImageView) findViewById(R.id.measring_one);
        measuring_return_button = (ImageView) findViewById(R.id.measuring_return_button);
        measring_one.setOnClickListener(this);
        measuring_return_button.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.measring_one:
                break;
            case R.id.measuring_return_button:
                finish();
                break;
        }
    }
}
