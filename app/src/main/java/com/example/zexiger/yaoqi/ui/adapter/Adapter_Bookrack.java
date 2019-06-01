package com.example.zexiger.yaoqi.ui.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.orhanobut.logger.Logger;

import java.util.List;

public class Adapter_Bookrack
        extends BaseMultiItemQuickAdapter<BeanBookrack.DataBean.ReturnDataBean.FavListBean, BaseViewHolder> {

    public Adapter_Bookrack(List<BeanBookrack.DataBean.ReturnDataBean.FavListBean> data) {
        super(data);
        addItemType(BeanBookrack.DataBean.ReturnDataBean.FavListBean.TYPE_1, R.layout.item_bookrack);
        addItemType(BeanBookrack.DataBean.ReturnDataBean.FavListBean.TYPE_2, R.layout.item_bookrack_2);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanBookrack.DataBean.ReturnDataBean.FavListBean item) {
        switch (helper.getItemViewType()){
            case BeanBookrack.DataBean.ReturnDataBean.FavListBean.TYPE_1:
                helper.setText(R.id.text_bookrack,item.getName());
                Glide.with(MyApp.getContext()).load(item.getCover()).into((ImageView)helper.getView(R.id.image_bookrack));
                helper.addOnClickListener(R.id.line_bookract);
                break;
            case BeanBookrack.DataBean.ReturnDataBean.FavListBean.TYPE_2:
                break;
            default:
                Logger.d("匹配出错");
        }
    }
}
