package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.POJO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "content_detail")
public class ContentDetail implements POJO {
    private Long id;
    private String detail;
    private Long updateUserId;
    private Long gmtModified;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "int(11) UNSIGNED")
    @MethodOrder(order = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @MethodOrder(order = 3)
    @Column(name = "detail", columnDefinition = "text COMMENT '详情'", nullable = false)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @MethodOrder(order = 4)
    @Column(name = "update_user_id", columnDefinition = "bigint(11)  DEFAULT 0 COMMENT 'update user id'", nullable = false)
    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Column(name = "gmt_modified", columnDefinition = "bigint(11)  DEFAULT 0 COMMENT '更新时间'", nullable = false, updatable = false)
    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}
