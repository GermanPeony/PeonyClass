package com.test.lc.myapplication.global;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


import com.hjhrq991.screenadapter.ScreenAdapterApplication;

import java.util.Vector;

/**
 * 爱生活，爱代码
 * 创建于：2018/10/24 09:59
 * 作 者：T
 * 微信：704003376
 */
public class MyApplication extends ScreenAdapterApplication {
    public static Context mCtontext;
    public static Vector<Activity> objectVector;
    public SharedPreferences msp;

    @Override
    public void onCreate() {
        objectVector = new Vector<Activity>();
        msp = getSharedPreferences("config", MODE_PRIVATE);
        super.onCreate();

    }

}


//继承自定义Application时
/*
private float DESIGN_WIDTH = 375f;

private ScreenAdaperHelper mHelper;

@Override
public void onCreate() {
super.onCreate();
//init helper with default with.
//        mHelper = ScreenAdaperHelper.init(this);
//init helper with the width for design drawing
mHelper = ScreenAdaperHelper.init(this, DESIGN_WIDTH);
}

@Override
public void onConfigurationChanged(Configuration newConfig) {
super.onConfigurationChanged(newConfig);
mHelper.onConfigurationChanged();
}

@Override
public Resources getResources() {
Resources res = super.getResources();
//Will call before init
if (mHelper != null)
mHelper.getResources(res);
return res;
}
 */