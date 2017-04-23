package com.swpuiot.yikao.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.UserInformationHolder;

public class UserInformationActivity extends AppCompatActivity implements UserInformationHolder.view ,View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_user_information);
        inite();
    }
    private void inite(){
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_user_information));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.ll).requestFocus();
        findViewById(R.id.ll_reset_user_logo).setOnClickListener(this);
        findViewById(R.id.ll_reset_user_name).setOnClickListener(this);
        findViewById(R.id.ll_reset_user_sex).setOnClickListener(this);
        findViewById(R.id.ll_reset_user_age).setOnClickListener(this);
        findViewById(R.id.ll_reset_user_birth).setOnClickListener(this);
        findViewById(R.id.ll_reset_user_star).setOnClickListener(this);
        findViewById(R.id.tt_save).setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
