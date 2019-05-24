package com.example.zexiger.yaoqi.ui.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecificContent;

import java.util.List;

public class Adapter_Specific_Content
        extends BaseMultiItemQuickAdapter
        <BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean,BaseViewHolder> {
    public Adapter_Specific_Content(List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean>list){
        super(list);
        addItemType(BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean.TYPE_1,
                R.layout.item_specific_content);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean item) {
        int width=Integer.parseInt(item.getWidth());
        int height=Integer.parseInt(item.getHeight());
        Glide.with(MyApp.getContext()).load(item.getLocation())
                .override(width,height)
                .into((ImageView) helper.getView(R.id.image_specific_content));
    }
}
