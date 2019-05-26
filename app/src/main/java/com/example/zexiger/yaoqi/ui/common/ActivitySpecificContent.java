package com.example.zexiger.yaoqi.ui.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.database.InitClass;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific_Content;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecificContent;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecificContent;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ActivitySpecificContent
        extends BaseActivity<PresenterSpecificContent> implements ContractBeanSpecificContent.View {
    public static void startActicity(Context context, List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists_, int position_){
        lists_chapter=lists_;
        position=position_;
        Intent intent=new Intent(context,ActivitySpecificContent.class);
        context.startActivity(intent);
    }

    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists_chapter;
    private List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean>lists=new ArrayList<>();
    private static int position;
    @BindView(R.id.rv_specific_content)RecyclerView recyclerView;
    @BindView(R.id.rv_specific_content_2)RecyclerView recyclerView_2;
    Adapter_Specific_Content adapter;
    @BindView(R.id.line_specific_content_1)RelativeLayout relativeLayout_1;
    @BindView(R.id.line_specific_content_2)LinearLayout linearLayout_2;
    @BindView(R.id.line_specific_content_3)LinearLayout linearLayout_3;
    private static int posture=0;
    private static int flag=0;
    private static int flag_1=0;
    private static int flag_2=0;
    private static int flag_3=0;
    private static int flag_4=0;
    @BindView(R.id.tv_specific_content_1)TextView textView_1;
    @BindView(R.id.tv_specific_content_2)TextView textView_2;
    @BindView(R.id.tv_specific_content_3)TextView textView_3;
    @BindView(R.id.tv_specific_content_4)TextView textView_4;


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
        QMUIStatusBarHelper.translucent(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //
        LinearLayoutManager layoutManager_2=new LinearLayoutManager(this);
        layoutManager_2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_2.setLayoutManager(layoutManager_2);
        InitClass initClass=DataSupport.findLast(InitClass.class);
        posture=initClass.getPosture();
        if(posture==1){
            //显示平推
            func_7();
        }else{
            //显示卷纸
            func_8();
        }

        /*
        * 切换横竖屏更换UI只能在重新加载这里
        * */
        if(flag_1==0){
            textView_1.setText("横屏");
        }else{
            textView_1.setText("竖屏");
        }
    }

    @Override
    public void initData() {
        BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean item=lists_chapter.get(position);
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
        recyclerView_2.setAdapter(adapter);
        SnapHelper mSnapHelper=new PagerSnapHelper();
        mSnapHelper.attachToRecyclerView(recyclerView_2);

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                if(flag==0){
                    func_4();
                    flag=1;
                }else{
                    func_5();
                    flag=0;
                }
            }
        });
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

    /*
    * 显示头尾
    * */
    private void func_4(){
        relativeLayout_1.setVisibility(View.VISIBLE);
        linearLayout_2.setVisibility(View.GONE);
        linearLayout_3.setVisibility(View.VISIBLE);
    }

    /*
    * 隐藏头尾
    * */
    private void func_5(){
        relativeLayout_1.setVisibility(View.GONE);
        linearLayout_2.setVisibility(View.VISIBLE);
        linearLayout_3.setVisibility(View.GONE);
    }

    /*
    * 平推 1,或卷纸 其他,LitePal有默认值无法修改的问题，所以避免
    * */
    @OnClick(R.id.line_specific_content_6)void func_6(){
        /*
        * 这里的显示，是相反的
        * */
        if(posture==1){
            //显示卷纸
            func_8();
            //平推转卷纸
            posture=2;
        }else{
            //显示平推
            func_7();
            //卷纸转平推
            posture=1;
        }
        /*
        * 修改了全部的，这样不好
        * */
        InitClass initClass_2=new InitClass();
        initClass_2.setPosture(posture);
        initClass_2.updateAll();

        InitClass initClass_3=DataSupport.findLast(InitClass.class);
        Logger.d(initClass_3.getPosture());
    }

    /*
     * 显示平推
     * */
    private void func_7(){
        recyclerView.setVisibility(View.GONE);
        recyclerView_2.setVisibility(View.VISIBLE);
        textView_3.setText("卷纸");
    }
    /*
    * 显示卷纸
    * */
    private void func_8(){
        recyclerView.setVisibility(View.VISIBLE);
        recyclerView_2.setVisibility(View.GONE);
        textView_3.setText("平推");
    }

    /*
    * 设置横屏，竖屏
    * */
    @OnClick(R.id.line_specific_content_4)void func_9(){
        if(flag_1==0){
            //竖屏转横屏
            if(this.getResources().getConfiguration().orientation ==Configuration.ORIENTATION_PORTRAIT){
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
            flag_1=1;
        }else{
            //横屏转竖屏
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏
            flag_1=0;
        }
    }

}
