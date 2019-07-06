package com.example.zexiger.yaoqi.ui.adapter;


import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.orhanobut.logger.Logger;

import java.util.List;

public class AdapterLoad
        extends BaseMultiItemQuickAdapter<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean, BaseViewHolder> {
    public AdapterLoad(List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean> lists){
        super(lists);
        addItemType(BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1,R.layout.item_load_1);
    }
    private BaseViewHolder helper;

    @Override
    protected void convert(BaseViewHolder helper_, BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean item) {
        this.helper=helper_;
        switch (item.getItemType()){
            case BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1:
                helper.setText(R.id.tv_item_load_1_1,item.getIndex()+"");
                if(item.isLoad()){
                    Glide.with(MyApp.getContext()).load(R.drawable.is_load)
                            .override(40, 40)
                            .into((ImageView) helper.getView(R.id.iv_item_load_1_2));
                }else if(item.isChecked()){
                    Glide.with(MyApp.getContext()).load(R.drawable.load)
                            .override(40, 40)
                            .into((ImageView) helper.getView(R.id.iv_item_load_1_2));
                } else{
                    Glide.with(MyApp.getContext()).load(R.drawable.kong)
                            .override(40, 40)
                            .into((ImageView) helper.getView(R.id.iv_item_load_1_2));
                }
                func_1(item.getType());
                break;
            default:
                Logger.d("出错啦");
        }
    }

    /*
    * 显示不同的标识
    * 无 0，vip 3，妖气购买 2，其他 default
    * */
    private void func_1(int sign){
        switch (sign){
            case 0:
                Glide.with(MyApp.getContext()).load(R.drawable.kong)
                        .override(40, 40)
                        .into((ImageView) helper.getView(R.id.iv_item_load_1_1));
                break;
            case 2:
                Glide.with(MyApp.getContext()).load(R.drawable.money)
                        .override(40, 40)
                        .into((ImageView) helper.getView(R.id.iv_item_load_1_1));
                break;
            case 3:
                Glide.with(MyApp.getContext()).load(R.drawable.vip)
                        .override(40, 40)
                        .into((ImageView) helper.getView(R.id.iv_item_load_1_1));
                break;
            default:
                Glide.with(MyApp.getContext()).load(R.drawable.another)
                        .override(40, 40)
                        .into((ImageView) helper.getView(R.id.iv_item_load_1_1));
                break;
        }
    }
}
