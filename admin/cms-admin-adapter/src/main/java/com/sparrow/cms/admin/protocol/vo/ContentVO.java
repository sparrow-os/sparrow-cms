package com.sparrow.cms.admin.protocol.vo;

import com.sparrow.protocol.VO;

public class ContentVO implements VO {
    private Long id;
    private Long categoryId;
    private String editor;
    private String title;
    private String brief;
    private Integer mediaType;
    private String mediaUrl;
    private String keywords;
    private Integer sort;
    private String coverUrl;
    private String createUserName;
    private Integer up;
    private Integer down;
    private Long ip;
    private Integer auditStatus;
    private Long clickTimes;
    private Long commentTimes;
    private Long createUserId;
    private Long modifiedUserId;
    private String modifiedUserName;
    private Long gmtCreate;
    private Long gmtModified;
    private String status;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Integer getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaUrl() {
        return this.mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Integer getUp() {
        return this.up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return this.down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Long getIp() {
        return this.ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getClickTimes() {
        return this.clickTimes;
    }

    public void setClickTimes(Long clickTimes) {
        this.clickTimes = clickTimes;
    }

    public Long getCommentTimes() {
        return this.commentTimes;
    }

    public void setCommentTimes(Long commentTimes) {
        this.commentTimes = commentTimes;
    }


    public Long getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getModifiedUserId() {
        return this.modifiedUserId;
    }

    public void setModifiedUserId(Long modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public String getModifiedUserName() {
        return this.modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}