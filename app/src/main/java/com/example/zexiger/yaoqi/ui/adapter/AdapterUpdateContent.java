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

public class AdapterUpdateContent
        extends BaseMultiItemQuickAdapter<BeanUpdate.DataBean.ReturnDataBean.ComicsBean,
                BaseViewHolder> {
    public AdapterUpdateContent(List<BeanUpdate.DataBean.ReturnDataBean.ComicsBean> data) {
        super(data);
        addItemType(BeanUpdate.DataBean.ReturnDataBean.ComicsBean.TYPE_1,R.layout.item_update);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanUpdate.DataBean.ReturnDataBean.ComicsBean item) {
        switch (helper.getItemViewType()){
            case BeanUpdate.DataBean.ReturnDataBean.ComicsBean.TYPE_1:
                helper.setText(R.id.text_update,item.getTitle());
                Glide.with(MyApp.getContext()).load(item.getCover()).into((ImageView)helper.getView(R.id.image_update));
                break;
            default:
                Logger.d("出错啦");
        }
    }
}
