package com.example.zexiger.yaoqi.ui.aboutme.contract;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.ui.base.BaseContract;

public interface ContractAboutMe {
    interface View extends BaseContract.BaseView{

        //上传电话号码，短信验证码，进行登录之后，传回给View层
        void loadData(BeanAboutMe beanAboutMe);

        void showError(String str);

    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        //将手机号码提交给服务器，然后服务器给手机发送验证码
        void submit(String num);

        //将手机号码和验证码一起提交，进行登录，服务器将返回用户的信息
        void submit_2(String num,String num_2,String android_id,String site_mark);

        //进行QQ登录时，将QQ的信息提交给服务器，服务器返回用户的信息
        void submit_3(String open_id,String access_token,String android_id,String site_mark);
    }
}
