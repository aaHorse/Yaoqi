package com.example.zexiger.yaoqi.ui.update.presenter;

import com.example.zexiger.yaoqi.net.ApiUpdate;
import com.example.zexiger.yaoqi.net.ApiUpdateService;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.update.contract.ContractBeanUpdate;

import javax.inject.Inject;

public class PresenterBeanUpdate extends BasePresenter<ContractBeanUpdate.View> implements ContractBeanUpdate.Presenter{
    ApiUpdate apiUpdate;
    @Inject
    public PresenterBeanUpdate(ApiUpdate apiUpdate){
        this.apiUpdate=apiUpdate;
    }
    @Override
    public void getData() {

    }
}
