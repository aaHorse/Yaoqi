package com.example.zexiger.yaoqi.ui.aboutme;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityQQ extends AppCompatActivity {
    public static void startActivity(Context context){
        Intent intent=new Intent(context,ActivityQQ.class);
        context.startActivity(intent);
    }

    private static final String APP_ID = "1108179346";
    private Tencent mTencent;
    private BaseUiListener mIUiListener;
    private UserInfo mUserInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq);
        ButterKnife.bind(this);
        mTencent = Tencent.createInstance(APP_ID,getApplicationContext());
        if(!mTencent.isSessionValid()){
            mIUiListener=new BaseUiListener();
            mTencent.login(this,"all",mIUiListener);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == Constants.REQUEST_LOGIN){
            Tencent.onActivityResultData(requestCode,resultCode,data,mIUiListener);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private class BaseUiListener implements IUiListener {
        @Override
        public void onComplete(Object response) {
            Toast.makeText(MyApp.getContext(), "授权成功", Toast.LENGTH_SHORT).show();
            Log.d("ttttt", "response:" + response);
            JSONObject obj = (JSONObject) response;
            try {
                final String openID = obj.getString("openid");
                final String accessToken = obj.getString("access_token");
                final String expires = obj.getString("expires_in");
                mTencent.setOpenId(openID);
                mTencent.setAccessToken(accessToken,expires);
                QQToken qqToken = mTencent.getQQToken();
                mUserInfo = new UserInfo(getApplicationContext(),qqToken);
                mUserInfo.getUserInfo(new IUiListener() {
                    @Override
                    public void onComplete(Object response) {
                        Toast.makeText(MyApp.getContext(),"登录成功",Toast.LENGTH_SHORT).show();
                        JSONObject jsonObject=(JSONObject)response;
                        initOpenidAndToken(jsonObject);
                        getUserInfo();
                    }

                    @Override
                    public void onError(UiError uiError) {
                        Log.d("ttttt","登录失败"+uiError.toString());
                    }

                    @Override
                    public void onCancel() {
                        Log.d("ttttt","登录取消");
                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        //授权出错
        @Override
        public void onError(UiError uiError) {
            Toast.makeText(MyApp.getContext(), "授权失败", Toast.LENGTH_SHORT).show();
        }

        //授权取消
        @Override
        public void onCancel() {
            Toast.makeText(MyApp.getContext(), "授权取消", Toast.LENGTH_SHORT).show();
        }
    }

    public void initOpenidAndToken(JSONObject jsonObject) {
        try {
            String openid = jsonObject.getString("openid");
            String token = jsonObject.getString("access_token");
            String expires = jsonObject.getString("expires_in");

            mTencent.setAccessToken(token, expires);
            mTencent.setOpenId(openid);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void getUserInfo() {
        QQToken mQQToken = mTencent.getQQToken();
        UserInfo userInfo = new UserInfo(MyApp.getContext(), mQQToken);
        userInfo.getUserInfo(new IUiListener() {
            @Override
            public void onComplete(final Object o) {
                JSONObject userInfoJson = (JSONObject) o;
                try {
                    String nickname = userInfoJson.getString("nickname");
                    Log.d("ttttt","获取QQ昵称为："+nickname);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(UiError uiError) {
                Toast.makeText(MyApp.getContext(), "获取qq用户信息错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(MyApp.getContext(), "获取qq用户信息取消", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

