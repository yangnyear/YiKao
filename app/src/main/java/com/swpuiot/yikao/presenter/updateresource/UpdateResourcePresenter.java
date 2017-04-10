package com.swpuiot.yikao.presenter.updateresource;

import android.content.Context;

import com.swpuiot.yikao.data.MyEntityList;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/9.
 */
public class UpdateResourcePresenter implements UpdateResourceHolder.presenter {
    private Context mContext;
    private UpdateResourceHolder.view mView;
    private MyEntityList mEntityList;

    public UpdateResourcePresenter(Context context) {
        mContext = context;
        mView = (UpdateResourceHolder.view) context;
        mEntityList = MyEntityList.getMyEntityList();
    }

    @Override
    public void loadStringContent(List<String> courseList) {
        mEntityList.loadStringNameList(courseList);
    }

    @Override
    public void loadGradeList(List<String> academyAdapter) {
        mEntityList.loadGradeList(academyAdapter);
    }

}
