package com.sparrow.goods.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Goods extends PO {
    private Long id;
    private String title;
    private String brief;
    private Long categoryId;
    private Integer clickTimes;
    private Integer commentTimes;
    private String keywords;
    private Integer sort;
    private Long price;
    private Integer up;
    private Integer down;

    private Integer auditStatus;

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

    @MethodOrder(order = 2)
    @Column(name = "category_id", columnDefinition = "int(10) UNSIGNED  DEFAULT '' COMMENT '类别ID'", nullable = false)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Integer clickTimes) {
        this.clickTimes = clickTimes;
    }

    public Integer getCommentTimes() {
        return commentTimes;
    }

    public void setCommentTimes(Integer commentTimes) {
        this.commentTimes = commentTimes;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }
}
