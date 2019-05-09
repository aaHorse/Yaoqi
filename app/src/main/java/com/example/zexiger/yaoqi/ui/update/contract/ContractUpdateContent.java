package com.example.zexiger.yaoqi.ui.update.contract;

import com.example.zexiger.yaoqi.bean.BeanUpdate;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractUpdateContent {
    interface View extends BaseContract.BaseView{
        void loadData(BeanUpdate beanUpdate);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void getData();
    }
}
