package com.example.zexiger.yaoqi.ui.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanUpdate;
import com.orhanobut.logger.Logger;

import java.util.List;

public class Adapter_UpdateContent
        extends BaseMultiItemQuickAdapter<BeanUpdate.DataBean.ReturnDataBean.ComicsBean,
                BaseViewHolder> {
    public Adapter_UpdateContent(List<BeanUpdate.DataBean.ReturnDataBean.ComicsBean> data) {
        super(data);
        Logger.d(8);
        addItemType(BeanUpdate.DataBean.ReturnDataBean.ComicsBean.TYPE_1,R.layout.item_update);
        Logger.d(9);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanUpdate.DataBean.ReturnDataBean.ComicsBean item) {
        Logger.d("234");
        switch (helper.getItemViewType()){
            case BeanUpdate.DataBean.ReturnDataBean.ComicsBean.TYPE_1:
                Logger.d(5);
                helper.setText(R.id.text_update,item.getTitle());
                Logger.d(6);
                Glide.with(MyApp.getContext()).load(item.getCover()).into((ImageView)helper.getView(R.id.image_update));
                Logger.d(7);
                break;
            default:
                Logger.d("出错啦");
        }
    }
}
