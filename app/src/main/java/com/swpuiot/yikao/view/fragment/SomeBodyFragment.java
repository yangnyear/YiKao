package com.swpuiot.yikao.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.presenter.xuanshangpresenter.XuanShangHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 悬赏
 */
public class SomeBodyFragment extends Fragment implements AdapterView.OnItemSelectedListener,XuanShangHolder.view{
    private Spinner academyspinner;
    private Spinner courseSpinner;
    private List<String> academyStringList;
    private List<String> departmentStringList;
    private ArrayAdapter<String> academyAdapter;
    private ArrayAdapter<String> departmentAdapter;
    private RecyclerView mReclOfDS;
    private String academyString;
    private String depatmentString;
    private View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView==null){
            mView=inflater.inflate(R.layout.fragment_xuanshang,container,false);
        }
        inite();
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
    private void inite(){
        academyspinner= (Spinner) mView.findViewById(R.id.spinner_xuanshang_academy);
        courseSpinner= (Spinner) mView.findViewById(R.id.spinner_xuanshang_course);
        mReclOfDS= (RecyclerView) mView.findViewById(R.id.rcl_xuanshang_dashenlist);

        academyStringList=new ArrayList<>();
        departmentStringList=new ArrayList<>();
        MyEntityList.loadStringNameList(academyStringList);
        MyEntityList.loadStringContent(departmentStringList);

        academyAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, academyStringList);
        academyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        departmentAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, departmentStringList);
        departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        academyString = academyAdapter.getItem(position);
        depatmentString = departmentAdapter.getItem(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
