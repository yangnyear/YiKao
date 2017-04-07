package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class ResourceEntity {
    private int resourceId;
    private String resourceLogoUri;
    private String resourceName;
    private int resourceWorth;
    private String resourceCommentNumb;
    private String resourceDownLoadNumb;
    /**
     * @
     * @param resourceId 资料id
     * @param resourceLogoUri 资料logo图片URI
     * @param resourceName 资料名称
     * @param resourceWorth 资料需要的下载积分数量
     * @param resourceCommentNumb 评论数量例如:123456条评论
     * @param resourceDownLoadNumb 内容下载数量 123454人下载
     * */

    public ResourceEntity(int resourceId, String resourceLogoUri, String resourceName, int resourceWorth, String resourceCommentNumb, String resourceDownLoadNumb) {
        this.resourceId = resourceId;
        this.resourceLogoUri = resourceLogoUri;
        this.resourceName = resourceName;
        this.resourceWorth = resourceWorth;
        this.resourceCommentNumb = resourceCommentNumb;
        this.resourceDownLoadNumb = resourceDownLoadNumb;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceLogoUri() {
        return resourceLogoUri;
    }

    public void setResourceLogoUri(String resourceLogoUri) {
        this.resourceLogoUri = resourceLogoUri;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public int getResourceWorth() {
        return resourceWorth;
    }

    public void setResourceWorth(int resourceWorth) {
        this.resourceWorth = resourceWorth;
    }

    public String getResourceCommentNumb() {
        return resourceCommentNumb;
    }

    public void setResourceCommentNumb(String resourceCommentNumb) {
        this.resourceCommentNumb = resourceCommentNumb;
    }

    public String getResourceDownLoadNumb() {
        return resourceDownLoadNumb;
    }

    public void setResourceDownLoadNumb(String resourceDownLoadNumb) {
        this.resourceDownLoadNumb = resourceDownLoadNumb;
    }
}
