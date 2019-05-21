package com.example.zexiger.yaoqi.ui.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.FragmentManager;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.database.InitClass;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.ui.aboutme.contract.ContractAboutMe;
import com.example.zexiger.yaoqi.ui.aboutme.presenter.PresenterAboutMe;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.orhanobut.logger.Logger;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import butterknife.BindView;
import butterknife.OnClick;

import static com.example.zexiger.yaoqi.MainActivity.isLogin;

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
    private String num="";//加密后的电话号码
    private String num_2="";//加密后的短信验证码
    public static final int CODE = 1001;//请求码
    private String android_id;

    @Override
    public void loadData(BeanAboutMe beanAboutMe) {
        API.key=beanAboutMe.getData().getReturnData().getKey();
        InitClass initClass=new InitClass();
        initClass.setLogin(true);
        initClass.setKey(API.key);
        initClass.save();
        isLogin=true;
        func_3();
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
        android_id=Settings.System.getString(MyApp.getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        Logger.d(android_id);
        line_a=view.findViewById(R.id.line_aboutme_a);
        line_b=view.findViewById(R.id.line_aboutme_b);
        line_c=view.findViewById(R.id.line_aboutme_c);
        if(isLogin){
            func_3();
        }else{
            func_5();
        }
    }

    //懒加载调用的方法
    @Override
    public void initData() {
        //mPresenter.getData();
    }

    @Override
    public void showError(String str) {
        T(str);//270829
    }

    @OnClick(R.id.line_aboutme_1)void func_1(){
        func_4();
    }
    @OnClick(R.id.line_aboutme_2)void func_2(){
        Intent intent = new Intent();
        intent.setClass(getActivity(), ActivityQQ.class);
        startActivityForResult(intent,CODE);
    }
    @OnClick(R.id.bt_aboutme)void func_6(){
        num=getBase64(editText_1.getText().toString());
        mPresenter.submit(num);
    }

    /*
    * 获得验证码后，进行登录
    * */
    @OnClick(R.id.bt_aboutme_2)void func_7(){
        num_2=getBase64(editText_2.getText().toString());
        Logger.d(num+"*"+num_2);
        if(android_id==null){
            T("无法获取设备号，登录失败");
        }else if(num.isEmpty()){
            T("请先获取验证码");
        }else if(num_2.isEmpty()){
            T("尚未填写验证码");
        }else{
            mPresenter.submit_2(num,num_2,android_id,"mobile");
        }
    }

    /*
    * md5加密代码
    * */
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
    * QQ登录成功后，获取openid等，在这一个函数进行登录
    * */
    public void func_qq(String open_id,String access_token){
        mPresenter.submit_3(open_id,access_token,android_id,"qq");
    }

    /*
    *调用QQ登录后，返回open_id和assess_token
    * */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case CODE:
                if(resultCode==RESULT_OK){
                    Bundle bundle=data.getExtras();
                    String open_id=bundle.getString("open_id");
                    String access_token=bundle.getString("access_token");
                    func_qq(open_id,access_token);
                }
        }

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
