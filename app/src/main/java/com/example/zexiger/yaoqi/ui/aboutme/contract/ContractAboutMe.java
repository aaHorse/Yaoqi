package com.example.zexiger.yaoqi.ui.aboutme.contract;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractAboutMe {
    interface View extends BaseContract.BaseView{

        void loadData(BeanAboutMe beanAboutMe);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData();

    }
}
