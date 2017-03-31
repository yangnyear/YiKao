package com.swpuiot.yikao.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.view.fragment.HomePageFragment;
import com.swpuiot.yikao.view.fragment.PersonalFragment;
import com.swpuiot.yikao.view.fragment.XuanShangFragment;
import com.swpuiot.yikao.view.fragment.ZhiLiaoFragment;
import com.youth.banner.Banner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private HomePageFragment mHomePageFragment;
    private ZhiLiaoFragment mZhiLiaoFragment;
    private XuanShangFragment mXuanShangFragment;
    private PersonalFragment mPersonalFragment;

    private RadioGroup mRadioGroup;
    private FragmentManager mFragmentManager;

    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inite();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void inite() {
        mRadioGroup = (RadioGroup) findViewById(R.id.rdg_main);
        findViewById(R.id.rdb_homepage).setOnClickListener(this);
        findViewById(R.id.rdb_ziliao).setOnClickListener(this);
        findViewById(R.id.rdb_add).setOnClickListener(this);
        findViewById(R.id.rdb_xuanshang).setOnClickListener(this);
        findViewById(R.id.rdb_personal).setOnClickListener(this);

        //初始化fragment
        mHomePageFragment=new HomePageFragment();
        mZhiLiaoFragment=new ZhiLiaoFragment();
        mXuanShangFragment=new XuanShangFragment();
        mPersonalFragment=new PersonalFragment();

        mFragmentManager=getSupportFragmentManager();
        mRadioGroup.check(R.id.rdb_homepage);
        mFragmentManager.beginTransaction()
                .add(R.id.fl_fragmentcontener,mHomePageFragment)
                .add(R.id.fl_fragmentcontener,mZhiLiaoFragment)
                .add(R.id.fl_fragmentcontener,mXuanShangFragment)
                .add(R.id.fl_fragmentcontener, mPersonalFragment)
                .hide(mZhiLiaoFragment)
                .hide(mXuanShangFragment)
                .hide(mPersonalFragment)
                .show(mHomePageFragment).commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdb_homepage:
                mFragmentManager.beginTransaction()
                        .hide(mZhiLiaoFragment)
                        .hide(mXuanShangFragment)
                        .hide(mPersonalFragment)
                        .show(mHomePageFragment).commit();
                break;
            case R.id.rdb_ziliao:
                mFragmentManager.beginTransaction()
                        .hide(mHomePageFragment)
                        .hide(mXuanShangFragment)
                        .hide(mPersonalFragment)
                        .show(mZhiLiaoFragment) .commit();
                break;
            case R.id.rdb_add:
                // TODO: 2017/3/31
                break;
            case R.id.rdb_xuanshang:
                mFragmentManager.beginTransaction()
                        .hide(mHomePageFragment)
                        .hide(mZhiLiaoFragment)
                        .hide(mPersonalFragment)
                        .show(mXuanShangFragment) .commit();
                break;
            case R.id.rdb_personal:
                mFragmentManager.beginTransaction()
                        .hide(mHomePageFragment)
                        .hide(mZhiLiaoFragment)
                        .hide(mXuanShangFragment)
                        .show(mPersonalFragment) .commit();
                break;


        }
    }
}
