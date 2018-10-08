package com.longmingxin.talent.talents.ui.fragments;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseActivity;
import com.longmingxin.talent.talents.base.BaseFragment;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setPicturePresenter;
import com.longmingxin.talent.talents.ui.login.Account_ForgetActivity;
import com.longmingxin.talent.talents.ui.login.LoginActivity;
import com.longmingxin.talent.talents.ui.newactivity.CourseActivity;
import com.longmingxin.talent.talents.ui.newactivity.SkillActivity;
import com.longmingxin.talent.talents.ui.newactivity.TrainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LearningAbilityFragment extends BaseFragment implements View.OnClickListener {


    private ImageView course;
    private ImageView train;
    private ImageView skill;

    public LearningAbilityFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_learning_ability;
    }

    @Override
    protected void initView(View view) {
        course = view.findViewById(R.id.course);
        train = view.findViewById(R.id.train);
        skill = view.findViewById(R.id.skill);

        course.setOnClickListener(this);
        train.setOnClickListener(this);
        skill.setOnClickListener(this);

    }

    @Override
    protected void initData(View view) {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.course:
                startActivity(new Intent(getActivity(), CourseActivity.class));
                break;
            case R.id.train:
                startActivity(new Intent(getActivity(), TrainActivity.class));
                break;
            case R.id.skill:
                startActivity(new Intent(getActivity(), SkillActivity.class));
                break;
        }

    }

    public static class Login_Account_numberActivity extends BaseActivity<setPicturePresenter> implements View.OnClickListener, Contract.IGetPictureView {


        private LinearLayout account_Quick;
        private EditText account_userName;
        private EditText account_userPassWord;
        private EditText account_userYanZhengMa;
        private ImageView loging_Number_of_seconds;
        private Button account_But;
        private TextView account_Forget;
        private TextView account_register;
        private ImageView account_Wechat;
        private ImageView account_WeiBo;
        private ImageView account_QQ;


        @Override
        protected int getContentView() {
            return R.layout.activity_login__account_number;
        }

        @Override
        protected void initView() {
            account_Quick = (LinearLayout) findViewById(R.id.account_Quick);
            account_userName = (EditText) findViewById(R.id.account_userName);
            account_userPassWord = (EditText) findViewById(R.id.account_userPassWord);
            account_userYanZhengMa = (EditText) findViewById(R.id.account_userYanZhengMa);
            loging_Number_of_seconds = (ImageView) findViewById(R.id.loging_Number_of_seconds);
            account_But = (Button) findViewById(R.id.account_But);
            account_Forget = (TextView) findViewById(R.id.account_Forget);
            account_register = (TextView) findViewById(R.id.account_register);
            account_Wechat = (ImageView) findViewById(R.id.account_Wechat);
            account_WeiBo = (ImageView) findViewById(R.id.account_WeiBo);
            account_QQ = (ImageView) findViewById(R.id.account_QQ);
            loging_Number_of_seconds.setOnClickListener(this);
            account_Quick.setOnClickListener(this);
            account_Forget.setOnClickListener(this);
            account_But.setOnClickListener(this);
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
                case R.id.account_Quick:
                    startActivity(new Intent(this, LoginActivity.class));
                    finish();
                    break;
                case R.id.account_Forget:
                    startActivity(new Intent(this, Account_ForgetActivity.class));
                    break;
                case R.id.account_But:
                    presenter.setLogin(account_userName.getText().toString().trim(),account_userPassWord.getText().toString().trim(),account_userYanZhengMa.getText().toString().trim());
                    break;
                case R.id.loging_Number_of_seconds:
                    //点击切换图形验证码
                    presenter.setPicture(account_userName.getText().toString().trim());
                    break;
            }

        }

        @Override
        public void showMessage(String message) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void showContent(String content) {
            Bitmap bitmap = base64ToBitmap(content);
            loging_Number_of_seconds.setImageBitmap(bitmap);
        }

        public static Bitmap base64ToBitmap(String base64Data) {
            byte[] bytes = Base64.decode(base64Data, Base64.DEFAULT);
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        @Override
        public void showIntent() {
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}
