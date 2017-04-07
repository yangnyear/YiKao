package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyEntity {
    private int somebodyId;
    private String somebodyLogoUri;
    private String somebodyName;
    private String somebodySex;
    private String somebodyPhoneNumb;
    private String somebodyQQNumb;
    private String somebodyProfession;
    private String somebodySpeciality;

    /**
     * @param somebodyId 悬赏里面的大神的id
     * @param somebodyLogoUri 头像图片URI
     * @param somebodyName 姓名
     * @param somebodySex 性别
     * @param somebodyPhoneNumb 电话
     * @param somebodyQQNumb QQ
     * @param somebodyProfession 专业
     * @param somebodySpeciality 擅长那门课
     * */

    public SomeBodyEntity(int somebodyId, String somebodyLogoUri, String somebodyName, String somebodySex, String somebodyPhoneNumb, String somebodyQQNumb, String somebodyProfession, String somebodySpeciality) {
        this.somebodyId = somebodyId;
        this.somebodyLogoUri = somebodyLogoUri;
        this.somebodyName = somebodyName;
        this.somebodySex = somebodySex;
        this.somebodyPhoneNumb = somebodyPhoneNumb;
        this.somebodyQQNumb = somebodyQQNumb;
        this.somebodyProfession = somebodyProfession;
        this.somebodySpeciality = somebodySpeciality;
    }

    public int getSomebodyId() {
        return somebodyId;
    }

    public void setSomebodyId(int somebodyId) {
        this.somebodyId = somebodyId;
    }

    public String getSomebodyLogoUri() {
        return somebodyLogoUri;
    }

    public void setSomebodyLogoUri(String somebodyLogoUri) {
        this.somebodyLogoUri = somebodyLogoUri;
    }

    public String getSomebodyName() {
        return somebodyName;
    }

    public void setSomebodyName(String somebodyName) {
        this.somebodyName = somebodyName;
    }

    public String getSomebodySex() {
        return somebodySex;
    }

    public void setSomebodySex(String somebodySex) {
        this.somebodySex = somebodySex;
    }

    public String getSomebodyPhoneNumb() {
        return somebodyPhoneNumb;
    }

    public void setSomebodyPhoneNumb(String somebodyPhoneNumb) {
        this.somebodyPhoneNumb = somebodyPhoneNumb;
    }

    public String getSomebodyQQNumb() {
        return somebodyQQNumb;
    }

    public void setSomebodyQQNumb(String somebodyQQNumb) {
        this.somebodyQQNumb = somebodyQQNumb;
    }

    public String getSomebodyProfession() {
        return somebodyProfession;
    }

    public void setSomebodyProfession(String somebodyProfession) {
        this.somebodyProfession = somebodyProfession;
    }

    public String getSomebodySpeciality() {
        return somebodySpeciality;
    }

    public void setSomebodySpeciality(String somebodySpeciality) {
        this.somebodySpeciality = somebodySpeciality;
    }
}
