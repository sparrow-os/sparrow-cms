package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CMS 内容F
 * <p>
 * persistence object/domain object
 */
@Table(name = "content")
public class Content extends PO {
    private Long id;
    private Long categoryId;
    private String editor;
    private String title;
    private String brief;
    private String keywords;
    private Integer sort;
    private String url;
    private String coverUrl;
    private String createUserName;
    private Integer up;
    private Integer down;
    private Long ip;
    private Integer auditStatus;//审核状态
    private Long clickTimes;
    private Long commentTimes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int(11) UNSIGNED AUTO_INCREMENT")
    @MethodOrder(order = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @MethodOrder(order = 2)
    @Column(name = "category_id", columnDefinition = "int(10) UNSIGNED  DEFAULT '' COMMENT '类别ID'", nullable = false)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @MethodOrder(order = 2.1F)
    @Column(name = "editor", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '编辑器'", nullable = false)
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @MethodOrder(order = 3)
    @Column(name = "title", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '标题'", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @MethodOrder(order = 3.1F)
    @Column(name = "brief", columnDefinition = "varchar(512)  DEFAULT '' COMMENT '摘要'", nullable = false)
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @MethodOrder(order = 4)
    @Column(name = "keywords", columnDefinition = "varchar(64)  DEFAULT '' COMMENT '关键字,标签对应的id:name json对'", nullable = false)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @MethodOrder(order = 5)
    @Column(name = "sort", columnDefinition = "int(10)  DEFAULT 0 COMMENT '排序号'", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @MethodOrder(order = 6)
    @Column(name = "url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '链接url'", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @MethodOrder(order = 7)
    @Column(name = "cover_url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '封面图'", nullable = false)
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @MethodOrder(order = 8)
    @Column(name = "create_user_name", columnDefinition = "varchar(64) DEFAULT '' COMMENT '创建人姓名'", nullable = false, updatable = false)
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @MethodOrder(order = 9)
    @Column(name = "up", columnDefinition = "int(10) UNSIGNED DEFAULT 0 COMMENT '顶数量'", nullable = false, updatable = false)
    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    @MethodOrder(order = 10)
    @Column(name = "down", columnDefinition = "int(10) UNSIGNED DEFAULT 0 COMMENT '踩数量'", nullable = false, updatable = false)
    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    @MethodOrder(order = 11)
    @Column(name = "ip", columnDefinition = "varchar(32) DEFAULT 0 COMMENT '踩数量'", nullable = false, updatable = false)
    public Long getIp() {
        return ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    @MethodOrder(order = 11)
    @Column(name = "audit_status", columnDefinition = "tinyint(1) DEFAULT 0 COMMENT '审核状态 0：未审核，1:审核通过 2：拒绝审核'", nullable = false, updatable = false)
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    @MethodOrder(order = 11)
    @Column(name = "click_times", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT 'click times'", nullable = false)
    public Long getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Long clickTimes) {
        this.clickTimes = clickTimes;
    }

    @MethodOrder(order = 11)
    @Column(name = "comment_times", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT 'comment times'", nullable = false)
    public Long getCommentTimes() {
        return commentTimes;
    }

    public void setCommentTimes(Long commentTimes) {
        this.commentTimes = commentTimes;
    }
}
