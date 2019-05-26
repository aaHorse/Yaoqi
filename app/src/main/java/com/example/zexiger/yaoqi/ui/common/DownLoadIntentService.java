package com.example.zexiger.yaoqi.ui.common;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.orhanobut.logger.Logger;

public class DownLoadIntentService extends IntentService {
    public static void startService(String str_){
        str=str_;
        Intent intent=new Intent(MyApp.getContext(),DownLoadIntentService.class);
        MyApp.getContext().startService(intent);
    }

    public static class MainHandler extends Handler {

        private static volatile MainHandler mInstance;

        private MainHandler() {
            super(Looper.getMainLooper());
        }

        public static MainHandler getInstance() {
            if (mInstance == null) {
                synchronized (MainHandler.class) {
                    if (mInstance == null) {
                        mInstance = new MainHandler();
                    }
                }
            }
            return mInstance;
        }
    }

    private static String str;
    /**
     * 是否正在运行
     */
    private boolean isRunning;
    /**
     *进度
     */
    private int count;
    /**
     * 广播
     */
    private LocalBroadcastManager mLocalBroadcastManager;

    NotificationManager manager;

    private Notification notification;

    private static final String UPDATA_STATUS_FROM_WIDGET_START = "net.qingtian.UPDATA_STATUS_FROM_WIDGET_START";
    private static final String UPDATA_STATUS_FROM_WIDGET_STOP = "net.qingtian.UPDATA_STATUS_FROM_WIDGET_STOP";

    public DownLoadIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mLocalBroadcastManager = LocalBroadcastManager.getInstance(this);
        
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelId = "chat";
            String channelName = "聊天消息";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            createNotificationChannel(channelId, channelName, importance);

            channelId = "subscribe";
            channelName = "订阅消息";
            importance = NotificationManager.IMPORTANCE_DEFAULT;
            createNotificationChannel(channelId, channelName, importance);
        }
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        sendChatMsg();
        sendSubscribeMsg();
        try {
            Thread.sleep(100);
            isRunning = true;
            count = 0;
            while (isRunning) {
                count++;
                if (count >= 100) {
                    //终止线程
                    isRunning = false;
                    notification.contentView.setTextViewText(R.id.tv_service,"   下载完成");
                    notification.contentView.setImageViewResource(R.id.image_service,R.drawable.dkw_wancheng);
                    manager.notify(1, notification);
                    break;
                }
                notification.contentView.setProgressBar(R.id.pBar, 100, count, false);
                notification.contentView.setTextViewText(R.id.tv_service,"   正在下载 ... "+count+"%");
                manager.notify(1, notification);
                Thread.sleep(50);
                sendThreadStatus("线程运行中...", count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送进度消息给活动
     */
    private void sendThreadStatus(String status, int progress) {
        Intent intent = new Intent(ActivityLoad.ACTION_TYPE_THREAD);
        intent.putExtra("status", status);
        intent.putExtra("progress", progress);
        mLocalBroadcastManager.sendBroadcast(intent);
    }

    public void sendChatMsg() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = manager.getNotificationChannel("chat");
            if (channel.getImportance() == NotificationManager.IMPORTANCE_NONE) {
                Intent intent = new Intent(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS);
                intent.putExtra(Settings.EXTRA_APP_PACKAGE, getPackageName());
                intent.putExtra(Settings.EXTRA_CHANNEL_ID, channel.getId());
                startActivity(intent);
                MainHandler.getInstance().post(new Runnable(){
                    @Override
                    public void run() {
                        notification.contentView.setProgressBar(R.id.pBar, 100, count, false);
                        manager.notify(1, notification);
                        Toast.makeText(MyApp.getContext(),"测试功能，请先开启通知",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this, "chat");
        notification = builder
                .setContentTitle("收到一条聊天消息")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.load)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.load))
                .setAutoCancel(true)
                .build();
        // 设置通知的显示视图
        RemoteViews remoteViews = new RemoteViews(MyApp.getContext().getPackageName(),
                R.layout.notification_contentview);

        notification.contentView=remoteViews;

        manager.notify(1, notification);
    }

    public void sendSubscribeMsg() {
        Notification notification = new NotificationCompat.Builder(this, "subscribe")
                .setContentTitle("收到一条订阅消息")
                .setContentText("地铁沿线30万商铺抢购中！")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.load)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.load))
                .setAutoCancel(true)
                .build();
        manager.notify(2, notification);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createNotificationChannel(String channelId, String channelName, int importance) {
        NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);
        NotificationManager notificationManager = (NotificationManager) getSystemService(
                NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(channel);
    }

    class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case UPDATA_STATUS_FROM_WIDGET_START:
                    Logger.d(intent.getIntExtra("progress", 0)+"");
                    break;
            }
        }
    }
}
