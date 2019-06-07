package com.example.zexiger.yaoqi.ui.bookrack.contract;

import com.example.zexiger.yaoqi.bean.BeanSearch;
import com.example.zexiger.yaoqi.bean.BeanSearchDefault;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractSearch {
    interface View extends BaseContract.BaseView{

        void loadData_0(BeanSearchDefault beanSearchDefault);
        void loadData(BeanSearch beanSearch);
        void loadData_2(BeanSearch_2 beanSearch_2);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void getData_0();
        void getData(String str);
        void getData_2(String str);

    }
}
