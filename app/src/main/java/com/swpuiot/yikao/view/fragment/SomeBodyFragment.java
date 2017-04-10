package com.swpuiot.yikao.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.presenter.xuanshangpresenter.XuanShangHolder;

/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 悬赏
 */
public class SomeBodyFragment extends Fragment implements XuanShangHolder.view{
    private View mView;
    private MyEntityList mEntityList;
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
        mEntityList=MyEntityList.getMyEntityList();

    }

}
