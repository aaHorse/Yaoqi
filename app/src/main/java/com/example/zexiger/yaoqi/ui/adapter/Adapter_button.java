package com.example.zexiger.yaoqi.ui.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.Bean;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;
import com.orhanobut.logger.Logger;

import java.util.List;

public class Adapter_button
        extends BaseMultiItemQuickAdapter<Bean, BaseViewHolder> {

    public Adapter_button(List<Bean> data) {
        super(data);
        addItemType(Bean.TYPE_1, R.layout.item_button);
    }

    @Override
    protected void convert(BaseViewHolder helper,Bean item) {
        switch (helper.getItemViewType()){
            case Bean.TYPE_1:
                helper.setText(R.id.bt_item_button_1,item.getStr());
                break;
            default:
                Logger.d("匹配出错");
        }
    }
}