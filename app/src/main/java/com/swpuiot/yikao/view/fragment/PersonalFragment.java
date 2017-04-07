package com.swpuiot.yikao.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.presenter.personalpresent.PerSonalHolder;

/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 个人主页
 */
public class PersonalFragment extends Fragment implements PerSonalHolder.view{
    private SimpleDraweeView mLogo;
    private TextView mProfession;
    private View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView==null){
            mView=inflater.inflate(R.layout.fragment_personal,container,false);
        }
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
    private void inite(){
        mLogo= (SimpleDraweeView) mView.findViewById(R.id.image_userlogo);
        mProfession= (TextView) mView.findViewById(R.id.text_onew_name);
    }
}
