package com.example.zexiger.yaoqi.ui.common.contract;

import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractBeanSpecific {
    interface View extends BaseContract.BaseView{

        void loadData(BeanSpecific beanSpecific);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData(String comicid);

    }
}
