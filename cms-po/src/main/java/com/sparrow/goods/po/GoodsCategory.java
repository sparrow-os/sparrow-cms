package com.sparrow.goods.po;

import com.sparrow.protocol.MethodOrder;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GoodsCategory {
    private Long id;
    private Long parentId;
    private String code;
    private String name;
    private Integer depth;
    private Boolean leaf;
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
    @Column(name = "depth", columnDefinition = "int(10) DEFAULT 0 COMMENT '深度'", nullable = false)
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    @MethodOrder(order = 7)
    @Column(name = "leaf", columnDefinition = "tinyint(1) DEFAULT 0 COMMENT '是否叶子节点'", nullable = false)
    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    @MethodOrder(order = 11)
    @Column(name = "sort", columnDefinition = "int(10) DEFAULT 0 COMMENT '排序号'", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}
