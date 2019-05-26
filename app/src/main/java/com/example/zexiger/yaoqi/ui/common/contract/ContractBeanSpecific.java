package com.example.zexiger.yaoqi.ui.common.contract;

import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.BeanSpecific_dynamic;
import com.example.zexiger.yaoqi.bean.Status;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractBeanSpecific {
    interface View extends BaseContract.BaseView{

        void loadData(BeanSpecific_combine beanSpecificCombine);

        void loadData_2(BeanSpecific_dynamic beanSpecific_dynamic);

        void loadData_3(Status status);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData(String comicid);

        void getData_2(String comicid);

        //收藏
        void favorite_3(String data_,int query);

    }
}
