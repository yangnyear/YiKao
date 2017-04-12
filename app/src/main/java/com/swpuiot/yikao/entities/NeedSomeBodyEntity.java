package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/12.
 */
public class NeedSomeBodyEntity {
    private int logoId;
    private String time;
    private String needInfor;
    private String course;
    private String phoneNumb;
    private String acumdate;
    private int checkNumb;
    private int messageNumb;
    private int zanNumb;

    public NeedSomeBodyEntity(int logoId, String time, String needInfor, String course, String phoneNumb, String acumdate, int checkNumb, int messageNumb, int zanNumb) {
        this.logoId = logoId;
        this.time = time;
        this.needInfor = needInfor;
        this.course = course;
        this.phoneNumb = phoneNumb;
        this.acumdate = acumdate;
        this.checkNumb = checkNumb;
        this.messageNumb = messageNumb;
        this.zanNumb = zanNumb;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNeedInfor() {
        return needInfor;
    }

    public void setNeedInfor(String needInfor) {
        this.needInfor = needInfor;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getAcumdate() {
        return acumdate;
    }

    public void setAcumdate(String acumdate) {
        this.acumdate = acumdate;
    }

    public int getCheckNumb() {
        return checkNumb;
    }

    public void setCheckNumb(int checkNumb) {
        this.checkNumb = checkNumb;
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
}
