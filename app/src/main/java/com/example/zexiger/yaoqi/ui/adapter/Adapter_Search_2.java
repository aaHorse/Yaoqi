package com.example.zexiger.yaoqi.ui.adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.Bean;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Search_2
        extends BaseMultiItemQuickAdapter<BeanSearch_2.DataBean.ReturnDataBean.ComicsBean, BaseViewHolder> {

    public Adapter_Search_2(List<BeanSearch_2.DataBean.ReturnDataBean.ComicsBean> data) {
        super(data);
        addItemType(BeanSearch_2.DataBean.ReturnDataBean.ComicsBean.TYPE_1, R.layout.item_search_2);
    }

    @Override
    protected void convert(BaseViewHolder helper,BeanSearch_2.DataBean.ReturnDataBean.ComicsBean item) {
        switch (helper.getItemViewType()){
            case BeanSearch_2.DataBean.ReturnDataBean.ComicsBean.TYPE_1:
                Glide.with(MyApp.getContext()).load(item.getCover())
                        .into((ImageView) helper.getView(R.id.iv_item_search_2_1));
                helper.setText(R.id.tv_item_search_2_1,item.getName());
                helper.setText(R.id.tv_item_search_2_2,item.getAuthor());

                List<Bean>lists=new ArrayList<>();
                for(int i=0;i<item.getTags().size();i++){
                    Bean bean=new Bean();
                    String str=item.getTags().get(i);
                    if(!str.isEmpty()){
                        bean.setStr(str);
                        lists.add(bean);
                    }
                }
                Adapter_button adapter_button=new Adapter_button(lists);
                RecyclerView recyclerView=helper.getView(R.id.rv_item_search_2);
                LinearLayoutManager layoutManager=new LinearLayoutManager(MyApp.getContext());
                layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter_button);
                break;
            default:
                Logger.d("匹配出错");
        }
    }
}

