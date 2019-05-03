package com.example.zexiger.yaoqi.ui.bookrack.contract;

import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractBeanBookrack {
    interface View extends BaseContract.BaseView{

        void loadData(BeanBookrack bookrack);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData();

    }
}
