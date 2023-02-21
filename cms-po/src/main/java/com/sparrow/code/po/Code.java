package com.sparrow.code.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author harry
 */
@Table(name = "code")
public class Code extends PO {
    private Long id;
    private String name;
    private Long parentId;
    private String code;
    private String value;
    private Integer status;
    private String remark;
    private Integer sort;

    public Code() {
    }

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
    @Column(name = "name", columnDefinition = "varchar(64)  DEFAULT '' COMMENT 'NAME'", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MethodOrder(order = 3)
    @Column(name = "parent_id", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT 'parent id'", nullable = false)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @MethodOrder(order = 4)
    @Column(name = "code", unique = true, columnDefinition = "varchar(64) DEFAULT '' COMMENT 'CODE'", nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @MethodOrder(order = 5)
    @Column(name = "value", columnDefinition = "varchar(128) DEFAULT '' COMMENT 'VALUE'", nullable = false)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @MethodOrder(order = 9)
    @Column(name = "remark", columnDefinition = "varchar(1024) DEFAULT '' COMMENT 'remark'", nullable = false)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @MethodOrder(order = 10)
    @Column(name = "sort", columnDefinition = "int(10) UNSIGNED DEFAULT 0 COMMENT 'sort'", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
