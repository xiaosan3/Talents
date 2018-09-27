package com.longmingxin.talent.talents.ui.register;

import android.view.View;
import android.widget.ImageView;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;

public class Register_AgreementActivity extends BaseActivity implements View.OnClickListener{

    private ImageView register_return_button;

    @Override
    protected int getContentView() {
        return R.layout.activity_register__agreement;
    }

    @Override
    protected void initView() {
        register_return_button = (ImageView) findViewById(R.id.register_return_button);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolBar() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register_return_button:
                finish();
                break;
        }
    }
}
