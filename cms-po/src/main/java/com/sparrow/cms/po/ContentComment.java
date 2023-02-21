package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ContentComment extends PO {
    private Long id;
    private Long contentId;
    private String content;
    private String createUserName;
    private Integer up;
    private Integer down;
    private Integer floor;
    private Long ip;
    private String referenceIds;
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

    @MethodOrder(order = 2)
    @Column(name = "content_id", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '内容ID'", nullable = false)
    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    @MethodOrder(order = 3)
    @Column(name = "content", columnDefinition = "varchar(512) UNSIGNED  DEFAULT '' COMMENT '评论内容'", nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @MethodOrder(order = 4)
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

    @MethodOrder(order = 12)
    @Column(name = "floor", columnDefinition = "int(10) UNSIGNED DEFAULT 0 COMMENT '楼层'", nullable = false, updatable = false)
    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @MethodOrder(order = 13)
    @Column(name = "reference_ids", columnDefinition = "varchar(255) DEFAULT '' COMMENT '引用评论id'", nullable = false)
    public String getReferenceIds() {
        return referenceIds;
    }

    public void setReferenceIds(String referenceIds) {
        this.referenceIds = referenceIds;
    }

    @MethodOrder(order = 11)
    @Column(name = "audit_status", columnDefinition = "tinyint(1) DEFAULT 0 COMMENT '审核状态 0：未审核，1:审核通过 2：拒绝审核'", nullable = false, updatable = false)
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }
}
