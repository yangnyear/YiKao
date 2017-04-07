package com.swpuiot.yikao.view.fragment;

import android.os.Bundle;
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
import com.swpuiot.yikao.presenter.zhiliaopresenter.ZhiLiaoHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 资料
 */

public class ResourceFragment extends Fragment implements ZhiLiaoHolder.view,AdapterView.OnItemSelectedListener {
    private Spinner academyspinner;
    private Spinner courseSpinner;
    private RecyclerView mRclOfziliao;
    private List<String> academyStringList;
    private List<String> departmentStringList;
    private ArrayAdapter<String> academyAdapter;
    private ArrayAdapter<String> departmentAdapter;
    private String academyString;
    private String depatmentString;
    private View mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_zhi_liao, container, false);
        }
        inite();
        return mView;
    }

    private void inite() {
        academyspinner= (Spinner) mView.findViewById(R.id.spinner_resource_academy);
        courseSpinner= (Spinner) mView.findViewById(R.id.spinner_resource_course);
        mRclOfziliao= (RecyclerView) mView.findViewById(R.id.rcl_resource_list);

        academyStringList = new ArrayList<>();
        departmentStringList = new ArrayList<>();
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
