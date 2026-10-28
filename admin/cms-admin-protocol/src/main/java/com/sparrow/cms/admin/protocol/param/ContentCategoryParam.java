package com.sparrow.cms.admin.protocol.param;

import com.sparrow.coding.protocol.ControlType;
import com.sparrow.coding.protocol.Entity;
import com.sparrow.coding.protocol.Form;
import com.sparrow.coding.protocol.validate.AllowOptionsValidator;
import com.sparrow.coding.protocol.validate.NoneValidator;
import com.sparrow.coding.protocol.validate.NullValidator;
import com.sparrow.protocol.FieldOrder;
import com.sparrow.protocol.Param;
import com.sparrow.protocol.enums.StatusRecord;

@Entity(name = "contentCategory", text = "内容品类")
public class ContentCategoryParam implements Param {
    @Form(text = "品类id", type = ControlType.INPUT_HIDDEN, listType = ControlType.CHECK_BOX, showInList = true, primaryKey = true)
    @FieldOrder(order = 1)
    private Long id;

    @Form(text = "父品类", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true)
    @NullValidator(prompt = "请选择你品类", nullError = "父品类为必选项")
    @FieldOrder(order = 2)
    private Long parentId;

    @Form(text = "品类名称", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true)
    @NullValidator(prompt = "请输入品类名", nullError = "品类名为必填项")
    @FieldOrder(order = 2)
    private String name;

    @Form(text = "品类编码", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true)
    @NullValidator(prompt = "请输入品类编码", nullError = "品类编码为必填项")
    @FieldOrder(order = 3)
    private String code;

    @Form(text = "排序", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true)
    @NullValidator(prompt = "请输入排序号", nullError = "品类序号为必填项")
    @FieldOrder(order = 4)
    private Integer sort;

    @Form(text = "列表页模板url", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true, validate = NoneValidator.class)
    @FieldOrder(order = 5)
    private String listUrl;

    @Form(text = "详情模板url", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true, validate = NoneValidator.class)
    @FieldOrder(order = 6)
    private String detailUrl;

    @Form(text = "新建模板url", type = ControlType.INPUT_TEXT, listType = ControlType.LABEL, showInList = true, validate = NoneValidator.class)
    @FieldOrder(order = 6)
    private String newUrl;

    @Form(text = "状态", type = ControlType.ENABLE_DISABLE, validate = AllowOptionsValidator.class, showInList = true)
    @AllowOptionsValidator(options = {"1", "2"}, defaultValue = "1")
    @FieldOrder(order = 7)
    private String status;

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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}