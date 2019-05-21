package com.example.zexiger.yaoqi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.zexiger.yaoqi.database.InitClass;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.ui.aboutme.FragmentAboutme;
import com.example.zexiger.yaoqi.ui.base.SupportActivity;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.example.zexiger.yaoqi.ui.discover.FragmentDiscover;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdate;

import org.litepal.crud.DataSupport;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends SupportActivity {
    public static void startActivity(Context context){
        Intent intent=new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }

    private SupportFragment[] mFragments = new SupportFragment[4];
    public static boolean isLogin=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        InitClass initClass=DataSupport.findLast(InitClass.class);

        if(initClass!=null){
            isLogin=initClass.isLogin();
            API.key=initClass.getKey();
        }
        if (savedInstanceState == null) {
            mFragments[0] = FragmentBookrack.newInstance();
            mFragments[1]=FragmentUpdate.newInstance();
            mFragments[2]=FragmentDiscover.newInstance();
            mFragments[3]=FragmentAboutme.newInstance(getSupportFragmentManager());
            if(isLogin){
                getSupportDelegate().loadMultipleRootFragment(R.id.contentContainer, 0,
                        mFragments[0],mFragments[1],mFragments[2],mFragments[3]);
            }else{
                getSupportDelegate().loadMultipleRootFragment(R.id.contentContainer, 3,
                        mFragments[0],mFragments[1],mFragments[2],mFragments[3]);
            }
        } else {
            mFragments[0] = findFragment(FragmentBookrack.class);
            mFragments[1]=findFragment(FragmentUpdate.class);
            mFragments[2]=findFragment(FragmentDiscover.class);
            mFragments[3]=findFragment(FragmentAboutme.class);
        }
    }




    @OnClick(R.id.line_1_main)void button_1(){
        getSupportDelegate().showHideFragment(mFragments[1]);
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
