package com.example.zexiger.yaoqi.ui.aboutme;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.aboutme.contract.ContractAboutMe;
import com.example.zexiger.yaoqi.ui.aboutme.presenter.PresenterAboutMe;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.orhanobut.logger.Logger;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentAboutme
        extends BaseFragment<PresenterAboutMe> implements ContractAboutMe.View {

    public static FragmentAboutme newInstance(FragmentManager fragmentManager_){
        fragmentManager=fragmentManager_;
        Bundle bundle=new Bundle();
        FragmentAboutme fragment_aboutme=new FragmentAboutme();
        fragment_aboutme.setArguments(bundle);
        return fragment_aboutme;
    }

    public static FragmentManager fragmentManager;
    private static LinearLayout line_a;
    private static LinearLayout line_b;
    private static LinearLayout line_c;
    @BindView(R.id.edit_aboutme)EditText editText_1;
    @BindView(R.id.edit_aboutme_2)EditText editText_2;

    @Override
    public void loadData(BeanAboutMe beanAboutMe) {
         //Logger.d(beanAboutMe.getData().getReturnData().getUser().getBirthday());
        Logger.d(beanAboutMe.getData().getMessage());
    }

    @Override
    public int getContentLayout() {
        return R.layout.fragment_aboutme;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {
        DaggerHttpComponent.builder()
                .applicationComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        line_a=view.findViewById(R.id.line_aboutme_a);
        line_b=view.findViewById(R.id.line_aboutme_b);
        line_c=view.findViewById(R.id.line_aboutme_c);
        func_5();
    }

    @Override
    public void initData() {
        mPresenter.getData();
    }

    @OnClick(R.id.line_aboutme_1)void func_1(){
        func_4();
    }
    @OnClick(R.id.line_aboutme_2)void func_2(){
        ActivityQQ.startActivity(MyApp.getContext());
    }
    @OnClick(R.id.bt_aboutme)void func_6(){
        Logger.d(getBase64(editText_1.getText().toString()));
    }
    @OnClick(R.id.bt_aboutme_2)void func_7(){
        //获得验证码后，进行登录
    }

    /*
    * md5加密代码
    * */
    //加密
    public static String getBase64(String str){
        String result = "";
        if (str != null) {
            try {
                result = new String(Base64.encode(str.getBytes("utf-8"), Base64.NO_WRAP), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /*
    * 信息验证，QQ登录成功后，调用这一个函数进行显示关于我的主要信息
    * */
    public static void func(){
        func_3();
    }

    /*
    * 显示具体信息
    * */
    private static void func_3(){
        line_a.setVisibility(View.GONE);
        line_b.setVisibility(View.GONE);
        line_c.setVisibility(View.VISIBLE);
    }

    /*
    * 显示短息登录界面
    * */
    private static void func_4(){
        line_a.setVisibility(View.GONE);
        line_b.setVisibility(View.VISIBLE);
        line_c.setVisibility(View.GONE);
    }

    /*
    * 显示登录界面
    * */
    private static void func_5(){
        line_a.setVisibility(View.VISIBLE);
        line_b.setVisibility(View.GONE);
        line_c.setVisibility(View.GONE);
    }
}
