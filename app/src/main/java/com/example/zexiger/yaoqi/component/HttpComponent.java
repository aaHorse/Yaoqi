package com.example.zexiger.yaoqi.component;


import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.example.zexiger.yaoqi.ui.discover.FragmentDiscover;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdate;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdateContent;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
public interface HttpComponent {

    void inject(FragmentBookrack fragmentBookrack);
    void inject(FragmentUpdateContent fragmentUpdateContent);
    void inject(FragmentDiscover fragmentDiscover);
}
