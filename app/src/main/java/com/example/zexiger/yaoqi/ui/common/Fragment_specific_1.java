package com.example.zexiger.yaoqi.ui.common;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;

import java.util.List;

public class Fragment_specific_1 extends Fragment {
    public static void startFragment(List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean> lists_){
        lists=lists_;
        
    }

    private static List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_specific_1,container,false);
        return view;
    }
}
