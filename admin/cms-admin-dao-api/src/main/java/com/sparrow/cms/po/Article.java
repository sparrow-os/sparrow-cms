package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.POJO;
import javax.persistence.*;

@Table(name = "article")
public class Article implements POJO {
    private Long articleId;
    private String forumCode;
    private String editor;
    private String title;
    private String brief;
    private String keywords;
    private Integer sort;
    private String url;
    private String cover;
    private String content;
    private Long clickTimes;
    private Long createTime;
    private Long updateTime;
    private Long createUserId;
    private String createUserName;
    private Integer status;
    private Integer pageSize;
    private String type;
    private Long albumId;
    private Boolean onlyShowInSelfForum;
    private String remark;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id", columnDefinition = "int(11) UNSIGNED AUTO_INCREMENT")
    @MethodOrder(order = 1)
    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @MethodOrder(order = 2)
    @Column(name = "forum_code", columnDefinition = "varchar(32)  DEFAULT '' COMMENT 'forum code'", nullable = false)
    public String getForumCode() {
        return forumCode;
    }

    public void setForumCode(String forumCode) {
        this.forumCode = forumCode;
    }
   
    @MethodOrder(order = 2.1F)
    @Column(name = "editor", columnDefinition = "varchar(32)  DEFAULT '' COMMENT 'editor'", nullable = false)
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @MethodOrder(order = 3)
    @Column(name = "title", columnDefinition = "varchar(256)  DEFAULT '' COMMENT 'title'", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @MethodOrder(order = 3)
    @Column(name = "brief", columnDefinition = "varchar(512)  DEFAULT '' COMMENT 'brief'", nullable = false)
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @MethodOrder(order = 4)
    @Column(name = "content", columnDefinition = "text COMMENT 'content'")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @MethodOrder(order = 5)
    @Column(name = "click_times", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT 'click times'", nullable = false)
    public Long getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Long clickTimes) {
        this.clickTimes = clickTimes;
    }

    @MethodOrder(order = 6)
    @Column(name = "create_time", columnDefinition = "bigint(20) DEFAULT 0 COMMENT 'create time'", nullable = false, updatable = false)
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @MethodOrder(order = 7)
    @Column(name = "update_time", columnDefinition = "bigint(10) DEFAULT 0 COMMENT 'update time'", nullable = false)
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @MethodOrder(order = 8)
    @Column(name = "create_user_id", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT 'create user id'", nullable = false, updatable = false)
    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @MethodOrder(order = 8.1F)
    @Column(name = "create_user_name", columnDefinition = "varchar(64) DEFAULT '' COMMENT 'create user name'", nullable = false, updatable = false)
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @MethodOrder(order = 9)
    @Column(name = "status", columnDefinition = "tinyint(1) DEFAULT 0 COMMENT 'status -> STATUS_RECORD enum'", nullable = false)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @MethodOrder(order = 10)
    @Column(name = "url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT 'link'", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @MethodOrder(order = 11)
    @Column(name = "sort",columnDefinition = "int(10)  DEFAULT 0 COMMENT 'sort'",nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @MethodOrder(order = 12)
    @Column(name = "page_size", columnDefinition = "int(10)  DEFAULT 0 COMMENT 'page size'", nullable = false)
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @MethodOrder(order = 13)
    @Column(name = "type", columnDefinition = "varchar(16)  DEFAULT '' COMMENT 'type'", nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @MethodOrder(order = 14)
    @Column(name = "cover", columnDefinition = "varchar(256)  DEFAULT '' COMMENT 'cover'", nullable = false)
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @MethodOrder(order = 15)
    @Column(name = "album_id", columnDefinition = "int(8)  DEFAULT -1 COMMENT '-1:正常,非专辑\n0:专辑\n>0专辑子页面'", nullable = false)
    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    @MethodOrder(order = 16)
    @Column(name = "keywords", columnDefinition = "varchar(64)  DEFAULT '' COMMENT 'keywords'", nullable = false)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @MethodOrder(order = 17)
    @Column(name = "remark", columnDefinition = "text COMMENT 'remark'", nullable = false)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @MethodOrder(order = 18)
    @Column(name = "only_show_in_self_forum", columnDefinition = "tinyint(1)  DEFAULT 0 COMMENT 'show in self forum'", nullable = false)
    public Boolean getOnlyShowInSelfForum() {
        return onlyShowInSelfForum;
    }

    public void setOnlyShowInSelfForum(Boolean onlyShowInSelfForum) {
        this.onlyShowInSelfForum = onlyShowInSelfForum;
    }

}
