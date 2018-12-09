package com.test.lc.myapplication.sp;

import android.content.Context;
import android.content.SharedPreferences;


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
