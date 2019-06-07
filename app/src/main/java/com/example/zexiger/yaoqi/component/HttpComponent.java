package com.example.zexiger.yaoqi.component;


import com.example.zexiger.yaoqi.ui.aboutme.FragmentAboutme;
import com.example.zexiger.yaoqi.ui.bookrack.ActivitySearch;
import com.example.zexiger.yaoqi.ui.bookrack.FragmentBookrack;
import com.example.zexiger.yaoqi.ui.common.ActivitySpecific;
import com.example.zexiger.yaoqi.ui.common.ActivitySpecificContent;
import com.example.zexiger.yaoqi.ui.discover.FragmentDiscover;
import com.example.zexiger.yaoqi.ui.update.FragmentUpdateContent;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
public interface HttpComponent {
    void inject(FragmentBookrack fragmentBookrack);
    void inject(FragmentUpdateContent fragmentUpdateContent);
    void inject(FragmentDiscover fragmentDiscover);
    void inject(ActivitySpecific activitySpecific);
    void inject(ActivitySpecificContent activitySpecificContent);
    void inject(FragmentAboutme aboutme);
    void inject(ActivitySearch activitySearch);
}
