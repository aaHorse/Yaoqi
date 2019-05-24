package com.example.zexiger.yaoqi.ui.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific_Content;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecificContent;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecificContent;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ActivitySpecificContent
        extends BaseActivity<PresenterSpecificContent> implements ContractBeanSpecificContent.View {
    public static void startActicity(Context context,List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists_,int position_){
        lists_chapter=lists_;
        position=position_;
        Intent intent=new Intent(context,ActivitySpecificContent.class);
        context.startActivity(intent);
    }

    private static List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists_chapter;
    private List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean>lists=new ArrayList<>();

    private static int position;
    @BindView(R.id.rv_specific_content)RecyclerView recyclerView;
    Adapter_Specific_Content adapter;


    @Override
    public int getContentLayout() {
        return R.layout.activity_specific_content;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {
        DaggerHttpComponent.builder()
                .applicationComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        //QMUIStatusBarHelper.translucent(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void initData() {
        BeanSpecific.DataBean.ReturnDataBean.ChapterListBean item=lists_chapter.get(position);
        mPresenter.getData(item.getChapter_id());
    }

    @Override
    public void loadData(BeanSpecificContent beanSpecificContent) {
        List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean> obj=beanSpecificContent.getData().getReturnData().getImage_list();
        for(int i=0;i<obj.size();i++){
            BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean item=obj.get(i);
            item.setItemType(1);
            lists.add(item);
        }
        adapter=new Adapter_Specific_Content(lists);
        recyclerView.setAdapter(adapter);
    }

    /*
    * 返回
    * */
    @OnClick(R.id.bt_specific_1)void func_1(){
        finish();
    }

    /*
    * 更多
    * */
    @OnClick(R.id.bt_specific_2)void func_2(){
        final String[] items = new String[]{"选项1", "选项2", "选项3"};
        new QMUIDialog.MenuDialogBuilder(this)
                .addItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create(com.qmuiteam.qmui.R.style.QMUI_Dialog).show();
    }

    /*
    * 下载
    * */
    @OnClick(R.id.bt_specific_3)void func_3(){
        T("下载");
    }
}
