package com.swpuiot.yikao.presenter.updateresource;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/9.
 */
public interface UpdateResourceHolder {
    interface view {

    }

    interface presenter {
        void loadStringContent(List<String> courseList);

        void loadGradeList(List<String> academyAdapter);
    }
}
