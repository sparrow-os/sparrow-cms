package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "article_type")
public class ArticleType extends PO {
    private Long id;
    private Long channel;
    private Long parentId;
    private String name;
    private String code;
    private Integer sort;

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
    @Column(name = "channel", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT '频道ID'", nullable = false)
    public Long getChannel() {
        return channel;
    }

    public void setChannel(Long channel) {
        this.channel = channel;
    }

    @MethodOrder(order = 3)
    @Column(name = "parent_id", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT '类型父ID'", nullable = false)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @MethodOrder(order = 4)
    @Column(name = "name", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '类型名称'", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MethodOrder(order = 5)
    @Column(name = "code", columnDefinition = "varchar(16) DEFAULT '' COMMENT '类型编码'", nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @MethodOrder(order = 6)
    @Column(name = "sort", columnDefinition = "int(10) DEFAULT 0 COMMENT '排序号'", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
