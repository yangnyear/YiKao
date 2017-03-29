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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private HomePageFragment mHomePageFragment;
    private ZhiLiaoFragment mZhiLiaoFragment;
    private XuanShangFragment mXuanShangFragment;
    private PersonalFragment mPersonalFragment;

    private RadioGroup mRadioGroup;
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inite();
        mRadioGroup.check(R.id.rdb_homepage);
        mRadioGroup.setOnClickListener(this);
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

    public void inite() {
        mRadioGroup = (RadioGroup) findViewById(R.id.rdg_main);
        mFragmentManager=getSupportFragmentManager();
        //初始化fragment
        mHomePageFragment=new HomePageFragment();
        mZhiLiaoFragment=new ZhiLiaoFragment();
        mXuanShangFragment=new XuanShangFragment();
        mPersonalFragment=new PersonalFragment();
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

                break;
            case R.id.rdb_add:

                break;
            case R.id.rdb_xuanshang:

                break;
            case R.id.rdb_personal:

                break;


        }
    }
}
