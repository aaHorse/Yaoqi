package com.example.zexiger.yaoqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    private SupportFragment[] mFragments = new SupportFragment[1];

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

            getSupportDelegate().loadMultipleRootFragment(R.id.contentContainer, 0,
                    mFragments[0]);
        } else {
            mFragments[0] = findFragment(FragmentBookrack.class);
        }
    }

    @Override
    public void initData() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
