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

@Entity(name = "content",text = "内容")
public class ContentParam implements Param {
    @Form(text = "内容id",type = ControlType.INPUT_HIDDEN,listType = ControlType.CHECK_BOX,showInList = true,primaryKey = true)
    @FieldOrder(order = 1)
    private Long id;

    @Form(text = "内容品类ID",type = ControlType.INPUT_TEXT,showInList = true)
    @FieldOrder(order = 2)
    @NullValidator(prompt = "请选择内容品类",nullError = "内容品类为必填项")
    private Long categoryId;

    @Form(text = "编辑器类型",type = ControlType.INPUT_TEXT,showInList = true)
    @FieldOrder(order = 3)
    @NullValidator(prompt = "请选择编辑器",nullError = "编辑器为必选项")

    private String editor;

    @Form(text = "标题",type = ControlType.INPUT_TEXT,showInList = true)
    @FieldOrder(order = 4)
    @NullValidator(prompt = "请输入文章标题",nullError = "文章标题为必填项",minLength = 10,maxLength = 200,lengthError = "文章标题必须在于10个字符，并且小于200字符")

    private String title;

    @Form(text = "文章摘要",type = ControlType.INPUT_TEXT,showInList = true)
    @FieldOrder(order = 5)
    @NullValidator(prompt = "请输入文章摘要",nullError = "文章标题为必填项",minLength = 50,maxLength = 500,lengthError = "文章摘要必须在于50个字符，并且小于500字符")
    private String brief;

    @Form(text = "媒体类型",type = ControlType.INPUT_TEXT,showInList = true,validate = NoneValidator.class)
    @FieldOrder(order = 5)
    private Integer mediaType;
    @Form(text = "媒体url",type = ControlType.INPUT_TEXT,showInList = true,validate = NoneValidator.class)
    @FieldOrder(order = 5)
    private String mediaUrl;
    @Form(text = "标签",type = ControlType.INPUT_TEXT,showInList = true,validate = NoneValidator.class)
    @FieldOrder(order = 5)
    private String keywords;
    @Form(text = "排序号",type = ControlType.INPUT_TEXT,showInList = true,validate = NoneValidator.class)
    @FieldOrder(order = 5)
    private Integer sort;
    @Form(text = "封面图",type = ControlType.INPUT_TEXT,showInList = true,validate = NoneValidator.class)
    @FieldOrder(order = 5)
    private String coverUrl;

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

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Integer getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaUrl() {
        return this.mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }



    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}