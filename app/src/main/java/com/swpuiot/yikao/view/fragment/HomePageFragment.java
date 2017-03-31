package com.swpuiot.yikao.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;

/**
 * Created by 羊荣毅_L on 2017/3/28.
 * 首页
 */
public class HomePageFragment extends Fragment{
    private View mView;
    private RecyclerView mCourseRecyclerView;
    private RecyclerView mNewsRecyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView==null){
            mView=inflater.inflate(R.layout.fragment_homepage,container,false);
        }
        inite();
        return mView;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
    public void inite(){
        mCourseRecyclerView= (RecyclerView) mView.findViewById(R.id.rcl_homepage_course);
        mNewsRecyclerView= (RecyclerView) mView.findViewById(R.id.rcl_homepage_news);
    }
}
