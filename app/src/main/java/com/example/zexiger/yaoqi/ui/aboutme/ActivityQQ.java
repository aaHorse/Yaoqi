package com.example.zexiger.yaoqi.ui.aboutme;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
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
            JSONObject obj = (JSONObject) response;
            try {
                String open_id = obj.getString("openid");
                String access_token = obj.getString("access_token");
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("open_id",open_id);
                bundle.putString("access_token",access_token);
                intent.putExtras(bundle);
                setResult(RESULT_OK,intent);
                finish();
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
}

