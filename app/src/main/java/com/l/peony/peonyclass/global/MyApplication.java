package com.l.peony.peonyclass.global;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.umeng.commonsdk.UMConfigure;

import java.util.Vector;

/**
 * 爱生活，爱代码
 * 创建于：2018/10/24 09:59
 * 作 者：T
 * 微信：704003376
 */
public class MyApplication extends Application {
    public static Context mCtontext;
    public static Vector<Activity> objectVector;
    public SharedPreferences msp;

    @Override
    public void onCreate() {
        objectVector = new Vector<Activity>();
        msp = getSharedPreferences("config", MODE_PRIVATE);
        super.onCreate();

        //打开Log的开关
        UMConfigure.setLogEnabled(true);
        //对于日志进行加密
        UMConfigure.setEncryptEnabled(true);
        /**
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数3:Push推送业务的secret
         */
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");

    }

}
