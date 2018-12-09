package com.test.lc.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.test.lc.myapplication.R;
import com.test.lc.myapplication.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

public class WelComeActivity extends BaseActivity {


    private ImageView welcome;

    @Override
    protected void initView() {

        welcome = findViewById(R.id.welcome);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                startActivity(new Intent(WelComeActivity.this, HomeActivity.class));

                finish();

            }
        }, 3000);

    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void loadData() {

    }
}
