package com.example.zexiger.yaoqi.ui.discover;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.Bean;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;
import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.database.LoadClass;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_OffLine;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.ActivitySpecificContent;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;

import org.litepal.crud.DataSupport;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ActivityOffLine extends BaseActivity {
    public static void startActivity(BeanSearch_2.DataBean.ReturnDataBean.ComicsBean comicsBean_){
        //这个对象是残血的，只有五个变量赋了值 ！
        comicsBean=comicsBean_;
        Context context=MyApp.getContext();
        Intent intent=new Intent(context,ActivityOffLine.class);
        context.startActivity(intent);

    }

    private static BeanSearch_2.DataBean.ReturnDataBean.ComicsBean comicsBean;
    private static List<LoadClass>lists_load;
    private static List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean>lists_2=new ArrayList<>();
    @BindView(R.id.rv_offline)RecyclerView recyclerView;
    Adapter_OffLine adapter_offLine;
    private List<Bean>lists=new ArrayList<>();
    @BindView(R.id.topbar) QMUITopBarLayout mTopBar;

    @Override
    public int getContentLayout() {
        return R.layout.activity_off_line;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {

    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        lists_load=DataSupport.where("comic_id = ? ",comicsBean.getComicId()+"").find(LoadClass.class);
        for(int i=0;i<lists_load.size();i++){
            Bean bean=new Bean();
            bean.setStr(lists_load.get(i).getName());
            lists.add(bean);
        }
        adapter_offLine=new Adapter_OffLine(lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter_offLine);
        func_1();
        initTopBar();
    }

    @Override
    public void initData() {

    }

    private void func_1(){
        adapter_offLine.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean>lists_=new ArrayList<>();
                final LoadClass obj=lists_load.get(position);
                String str=obj.getAddress();
                String[]num=str.split(";");
                for(int i=0;i<num.length;i++){
                    if(num[i].length()>0){
                        String[]arr=num[i].split(",");
                        String width=arr[0];
                        String heigh=arr[1];
                        String path= Environment.getExternalStorageDirectory().getAbsolutePath()
                                + "/youyaoqi/"+obj.getComic_id()+"/"+"temp"+"/"+arr[2];
                        BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean imageListBean
                                =new BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean();
                        imageListBean.setWidth(width);
                        imageListBean.setHeight(heigh);
                        imageListBean.setLocation(path);
                        lists_.add(imageListBean);
                    }
                }
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        unzip(obj);
                    }
                }).start();
                ActivitySpecificContent.startActivity(lists_);
            }
        });
    }

    /*
     * 将离线的压缩包，解压到缓存目录下面
     * */
    public static void unzip(LoadClass obj){
        String zipFileString=Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/youyaoqi/"+obj.getComic_id()+"/"+obj.getChapter_id()+".zip";
        String outPathString= Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/youyaoqi/"+obj.getComic_id()+"/"+"temp";
        try {
            ZipUtil.unpack(new File(zipFileString), new File(outPathString));
        } catch (Exception e) {
            Logger.d(e.getMessage());
            e.printStackTrace();
        }
    }

    private void initTopBar() {
        QMUIStatusBarHelper.translucent(this);
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTopBar.setTitle(comicsBean.getName());
    }
}
