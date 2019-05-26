package com.example.zexiger.yaoqi.ui.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.orhanobut.logger.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Adapter_Load_1
        extends BaseMultiItemQuickAdapter<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean, BaseViewHolder> {
    public Adapter_Load_1(List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean> lists){
        super(lists);
        addItemType(BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1,R.layout.item_load_1);
    }

    @Override
    protected void convert(BaseViewHolder helper, BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean item) {
        switch (item.getItemType()){
            case BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1:
                helper.setText(R.id.tv_item_load_1_1,item.getIndex()+"");

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
