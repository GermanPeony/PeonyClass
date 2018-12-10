package com.test.lc.myapplication.activity;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.test.lc.myapplication.R;
import com.test.lc.myapplication.base.BaseActivity;
import com.test.lc.myapplication.view.BottomNavigationViewHelper;

/**
 * Created by 梁矗 on 2018/12/9.
 */

public class HomeActivity extends BaseActivity {

    private BottomNavigationView bottom_tab;
    private ViewPager viewPager;

    @Override
    protected void initView() {

        bottom_tab = findViewById(R.id.bottom_tab);
        viewPager = findViewById(R.id.vip);



        BottomNavigationViewHelper.disableShiftMode(bottom_tab);
    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void loadData() {

    }
}
