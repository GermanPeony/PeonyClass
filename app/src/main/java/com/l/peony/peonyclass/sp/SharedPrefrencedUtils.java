package com.l.peony.peonyclass.sp;

import android.content.Context;
import android.content.SharedPreferences;

import com.test.lc.wanandroid.util.SpUtils;

/**
 * Created by 梁矗 on 2018/11/23.
 */

public class SharedPrefrencedUtils {

    private static SharedPrefrencedUtils sharedPrefrencedUtils;
    private final SharedPreferences sharedPreferences;

    private SharedPrefrencedUtils(Context context) {

        sharedPreferences = context.getSharedPreferences("data", Context.MODE_PRIVATE);

    }

    public static SharedPrefrencedUtils getInstance(Context context) {
        if (sharedPrefrencedUtils == null) {
            synchronized (SharedPrefrencedUtils.class) {
                if (sharedPrefrencedUtils == null) {
                    sharedPrefrencedUtils = new SharedPrefrencedUtils(context);
                }
            }
        }
        return sharedPrefrencedUtils;
    }

    //获取到保存到SP文件中的管理器
    private SharedPreferences.Editor GetEditor() {
        return sharedPreferences.edit();
    }

    //保存用户的账户
    public void SaveName(String data) {
        SharedPreferences.Editor edit = GetEditor();
        edit.putString(SpUtils.USER_NAME, data);
        edit.commit();
    }

    //保存用户的密码
    public void SavePassWord(String data) {
        SharedPreferences.Editor edit = GetEditor();
        edit.putString(SpUtils.USER_PASSWORD, data);
        edit.commit();
    }

    //获取保存到的账户
    public String getName(String name) {

        String user_name = sharedPreferences.getString(name, null);

        return user_name;

    }

    //获取保存到的密码
    public String getPassWord(String password) {

        String user_password = sharedPreferences.getString(password, null);

        return user_password;

    }

    //登录成功后保存的用户
    public void setUser(String user) {
        SharedPreferences.Editor edit = GetEditor();
        edit.putString(SpUtils.USER_ALL, user);
        edit.commit();
    }

    //获取登录成功后的用户
    public String getUser(String user) {
        String user_All = sharedPreferences.getString(user, null);
        return user_All;
    }

    //保存侧滑栏中的账户是否可以点击
    public void setZh_Name(boolean zh_name) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("zh", zh_name);
        edit.commit();

    }

    //侧滑栏中的账户是否可以点击
    public boolean getZh_Name() {
        boolean zh = sharedPreferences.getBoolean("zh", false);
        return zh;
    }

    //清空SP文件中的数据内容

    public void ClearSp() {

        SharedPreferences.Editor edit = sharedPreferences.edit();

        edit.clear();
        edit.commit();

    }


}
