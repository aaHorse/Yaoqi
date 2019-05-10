package com.example.zexiger.yaoqi;

import android.os.Bundle;
import android.view.View;


import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.ui.aboutme.Fragment_Aboutme;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.example.zexiger.yaoqi.ui.discover.FragmentDiscover;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdate;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    private SupportFragment[] mFragments = new SupportFragment[4];

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
            mFragments[2]=FragmentDiscover.newInstance();
            mFragments[3]=Fragment_Aboutme.newInstance();
            getSupportDelegate().loadMultipleRootFragment(R.id.contentContainer, 0,
                    mFragments[0],mFragments[1],mFragments[2],mFragments[3]);
        } else {
            mFragments[0] = findFragment(FragmentBookrack.class);
            mFragments[1]=findFragment(FragmentUpdate.class);
            mFragments[2]=findFragment(FragmentDiscover.class);
            mFragments[3]=findFragment(Fragment_Aboutme.class);
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
        getSupportDelegate().showHideFragment(mFragments[1]);
/*        FragmentUpdate fragmentUpdate=new FragmentUpdate();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.contentContainer,fragmentUpdate);
        transaction.commit();*/
    }
    @OnClick(R.id.line_2_main)void button_2(){
        getSupportDelegate().showHideFragment(mFragments[2]);
    }
    @OnClick(R.id.line_3_main)void button_3(){
        getSupportDelegate().showHideFragment(mFragments[0]);
    }
    @OnClick(R.id.line_4_main)void button_4(){
        getSupportDelegate().showHideFragment(mFragments[3]);
    }
}
