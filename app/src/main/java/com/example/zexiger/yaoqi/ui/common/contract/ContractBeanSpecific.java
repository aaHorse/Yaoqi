package com.example.zexiger.yaoqi.ui.common.contract;

import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.bean.BeanSpecific_2;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractBeanSpecific {
    interface View extends BaseContract.BaseView{

        void loadData(BeanSpecific beanSpecific);

        void loadData_2(BeanSpecific_2 beanSpecific_2);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData(String comicid);

        void getData_2(String comicid);

    }
}
