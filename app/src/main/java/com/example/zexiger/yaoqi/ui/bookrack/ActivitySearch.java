package com.example.zexiger.yaoqi.ui.bookrack;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSearch;
import com.example.zexiger.yaoqi.bean.BeanSearchDefault;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Search;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.bookrack.contract.ContractSearch;
import com.example.zexiger.yaoqi.ui.bookrack.presenter.PresenterSearch;
import com.example.zexiger.yaoqi.ui.common.ActivitySpecific;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import org.reactivestreams.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

public class ActivitySearch extends BaseActivity<PresenterSearch>
        implements ContractSearch.View {
    public static void startActivity(){
        Intent intent=new Intent(MyApp.getContext(),ActivitySearch.class);
        MyApp.getContext().startActivity(intent);
    }

    @BindView(R.id.edt_search_1)EditText editText;
    @BindView(R.id.rl_search)RecyclerView recyclerView;
    private Adapter_Search adapter_search;
    private List<BeanSearch.DataBean.ReturnDataBean> lists=new ArrayList<>();


    @Override
    public int getContentLayout() {
        return R.layout.activity_search;
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
        adapter_search=new Adapter_Search(lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter_search);
        func_3();
        func_4();
    }

    @Override
    public void initData() {
        mPresenter.getData_0();
    }

    @Override
    public void loadData_0(BeanSearchDefault beanSearchDefault) {
        if(beanSearchDefault.getData().getStateCode()==1){
            BeanSearchDefault.DataBean.ReturnDataBean list_bean=beanSearchDefault.getData().getReturnData();
            lists.clear();
            for(int i=0;i<list_bean.getHotItems().size();i++){
                BeanSearch.DataBean.ReturnDataBean obj=new BeanSearch.DataBean.ReturnDataBean();
                obj.setComic_id(list_bean.getHotItems().get(i).getComic_id());
                obj.setName(list_bean.getHotItems().get(i).getName());
                lists.add(obj);
            }
            adapter_search.notifyDataSetChanged();
        }
    }

    @Override
    public void loadData(BeanSearch beanSearch) {
        //搜索为空时，statecode为空
        if(beanSearch!=null&&beanSearch.getData().getStateCode()!=0){
            lists.clear();
            for(int i=0;i<beanSearch.getData().getReturnData().size();i++){
                lists.add(beanSearch.getData().getReturnData().get(i));
            }
            adapter_search.notifyDataSetChanged();
        }else{
            T("未找到匹配选项");
        }

    }

    @Override
    public void loadData_2(BeanSearch_2 beanSearch_2) {
        //搜索的具体界面显示
        Activity_Search_2.startActivity(beanSearch_2);
    }

    @OnClick(R.id.ibt_search_1)void func_1(){
        finish();
    }

    @OnClick(R.id.ibt_search_2)void func_2(){
        mPresenter.getData_2(editText.getText().toString());
    }

    private void func_3(){
        RxTextView.textChanges(editText)
                .debounce(1, TimeUnit.SECONDS).skip(1)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CharSequence>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        //
                    }
                    @Override
                    public void onNext(CharSequence charSequence) {
                        //输入没做检查，会崩
                        if(charSequence.length()<20){
                            mPresenter.getData(charSequence.toString());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.d(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Logger.d("onComplete");
                        //Log.d(TAG, "对Complete事件作出响应");
                    }
                });
    }

    /**
     * 设置监听
     */
    private void func_4(){
        adapter_search.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ActivitySpecific.startActivity(MyApp.getContext(),lists.get(position).getComic_id());
            }
        });
    }
}
