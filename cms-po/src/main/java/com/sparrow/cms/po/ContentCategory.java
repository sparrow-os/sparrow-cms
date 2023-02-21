package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "content_category")
public class ContentCategory extends PO {
    private Long id;
    private Long parentId;
    private String name;
    private String code;
    private Integer depth;
    private Integer isLeaf;
    private Integer sort;
    private String listUrl;
    private String detailUrl;
    private String newUrl;
    private String createUserName;

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
    @Column(name = "is_leaf", columnDefinition = "tinyint(3) DEFAULT 0 COMMENT '是否叶子节点'", nullable = false)
    public Integer getIsLeaf () {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    @MethodOrder(order = 8)
    @Column(name = "list_url", columnDefinition = "varchar(32) DEFAULT '' COMMENT '列表url'", nullable = false)
    public String getListUrl() {
        return listUrl;
    }

    public void setListUrl(String listUrl) {
        this.listUrl = listUrl;
    }

    @MethodOrder(order = 9)
    @Column(name = "detail_url", columnDefinition = "varchar(32) DEFAULT '' COMMENT '详情url'", nullable = false)
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @MethodOrder(order = 10)
    @Column(name = "new_url", columnDefinition = "varchar(32) DEFAULT '' COMMENT '新建url'", nullable = false)
    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
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
