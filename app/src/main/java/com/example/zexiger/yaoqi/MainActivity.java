package com.example.zexiger.yaoqi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;

import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.database.InitClass;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.ui.aboutme.FragmentAboutme;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.base.SupportActivity;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.example.zexiger.yaoqi.ui.discover.FragmentDiscover;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdate;
import com.hjm.bottomtabbar.BottomTabBar;

import org.litepal.crud.DataSupport;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    public static void startActivity(Context context){
        Intent intent=new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }

    public static boolean isLogin=false;
    private static BottomTabBar bottomTabBar;

    @Override
    public int getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {
        //
    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        final BottomTabBar bottomTabBar=view.findViewById(R.id.bottom_tab_bar);
        InitClass initClass=DataSupport.findLast(InitClass.class);

        if(initClass!=null){
            isLogin=initClass.isLogin();
            API.key=initClass.getKey();
        }

        bottomTabBar.init(getSupportFragmentManager())
                .setImgSize(25, 25)
                .addTabItem("更新", R.mipmap.today_select,R.mipmap.today_unselect, FragmentUpdate.class)
                .addTabItem("发现", R.mipmap.find_select,R.mipmap.find_unselect, FragmentDiscover.class)
                .addTabItem("书架", R.mipmap.book_select,R.mipmap.book_unselect, FragmentBookrack.class)
                .addTabItem("我的", R.mipmap.mine_select,R.mipmap.mine_unselect, FragmentAboutme.class)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name, View view) {
                        if(!isLogin){
                            bottomTabBar.setCurrentTab(3);
                            T("请登录");
                        }
                    }
                })
                .setCurrentTab(3);
    }

    public static void func(){
        bottomTabBar.setCurrentTab(0);
    }

    @Override
    public void initData() {
        //
    }
}
