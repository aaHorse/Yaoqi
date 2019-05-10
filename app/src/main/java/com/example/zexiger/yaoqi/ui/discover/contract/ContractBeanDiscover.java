package com.example.zexiger.yaoqi.ui.discover.contract;

import com.example.zexiger.yaoqi.bean.BeanDiscover;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractBeanDiscover {
    interface View extends BaseContract.BaseView{

        void loadData(BeanDiscover beanDiscover);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData();

    }
}
