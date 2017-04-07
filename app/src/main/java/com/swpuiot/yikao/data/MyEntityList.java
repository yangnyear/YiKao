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

    public static void loadImageList(List<Integer> mIntegers) {
        mIntegers.add(R.drawable.ic_abc_image_turn1);
        mIntegers.add(R.drawable.ic_abc_image_turn2);
        mIntegers.add(R.drawable.ic_abc_image_turn4);
        mIntegers.add(R.drawable.ic_abc_image_turn6);
        mIntegers.add(R.drawable.ic_abc_image_turn7);
        mIntegers.add(R.drawable.ic_abc_image_turn8);
        mIntegers.add(R.drawable.ic_abc_image_turn9);
        mIntegers.add(R.drawable.ic_abc_image_turn10);
        mIntegers.add(R.drawable.ic_abc_image_turn11);
    }

    public static List<CourseEntity> getCousdeList() {
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
    public static void loadStringNameList( List<String> academyAdapter){
        if (academyAdapter.size()==0){
           academyAdapter.add("校学生会");
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
    public static void loadStringContent(List<String> courseList){
        if (courseList.size()==0){
            courseList.add("高数");
            courseList.add("英语");
            courseList.add("线代");
            courseList.add("概率");
            courseList.add("思修");
            courseList.add("毛概");
            courseList.add("马原");
            courseList.add("近代史");
        }
    }
}
