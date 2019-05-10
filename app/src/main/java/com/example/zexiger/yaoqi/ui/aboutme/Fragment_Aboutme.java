package com.example.zexiger.yaoqi.ui.aboutme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;

public class Fragment_Aboutme extends SupportFragment {
    public static Fragment_Aboutme newInstance(){
        Bundle bundle=new Bundle();
        Fragment_Aboutme fragment_aboutme=new Fragment_Aboutme();
        fragment_aboutme.setArguments(bundle);
        return fragment_aboutme;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_aboutme,container,false);
        return view;
    }

}
