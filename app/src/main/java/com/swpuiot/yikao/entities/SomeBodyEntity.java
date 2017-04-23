package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyEntity {

    /**
     * id : 3
     * pubId : 4
     * pubGrade : 2
     * academy : 通用
     * studySubject : 高数
     * pubDescription : 计科院的一名女生，擅长高数
     * shareScore : 4
     * pubPhone : 15928543307
     */

    private int id;
    private int pubId;
    private int pubGrade;
    private String academy;
    private String studySubject;
    private String pubDescription;
    private int shareScore;
    private String pubPhone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public int getPubGrade() {
        return pubGrade;
    }

    public void setPubGrade(int pubGrade) {
        this.pubGrade = pubGrade;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getStudySubject() {
        return studySubject;
    }

    public void setStudySubject(String studySubject) {
        this.studySubject = studySubject;
    }

    public String getPubDescription() {
        return pubDescription;
    }

    public void setPubDescription(String pubDescription) {
        this.pubDescription = pubDescription;
    }

    public int getShareScore() {
        return shareScore;
    }

    public void setShareScore(int shareScore) {
        this.shareScore = shareScore;
    }

    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
    }
}
