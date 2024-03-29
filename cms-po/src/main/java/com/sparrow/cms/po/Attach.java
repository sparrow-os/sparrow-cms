package com.sparrow.cms.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "attach")
public class Attach extends PO {
    public Attach() {
    }

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 文件id(文件的唯一标识)
     */
    private String fileId;
    private String contentType;
    private Boolean isCover;
    private Integer width;
    private Integer height;
    private Integer businessType;
    private Integer businessId;
    /**
     * 文件的实际大小
     */
    private Long contentLength;
    /**
     * 下载次数
     */
    private Long downloadTimes;
    /**
     * 客户端文件名
     */
    private String clientFileName;

    public void setId(Long id) {
        this.id = id;
    }

    public Attach(String clientFileName, String contentType, Long authorId) {
        this.downloadTimes = 0L;
        this.setCreateUserId(authorId);
        this.setGmtCreate(System.currentTimeMillis());
        this.clientFileName = clientFileName;
        this.contentType = contentType;
        this.contentLength = 0L;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int(11)")
    @MethodOrder(order = 0)
    public Long getId() {
        return this.id;
    }

    @Column(name = "file_id", columnDefinition = "varchar(64)", unique = true)
    @MethodOrder(order = 1)
    public String getFileId() {
        return fileId;
    }

    @Column(name = "client_file_name", columnDefinition = "varchar(256) DEFAULT ''", updatable = false, nullable = false)
    @MethodOrder(order = 2)
    public String getClientFileName() {
        return clientFileName;
    }

    @Column(name = "download_times", columnDefinition = "int(11) UNSIGNED DEFAULT 0", nullable = false, updatable = false)
    @MethodOrder(order = 3)
    public Long getDownloadTimes() {
        return downloadTimes;
    }

    @Column(name = "content_length", columnDefinition = "int(11) UNSIGNED DEFAULT 0", nullable = false)
    @MethodOrder(order = 4)
    public Long getContentLength() {
        return contentLength;
    }

    @Column(name = "content_type", columnDefinition = "varchar(64) DEFAULT ''", updatable = false, nullable = false)
    @MethodOrder(order = 5)
    public String getContentType() {
        return this.contentType;
    }

    @MethodOrder(order = 6)
    @Column(name = "client_file_name", columnDefinition = "varchar(64) DEFAULT ''", updatable = false, nullable = false)
    public void setClientFileName(String clientFileName) {
        this.clientFileName = clientFileName;
    }

    public void setDownloadTimes(Long downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @MethodOrder(order = 6)
    @Column(name = "is_cover", columnDefinition = "tinyint(1) DEFAULT 0 ", updatable = false, nullable = false)
    public Boolean getCover() {
        return isCover;
    }

    public void setCover(Boolean cover) {
        isCover = cover;
    }

    @MethodOrder(order = 7)
    @Column(name = "width", columnDefinition = "int(10) DEFAULT 0 ", updatable = false, nullable = false)
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @MethodOrder(order = 8)
    @Column(name = "height", columnDefinition = "int(10) DEFAULT 0 ", updatable = false, nullable = false)
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @MethodOrder(order = 9)
    @Column(name = "business_type", columnDefinition = "int(10) DEFAULT 0 ", updatable = false, nullable = false)
    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    @MethodOrder(order = 10)
    @Column(name = "business_id", columnDefinition = "int(10) DEFAULT 0 ", updatable = false, nullable = false)
    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }
}
