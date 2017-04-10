package com.swpuiot.yikao.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.presenter.zhiliaopresenter.ResourceHolder;


/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 资料
 */

public class ResourceFragment extends Fragment implements ResourceHolder.view {

    private View mView;
    private MyEntityList mEntityList;

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
        mEntityList = MyEntityList.getMyEntityList();

    }
}
