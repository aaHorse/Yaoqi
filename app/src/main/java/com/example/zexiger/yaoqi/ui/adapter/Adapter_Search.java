package com.example.zexiger.yaoqi.ui.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSearch;
import com.orhanobut.logger.Logger;

import java.util.List;

public class Adapter_Search
        extends BaseMultiItemQuickAdapter<BeanSearch.DataBean.ReturnDataBean, BaseViewHolder> {

    public Adapter_Search(List<BeanSearch.DataBean.ReturnDataBean> data) {
        super(data);
        addItemType(BeanSearch.DataBean.ReturnDataBean.TYPE_1, R.layout.item_search);
    }

    @Override
    protected void convert(BaseViewHolder helper,BeanSearch.DataBean.ReturnDataBean item) {
        switch (helper.getItemViewType()){
            case BeanSearch.DataBean.ReturnDataBean.TYPE_1:
                Logger.d("123");
                helper.setText(R.id.tv_item_search,item.getName());
                Logger.d("456");
                break;
            default:
                Logger.d("匹配出错");
        }
    }
}
