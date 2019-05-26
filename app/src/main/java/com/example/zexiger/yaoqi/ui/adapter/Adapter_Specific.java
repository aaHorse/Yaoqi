package com.example.zexiger.yaoqi.ui.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.orhanobut.logger.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Adapter_Specific
        extends BaseMultiItemQuickAdapter<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean, BaseViewHolder> {
    public Adapter_Specific(List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean> lists){
        super(lists);
        addItemType(BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1,R.layout.item_specific);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean item) {
        switch (item.getItemType()){
            case BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1:
                helper.setText(R.id.text_specific_8,item.getName());
                helper.setText(R.id.text_specific_9,"第"+item.getIndex()+"话 "+func(item.getPublish_time()));

                //type = 0 是仅限VIP看
                if(item.getType()==0){
                    Glide.with(MyApp.getContext()).load(item.getSmallPlaceCover())
                            .into((ImageView) helper.getView(R.id.image_specific_4));
                }else{
                    Glide.with(MyApp.getContext()).load(R.drawable.vip_lock)
                            .into((ImageView) helper.getView(R.id.image_specific_4));
                }

                break;
            default:
                Logger.d("出错啦");
        }
    }

    private String func(int n){
        long nowTimeLong=new Long(n).longValue()*1000;
        DateFormat ymdhmsFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowTimeStr = ymdhmsFormat.format(nowTimeLong);
        return nowTimeStr;
    }
}
