package com.swpuiot.yikao.data;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.CourseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * 单例模式下的
 */
public class MyEntityList {
    private static volatile MyEntityList sMyEntityList;
    private static List<CourseEntity> coursList = new ArrayList<>();

    private MyEntityList() {
    }

    public static MyEntityList getMyEntityList() {
        if (sMyEntityList == null) {
            synchronized (MyEntityList.class) {
                if (sMyEntityList == null) {
                    sMyEntityList = new MyEntityList();
                }
            }
        }
        return sMyEntityList;
    }

    public  void loadImageList(List<Integer> mIntegers) {
        mIntegers.add(R.drawable.slide1);
        mIntegers.add(R.drawable.slide2);

    }

    public  List<CourseEntity> getCousdeList() {
        if (coursList.size()==0){
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_math, "高数"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_english, "English"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_think_hehavior, "思修"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_linear_algebra, "线代"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_hestory, "近代史"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_probability_statistics, "概率"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_thinking_of_mao, "毛概"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_thinking_max, "马原"));
        }
        return coursList;
    }
    public  void loadStringNameList( List<String> academyAdapter){
        if (academyAdapter.size()==0){
           academyAdapter.add("计科院");
           academyAdapter.add("石工院");
           academyAdapter.add("化工院");
           academyAdapter.add("材科院");
           academyAdapter.add("地科院");
           academyAdapter.add("电信院");
           academyAdapter.add("法学院");
           academyAdapter.add("机电院");
           academyAdapter.add("理学院");
           academyAdapter.add("土建院");
           academyAdapter.add("艺术院");
        }
    }
    public  void loadGradeList(List<String> courseList){
        if (courseList.size()==0){
            courseList.add("大一");
            courseList.add("大二");
            courseList.add("大三");
            courseList.add("大四");
        }
    }
}
