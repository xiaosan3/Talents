package com.longmingxin.talent.talents.ui.login.newfragment;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.longmingxin.talent.talents.R;
import com.longmingxin.talent.talents.base.BaseFragment;
import com.longmingxin.talent.talents.mvp.contract.Contract;
import com.longmingxin.talent.talents.mvp.presenter.setPicturePresenter;
import com.longmingxin.talent.talents.ui.login.Account_ForgetActivity;
import com.longmingxin.talent.talents.ui.login.Login_ToActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Account_numberFragment extends BaseFragment<setPicturePresenter> implements View.OnClickListener, Contract.IGetPictureView {

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

    public Account_numberFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getCreateView() {
        return R.layout.fragment_account_number;
    }

    @Override
    protected void initView(View view) {

        account_userName = view.findViewById(R.id.account_userName);
        account_userPassWord = view.findViewById(R.id.account_userPassWord);
        account_userYanZhengMa = view.findViewById(R.id.account_userYanZhengMa);
        loging_Number_of_seconds = view.findViewById(R.id.loging_Number_of_seconds);
        account_But = view.findViewById(R.id.account_But);
        account_Forget = view.findViewById(R.id.account_Forget);
        account_register = view.findViewById(R.id.account_register);
        account_Wechat = view.findViewById(R.id.account_Wechat);
        account_WeiBo = view.findViewById(R.id.account_WeiBo);
        account_QQ = view.findViewById(R.id.account_QQ);
        loging_Number_of_seconds.setOnClickListener(this);
        account_Forget.setOnClickListener(this);
        account_But.setOnClickListener(this);
        account_userName.setOnClickListener(this);

    }

    @Override
    protected void initData(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.account_Forget:
                startActivity(new Intent(getActivity(), Account_ForgetActivity.class));
                break;
            case R.id.account_But:
                presenter.setLogin(account_userName.getText().toString().trim(), account_userPassWord.getText().toString().trim(), account_userYanZhengMa.getText().toString().trim());
                break;
            case R.id.account_userName:
                if (account_userName.getText().toString().trim().length()==11) {
                    presenter.setPicture(account_userName.getText().toString().trim());
                }else {
                    Toast.makeText(getActivity(), "手机号格式不正确！", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.loging_Number_of_seconds:
                //点击切换图形验证码
                 //   presenter.setPicture(account_userName.getText().toString().trim());
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
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
        startActivity(new Intent(getActivity(), Login_ToActivity.class));
    }
}
