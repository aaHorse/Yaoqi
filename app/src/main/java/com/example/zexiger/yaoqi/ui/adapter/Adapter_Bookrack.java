package com.example.zexiger.yaoqi.ui.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.orhanobut.logger.Logger;

import java.util.List;

public class Adapter_Bookrack
        extends BaseMultiItemQuickAdapter<BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX, BaseViewHolder> {

    public Adapter_Bookrack(List<BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX> data) {
        super(data);
        addItemType(BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX.TYPE_1, R.layout.item_bookrack);
        addItemType(BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX.TYPE_2, R.layout.item_bookrack);
        addItemType(BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX.TYPE_3, R.layout.item_bookrack);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX item) {
        switch (helper.getItemViewType()){
            case BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX.TYPE_1:
                helper.setText(R.id.text_1,"1");
                helper.setText(R.id.text_2,"2");
                break;
            case BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX.TYPE_2:
                helper.setText(R.id.text_1,"1");
                helper.setText(R.id.text_2,"2");
                break;
            case BeanBookrack.DataBean.ReturnDataBean.FavDefaultBean.ComicsBeanXX.TYPE_3:
                helper.setText(R.id.text_1,"1");
                helper.setText(R.id.text_2,"2");
                break;
            default:
                Logger.d("匹配出错");
        }
    }
}
