package com.swpuiot.yikao.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;

public class ZhiLiaoFragment extends Fragment {
    private View mView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
     if (mView==null){
         mView= inflater.inflate(R.layout.fragment_zhi_liao, container, false)
     }
        return mView;
    }

}
