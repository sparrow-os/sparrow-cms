package com.sparrow.cms.admin.bo;

import com.sparrow.protocol.BO;
import com.sparrow.protocol.enums.StatusRecord;

public class ContentCategoryBO implements BO {
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
    private Long createUserId;
    private Long modifiedUserId;
    private String modifiedUserName;
    private Long gmtCreate;
    private Long gmtModified;
    private StatusRecord status;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDepth() {
        return this.depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getIsLeaf() {
        return this.isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getListUrl() {
        return this.listUrl;
    }

    public void setListUrl(String listUrl) {
        this.listUrl = listUrl;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getNewUrl() {
        return this.newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Long getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getModifiedUserId() {
        return this.modifiedUserId;
    }

    public void setModifiedUserId(Long modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public String getModifiedUserName() {
        return this.modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public StatusRecord getStatus() {
        return this.status;
    }

    public void setStatus(StatusRecord status) {
        this.status = status;
    }

}