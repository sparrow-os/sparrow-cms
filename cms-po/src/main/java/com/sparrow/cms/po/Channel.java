package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "channel")
public class Channel extends PO {
    private Long id;
    private String name;
    private String code;
    private Integer sort;
    private String listUrl;
    private String detailUrl;
    private String newUrl;

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
    @Column(name = "name", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '渠道名'", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MethodOrder(order = 3)
    @Column(name = "code", columnDefinition = "varchar(16)  DEFAULT '' COMMENT '渠道编码'", nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @MethodOrder(order = 4)
    @Column(name = "sort", columnDefinition = "int(10)  DEFAULT 0 COMMENT '排序号'", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @MethodOrder(order = 5)
    @Column(name = "list_url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '列表页 url'", nullable = false)
    public String getListUrl() {
        return listUrl;
    }

    public void setListUrl(String listUrl) {
        this.listUrl = listUrl;
    }

    @MethodOrder(order = 6)
    @Column(name = "detail_url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '详情页 url'", nullable = false)
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @MethodOrder(order = 7)
    @Column(name = "new_url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '新建 url'", nullable = false)
    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }
}
