package com.example.zexiger.yaoqi.ui.update;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanUpdate;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_UpdateContent;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.example.zexiger.yaoqi.ui.update.contract.ContractUpdateContent;
import com.example.zexiger.yaoqi.ui.update.presenter.PresenterBeanUpdateContent;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class FragmentUpdateContent extends BaseFragment<PresenterBeanUpdateContent>
        implements ContractUpdateContent.View {
    @BindView(R.id.rv_update)RecyclerView recyclerView;
    private Adapter_UpdateContent adapter;
    private List<BeanUpdate.DataBean.ReturnDataBean.ComicsBean>lists=new ArrayList<>();
    String day;

    @Override
    public int getContentLayout() {
        return R.layout.fragment_update_content;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {
        DaggerHttpComponent.builder()
                .applicationComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        Bundle bundle=getArguments();
        day=bundle.getString("day");
    }



    @Override
    public void initData() {
        mPresenter.getData(day);
    }

    @Override
    public void loadData(BeanUpdate beanUpdate) {
        lists.clear();
        for(BeanUpdate.DataBean.ReturnDataBean.ComicsBean item:beanUpdate.getData().getReturnData().getComics()){
            item.setItemType(1);
            lists.add(item);
        }
       recyclerView.setLayoutManager(new LinearLayoutManager(MyApp.getContext()));
        adapter=new Adapter_UpdateContent(lists);
        recyclerView.setAdapter(adapter);
    }
}


