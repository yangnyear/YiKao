package com.swpuiot.yikao.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.updateresource.UpdateResourceHolder;
import com.swpuiot.yikao.presenter.updateresource.UpdateResourcePresenter;

import java.util.ArrayList;
import java.util.List;

public class UpdateResourceActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener, UpdateResourceHolder.view {
    private Spinner academyspinner;
    private Spinner gradeSpinner;
    private ArrayAdapter<String> academyAdapter;
    private String academyString;
    private String depatmentString;
    private UpdateResourceHolder.presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_update_resource);
        inite();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mPresenter = new UpdateResourcePresenter(this);
        setAcademySpinnerAdapter(academyspinner);
        setGradeSpinnerAdapter(gradeSpinner);
    }

    private void inite() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_update_resource));
        academyspinner = (Spinner) findViewById(R.id.spinner_academy);
        gradeSpinner = (Spinner) findViewById(R.id.spinner_grade);

    }

    private void setAcademySpinnerAdapter(Spinner spinner) {
        List<String> academyList=new ArrayList<>();
        mPresenter.loadStringContent(academyList);
        academyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, academyList);
        academyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(academyAdapter);

    }
    private void setGradeSpinnerAdapter(Spinner spinner) {
        List<String> gradList=new ArrayList<>();
        mPresenter.loadGradeList(gradList);
        academyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gradList);
        academyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(academyAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {

    }
}
