package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyEntity {
    private String name;
    private String timr;
    private String produce;
    private int jidian;
    private String phoneNumb;
    private String goodat;
    private int checknumb;
    private int messageNumb;
    private int zanNumb;
    private int imageId;

    public SomeBodyEntity(String name, String timr, String produce, int jidian, String phoneNumb, String goodat, int checknumb, int messageNumb, int zanNumb, int imageId) {
        this.name = name;
        this.timr = timr;
        this.produce = produce;
        this.jidian = jidian;
        this.phoneNumb = phoneNumb;
        this.goodat = goodat;
        this.checknumb = checknumb;
        this.messageNumb = messageNumb;
        this.zanNumb = zanNumb;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimr() {
        return timr;
    }

    public void setTimr(String timr) {
        this.timr = timr;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public int getJidian() {
        return jidian;
    }

    public void setJidian(int jidian) {
        this.jidian = jidian;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getGoodat() {
        return goodat;
    }

    public void setGoodat(String goodat) {
        this.goodat = goodat;
    }

    public int getChecknumb() {
        return checknumb;
    }

    public void setChecknumb(int checknumb) {
        this.checknumb = checknumb;
    }

    public int getMessageNumb() {
        return messageNumb;
    }

    public void setMessageNumb(int messageNumb) {
        this.messageNumb = messageNumb;
    }

    public int getZanNumb() {
        return zanNumb;
    }

    public void setZanNumb(int zanNumb) {
        this.zanNumb = zanNumb;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
