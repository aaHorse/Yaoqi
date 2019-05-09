package com.example.zexiger.yaoqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdate;
import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    private SupportFragment[] mFragments = new SupportFragment[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void onRetry() {

    }

    @Override
    public int getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {

    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            mFragments[0] = FragmentBookrack.newInstance();
            mFragments[1]=FragmentUpdate.newInstance();
            getSupportDelegate().loadMultipleRootFragment(R.id.contentContainer, 0,
                    mFragments[0],mFragments[1]);
        } else {
            mFragments[0] = findFragment(FragmentBookrack.class);
            mFragments[1]=findFragment(FragmentUpdate.class);
        }
    }

    @Override
    public void initData() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @OnClick(R.id.line_1_main)void button_1(){
        getSupportDelegate().showHideFragment(mFragments[1], mFragments[0]);
    }
    @OnClick(R.id.line_2_main)void button_2(){

    }
    @OnClick(R.id.line_3_main)void button_3(){

    }
    @OnClick(R.id.line_4_main)void button_4(){

    }
}
