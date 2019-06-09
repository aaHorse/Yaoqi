package com.example.zexiger.yaoqi.utils;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.database.UpdateClass;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.net.ApiBookrackService;
import com.orhanobut.logger.Logger;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.Context.NOTIFICATION_SERVICE;

public class Update {
    private static Disposable mDisposable;
    private Context context;
    private Notification notification;
    private NotificationManager manager;

    public Update(){
        /*
         * 每10分钟查看一次
         * */
        context=MyApp.getContext();
        manager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
        RxTimerUtil.interval(1000*60*10, new IRxNext() {
            @Override
            public void doNext(long number) {
                func();
            }
        });
    }

    private void func(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        ApiBookrackService bookrackService = retrofit.create(ApiBookrackService.class);

        bookrackService.getBookrack(API.key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BeanBookrack>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BeanBookrack bookrack) {
                        if(bookrack!=null&&bookrack.getData().getStateCode()==1){
                            for(int i=0;i<bookrack.getData().getReturnData().getFavList().size();i++){
                                BeanBookrack.DataBean.ReturnDataBean.FavListBean favListBean
                                        =bookrack.getData().getReturnData().getFavList().get(i);
                                UpdateClass obj=new UpdateClass();
                                obj.setComic_id(favListBean.getComic_id());
                                obj.setLast_update_time(favListBean.getLast_update_time());
                                obj.setName(favListBean.getName());
                                if(UpdateDB.query(obj)){
                                    //如果章节更新了
                                    sendUpdateMsg(obj.getName());
                                }else{
                                    //章节没有更新
                                }
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        //请求失败的情况
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void sendUpdateMsg(String name) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "update";
            String channelName = "更新信息";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            createNotificationChannel(channelId, channelName, importance);
        }
        NotificationCompat.Builder mBuilder =new NotificationCompat.Builder(context, "update");
        RemoteViews mRemoteViews = new RemoteViews(context.getPackageName(),R.layout.notification_update);
        mBuilder.setSmallIcon(R.drawable.sign);
        mBuilder.setContentTitle("有妖气");
        mBuilder.setContent(mRemoteViews);
        notification=mBuilder .build();
        notification.contentView.setTextViewText(R.id.tv_notification_update,"["+name+"] 更新啦");
        manager.notify(2333,notification);
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createNotificationChannel(String channelId, String channelName, int importance) {
        //创建一个通知渠道至少需要渠道ID、渠道名称以及重要等级这三个参数，其中渠道ID可以随便定义，只要保证全局唯一性就可以
        NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(
                NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(channel);
    }

    static class RxTimerUtil {
        public static void interval(long milliseconds,final IRxNext next){
            Observable.interval(milliseconds, TimeUnit.MILLISECONDS)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<Long>() {
                        @Override
                        public void onSubscribe(@NonNull Disposable disposable) {
                            mDisposable=disposable;
                        }

                        @Override
                        public void onNext(@NonNull Long number) {
                            if(next!=null){
                                next.doNext(number);
                            }
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
    }

    interface IRxNext{
        void doNext(long number);
    }
}
