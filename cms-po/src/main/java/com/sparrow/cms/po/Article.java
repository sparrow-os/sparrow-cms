package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CMS 文章表 persistence object/domain object
 */
@Table(name = "article")
public class Article extends PO {
    private Long id;
    private Long channel;
    private Long albumId;
    private Long typeId;
    private String editor;
    private String title;
    private String brief;
    private String keywords;
    private Integer sort;
    private String url;
    private String cover;
    private String content;
    private Long clickTimes;
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

    @MethodOrder(order = 2)
    @Column(name = "channel", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT '频道'", nullable = false)
    public Long getChannel() {
        return channel;
    }

    public void setChannel(Long channel) {
        this.channel = channel;
    }

    @MethodOrder(order = 2.1F)
    @Column(name = "type_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT '分类'", nullable = false)
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @MethodOrder(order = 2.2F)
    @Column(name = "album_id", columnDefinition = "int(8)  DEFAULT -1 COMMENT '专辑ID'", nullable = false)
    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    @MethodOrder(order = 2.3F)
    @Column(name = "editor", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '编辑器'", nullable = false)
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @MethodOrder(order = 3)
    @Column(name = "title", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '标题'", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @MethodOrder(order = 3.1F)
    @Column(name = "brief", columnDefinition = "varchar(512)  DEFAULT '' COMMENT '摘要'", nullable = false)
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @MethodOrder(order = 4)
    @Column(name = "content", columnDefinition = "text COMMENT '内容'")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @MethodOrder(order = 5)
    @Column(name = "url", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '链接url'", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @MethodOrder(order = 6)
    @Column(name = "sort", columnDefinition = "int(10)  DEFAULT 0 COMMENT '排序号'", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @MethodOrder(order = 8)
    @Column(name = "cover", columnDefinition = "varchar(256)  DEFAULT '' COMMENT '封面图'", nullable = false)
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @MethodOrder(order = 10)
    @Column(name = "keywords", columnDefinition = "varchar(64)  DEFAULT '' COMMENT '关键字,标签对应的id:name json对'", nullable = false)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @MethodOrder(order = 11)
    @Column(name = "click_times", columnDefinition = "int(11) UNSIGNED DEFAULT 0 COMMENT 'click times'", nullable = false)
    public Long getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Long clickTimes) {
        this.clickTimes = clickTimes;
    }

    @MethodOrder(order = 15F)
    @Column(name = "create_user_name", columnDefinition = "varchar(64) DEFAULT '' COMMENT '创建人姓名'", nullable = false, updatable = false)
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
}
