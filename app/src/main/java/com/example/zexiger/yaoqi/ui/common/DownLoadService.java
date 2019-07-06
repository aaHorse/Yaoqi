package com.example.zexiger.yaoqi.ui.common;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.RemoteViews;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.PrepareClass;
import com.example.zexiger.yaoqi.database.LoadClass;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.FileDownloadSampleListener;
import com.liulishuo.filedownloader.FileDownloader;
import com.orhanobut.logger.Logger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DownLoadService extends Service {
    private LocalBroadcastManager mLocalBroadcastManager;
    private MyBroadcastReceiver mBroadcastReceiver;
    private NotificationManager manager;
    public final static String FROM_tongzhilan = "FROM_tongzhilan";
    private Notification notification;
    private BaseDownloadTask singleTask ;
    private int singleTaskId = 0;
    private int flag=1;//暂停0，下载1，完成2，出错3
    private FileDownloadSampleListener fileDownloadSampleListener;

    private static List<PrepareClass>prepareClassList_0=new ArrayList<>();//需要下载的列表，缓冲级
    //注意，这里可能存在并发，暂时不考虑这一个问题
    private static int task;//缓冲列表有东西需要下载 1 ,空为 0
    private static List<PrepareClass>prepareClassList=new ArrayList<>();//需要下载的列表，正式应用级
    private static int current;//当前在下载哪一个
    private int task_flag;//用于实现一次只能下载一个

    @Override
    public void onCreate() {
        super.onCreate();
        //这里是，接收和发送程序内部的广播
        mLocalBroadcastManager = LocalBroadcastManager.getInstance(this);
        mBroadcastReceiver = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(FROM_tongzhilan);
        //这里是注册接收全局的广播
        this.registerReceiver(mBroadcastReceiver, intentFilter);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //监听是否有下载任务
        func_3();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    /*
    * 下载文件的方法
    * */
    private void func_2(final String path, final String url,final int load_n) {
        sendChatMsg(load_n);
        fileDownloadSampleListener=new FileDownloadSampleListener() {
            @Override
            protected void pending(BaseDownloadTask task, int soFarBytes, int totalBytes) {
                flag=0;
                notification.contentView.setTextViewText(R.id.tv_service,
                        "   正在下载（00.00%）");
                notification.contentView.setImageViewResource(R.id.image_service, R.drawable.zanting);
                notification.contentView.setProgressBar(R.id.pBar,
                        totalBytes, 0, false);
                manager.notify(load_n, notification);
            }

            @Override
            protected void progress(BaseDownloadTask task, int soFarBytes, int totalBytes) {
                notification.contentView.setTextViewText(R.id.tv_service,
                        "   正在下载（" + func_1(soFarBytes, totalBytes) + "%）");
                notification.contentView.setImageViewResource(R.id.image_service, R.drawable.zanting);
                notification.contentView.setProgressBar(R.id.pBar,
                        totalBytes, soFarBytes, false);
                manager.notify(load_n, notification);
                sendThreadStatus(soFarBytes, totalBytes,load_n);
            }

            @Override
            protected void blockComplete(BaseDownloadTask task) {
                notification.contentView.setTextViewText(R.id.tv_service, "   下载完成（100%）");
                notification.contentView.setImageViewResource(R.id.image_service, R.drawable.dkw_wancheng);
                notification.contentView.setProgressBar(R.id.pBar,
                        100, 100, false);
                manager.notify(load_n, notification);
                flag = 2;
                sendDone(load_n);
                Logger.d("下载完成");
            }

            @Override
            protected void completed(BaseDownloadTask task) {
                //stopSelf();
            }

            @Override
            protected void paused(BaseDownloadTask task, int soFarBytes, int totalBytes) {
                notification.contentView.setTextViewText(R.id.tv_service,
                        "   暂停下载（" + func_1(soFarBytes, totalBytes) + "%）");
                notification.contentView.setImageViewResource(R.id.image_service, R.drawable.kaishi);
                manager.notify(load_n, notification);
                sendPause(soFarBytes, totalBytes);
                Logger.d("下载暂停");
            }

            @Override
            protected void error(BaseDownloadTask task, Throwable e) {
                notification.contentView.setTextViewText(R.id.tv_service, "   下载出错");
                notification.contentView.setImageViewResource(R.id.image_service, R.drawable.dkw_jinggao);
                manager.notify(load_n, notification);
                flag = 3;
                Logger.d("下载错误");
                Logger.d(e.getMessage());
            }

            @Override
            protected void warn(BaseDownloadTask task) {
                Logger.d("下载警告");
            }
        };
        singleTask = FileDownloader.getImpl().create(url)
                .setPath(path,false)
                .setCallbackProgressTimes(400)
                .setMinIntervalUpdateSpeed(400)
                .setCallbackProgressMinInterval(400)
                .setListener(fileDownloadSampleListener);
        singleTaskId =  singleTask.start();
    }

    /**
     * 发送进度消息给活动
     */
    private void sendThreadStatus(int soFarBytes, int totalBytes,int load_n) {
        Intent intent = new Intent(ActivityLoad.FROM_Thread);
        intent.putExtra("load_n",load_n);
        intent.putExtra("progress", func_1(soFarBytes,totalBytes));//把百分比传给对应的下载活动
        mLocalBroadcastManager.sendBroadcast(intent);
    }

    /**
     * 发送暂停给活动
     */
    private void sendPause(int soFarBytes, int totalBytes){
        Intent intent = new Intent(ActivityLoad.FROM_tongzhilan);
        intent.putExtra("progress", func_1(soFarBytes,totalBytes));//把百分比传给对应的下载活动
        mLocalBroadcastManager.sendBroadcast(intent);
    }

    /*
    * 下载完成
    * */
    private void sendDone(int load_n){
        //修改数据库缓冲里面对应的状态
        LoadClass obj=new LoadClass();
        obj.setFlag(1);
        obj.updateAll("chapter_id = ?",load_n+"");
        //将单个下载成功的信息传回活动
        Intent intent = new Intent(ActivityLoad.DONE);
        intent.putExtra("load_n",load_n);
        mLocalBroadcastManager.sendBroadcast(intent);
        task_flag=1;
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createNotificationChannel(String channelId, String channelName, int importance) {
        //创建一个通知渠道至少需要渠道ID、渠道名称以及重要等级这三个参数，其中渠道ID可以随便定义，只要保证全局唯一性就可以
        NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);
        NotificationManager notificationManager = (NotificationManager) getSystemService(
                NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(channel);
    }

    public void sendChatMsg(int load_n) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "chat";
            String channelName = "聊天消息";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            createNotificationChannel(channelId, channelName, importance);
        }

        NotificationCompat.Builder mBuilder =new NotificationCompat.Builder(this, "chat");
        //添加自定义视图  activity_notification
        RemoteViews mRemoteViews = new RemoteViews(getPackageName(),R.layout.notification_contentview);
        Intent intent = new Intent();
        intent.setAction(FROM_tongzhilan);
        mRemoteViews.setOnClickPendingIntent(R.id.image_service,
                PendingIntent.getBroadcast(MyApp.getContext(), 10, intent, PendingIntent.FLAG_UPDATE_CURRENT));
        mBuilder.setSmallIcon(R.drawable.sign);
        mBuilder.setContentTitle("有妖气");
        mBuilder.setContent(mRemoteViews);
        notification=mBuilder .build();

        manager.notify(load_n,notification);
    }

    /*
    * 一直循环，监听是否有下载任务
    * */
    private void func_3(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Logger.d("在线程");
                while(true){
                    if(task==1){
                        //task=1
                        prepareClassList.clear();
                        for(int i=0;i<prepareClassList_0.size();i++){
                            prepareClassList.add(prepareClassList_0.get(i));
                        }
                        task=0;
                        //真正开始下载
                        task_flag=1;
                        for(int i=0;i<prepareClassList.size();i++){
                            PrepareClass obj=prepareClassList.get(i);
                            current=i;
                            while(task_flag==0){
                                //
                            }
                            task_flag=0;
                            func_2(obj.getPath(),obj.getZip_file_high(),Integer.parseInt(obj.getChapter_id()));
                        }
                    }
                }
            }
        }).start();
    }


    /*
    * 单一对象放在这里
    * */
    private MyBinder binder=new MyBinder();
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    class MyBinder extends Binder{
        /*
        * 在活动中对这一个类里面的方法进行调用，实现服务与活动的通信
        * */

        //开始下载
        public void startDownLoad(List<PrepareClass>prepareClassList_){
            Logger.d("在MyBind");
            while(true){
                /*
                *等待缓冲list的信息进入下载队列
                * */
                if(task==0){
                    break;
                }
            }
            prepareClassList_0.clear();
            for(int i=0;i<prepareClassList_.size();i++){
                prepareClassList_0.add(prepareClassList_.get(i));
            }
            task=1;
            Logger.d("task");
        }

        //暂停后再次开始下载
        public void start(){
            PrepareClass obj=prepareClassList.get(current);
            func_2(obj.getPath(),obj.getZip_file_high(),Integer.parseInt(obj.getChapter_id()));
        }
        //暂停
        public void pause(){
            FileDownloader.getImpl().pause(singleTaskId);
        }
    }

    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case FROM_tongzhilan:
                    //暂停0，下载1，完成2，出错3
                    if(flag==0){
                        binder.start();
                        flag=1;
                    }else if(flag==1){
                        binder.pause();
                        flag=0;
                    }else if(flag==2){
                        Logger.d("在这2");
                        //下载完成
                    }else{
                        Logger.d("在这其他");
                        //下载出错
                    }
                    break;
                 default:
                     Logger.d("在默认值里面");
            }
        }
    }

    private String func_1(int soFarBytes,int totalBytes){
        DecimalFormat df=new DecimalFormat("0.00");
        String temp = df.format(((float)soFarBytes/totalBytes)*100.0);
        return temp;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.d("服务挂了");
        this.unregisterReceiver(mBroadcastReceiver);
    }
}
