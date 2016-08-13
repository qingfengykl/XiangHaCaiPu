package com.kelin.xianghashipu.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.kelin.xianghashipu.R;
import com.kelin.xianghashipu.view.fregment.LifeCircleFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = (FrameLayout) findViewById(R.id.main_activity_container);

        LifeCircleFragment lifeCircleFragment = new LifeCircleFragment();
        FragmentTransaction mTransaction = getSupportFragmentManager().beginTransaction();
        mTransaction.replace(R.id.main_activity_container,lifeCircleFragment).commit();

    }


}
