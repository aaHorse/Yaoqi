package com.example.zexiger.yaoqi.component;


import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
public interface HttpComponent {

    void inject(FragmentBookrack fragmentBookrack);

}
