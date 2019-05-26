package com.example.zexiger.yaoqi.ui.adapter;

import android.opengl.Visibility;
import android.view.View;

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
    private BaseViewHolder helper;

    @Override
    protected void convert(BaseViewHolder helper_, BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean item) {
        this.helper=helper_;
        switch (item.getItemType()){
            case BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean.TYPE_1:
                helper.setText(R.id.tv_item_load_1_1,item.getIndex()+"");
                if(item.isLoad()){
                    //是否已经下载了
                    helper.setVisible(R.id.iv_item_load_1_2,true);
                }
                if(item.isChecked()){
                    helper.setVisible(R.id.iv_item_load_1_3,true);
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
                helper.setVisible(R.id.iv_item_load_1_1,false);//钱
                helper.setVisible(R.id.iv_item_load_1_4,false);//vip
                helper.setVisible(R.id.iv_item_load_1_5,false);//其他
                break;
            case 2:
                helper.setVisible(R.id.iv_item_load_1_1,true);//钱
                helper.setVisible(R.id.iv_item_load_1_4,false);//vip
                helper.setVisible(R.id.iv_item_load_1_5,false);//其他
                break;
            case 3:
                helper.setVisible(R.id.iv_item_load_1_1,false);//钱
                helper.setVisible(R.id.iv_item_load_1_4,true);//vip
                helper.setVisible(R.id.iv_item_load_1_5,false);//其他
                break;
            default:
                helper.setVisible(R.id.iv_item_load_1_1,false);//钱
                helper.setVisible(R.id.iv_item_load_1_4,false);//vip
                helper.setVisible(R.id.iv_item_load_1_5,true);//其他
                break;
        }
    }
}
