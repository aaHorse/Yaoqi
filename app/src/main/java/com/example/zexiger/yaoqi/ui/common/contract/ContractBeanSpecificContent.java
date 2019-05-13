package com.example.zexiger.yaoqi.ui.common.contract;

import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractBeanSpecificContent {
    interface View extends BaseContract.BaseView{

        void loadData(BeanSpecificContent beanSpecificContent);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData(String chapter_id);

    }
}
