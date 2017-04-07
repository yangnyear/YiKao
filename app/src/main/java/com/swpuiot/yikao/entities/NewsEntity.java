package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class NewsEntity {
    private int newsId;
    private String newsLogoUri;
    private String newsContent;
    private String newsCommentNumb;
    private String newsDownLoadNumb;
/**
 * @param newsId 首页上的新消息的id;
 * @param newsLogoUri 新消息的图片的Uri
 * @param newsContent  消息内容
 * @param newsCommentNumb 消息的一个评论数量例如:123456条评论
 * @param newsDownLoadNumb 消息的一个内容下载数量 123454人下载
    * */
    public NewsEntity(int newsId, String newsLogoUri, String newsContent, String newsCommentNumb, String newsDownLoadNumb) {
        this.newsId = newsId;
        this.newsLogoUri = newsLogoUri;
        this.newsContent = newsContent;
        this.newsCommentNumb = newsCommentNumb;
        this.newsDownLoadNumb = newsDownLoadNumb;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsLogoUri() {
        return newsLogoUri;
    }

    public void setNewsLogoUri(String newsLogoUri) {
        this.newsLogoUri = newsLogoUri;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsCommentNumb() {
        return newsCommentNumb;
    }

    public void setNewsCommentNumb(String newsCommentNumb) {
        this.newsCommentNumb = newsCommentNumb;
    }

    public String getNewsDownLoadNumb() {
        return newsDownLoadNumb;
    }

    public void setNewsDownLoadNumb(String newsDownLoadNumb) {
        this.newsDownLoadNumb = newsDownLoadNumb;
    }
}
