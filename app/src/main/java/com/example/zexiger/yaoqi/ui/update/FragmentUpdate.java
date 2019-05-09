package com.example.zexiger.yaoqi.ui.update;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.widget.DepthPageTransformer;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentUpdate extends SupportFragment {
    @BindView(R.id.tab_update)TabLayout tabLayout;
    @BindView(R.id.pager_update)ViewPager viewPager;

    public static FragmentUpdate newInstance() {
        Bundle args = new Bundle();
        FragmentUpdate fragment = new FragmentUpdate();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_update,container,false);
        ButterKnife.bind(this,view);

        final List<String> titles=new ArrayList<>();
        titles.add("周一");
        titles.add("周二");
        titles.add("周三");
        titles.add("周四");
        titles.add("周五");
        titles.add("周六");
        titles.add("周日");
        for(int i=0;i<titles.size();i++){
            tabLayout.addTab(tabLayout.newTab().setText(titles.get(i)));
        }
        final List<Fragment>fragments=new ArrayList<>();
        for(int i=0;i<titles.size();i++){
            //加入碎片
            FragmentUpdateContent fragmentUpdateContent=new FragmentUpdateContent();
            Bundle bundle=new Bundle();
            bundle.putString("day",""+i);
            fragmentUpdateContent.setArguments(bundle);
            fragments.add(fragmentUpdateContent);
            Logger.d("12345");
        }

        viewPager.setAdapter(new FragmentStatePagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return fragments.get(i);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                super.destroyItem(container, position, object);
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {

                return titles.get(position);
            }
        });
        viewPager.setPageTransformer(false,new DepthPageTransformer());
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.getTabAt(2).select();


        return view;
    }
}
