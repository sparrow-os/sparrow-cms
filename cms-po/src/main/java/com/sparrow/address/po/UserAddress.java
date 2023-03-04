package com.sparrow.address.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_address")
public class UserAddress extends PO {
    private Long id;
    private Long userId;
    private String consigneeName;
    private String consigneeMobile;
    private String cityCode;
    private String consigneeDetailAddress;
    private String postCode;
    private Integer isDefault;

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

    @Column(name = "user_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT '用户ID'", nullable = false)
    @MethodOrder(order = 2)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "consignee_name", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '收货人'", nullable = false)
    @MethodOrder(order = 3)
    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    @Column(name = "consignee_mobile", columnDefinition = "varchar(13)  DEFAULT '' COMMENT '收货电话'", nullable = false)
    @MethodOrder(order = 4)
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    @Column(name = "city_code", columnDefinition = "varchar(8)  DEFAULT '' COMMENT '城市国标码[县区级别]'", nullable = false)
    @MethodOrder(order = 5)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Column(name = "consignee_detail_address", columnDefinition = "varchar(128)  DEFAULT '' COMMENT '详细地址'", nullable = false)
    @MethodOrder(order = 5)
    public String getConsigneeDetailAddress() {
        return consigneeDetailAddress;
    }

    public void setConsigneeDetailAddress(String consigneeDetailAddress) {
        this.consigneeDetailAddress = consigneeDetailAddress;
    }

    @Column(name = "is_default", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '是否默认'", nullable = false)
    @MethodOrder(order = 6)
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}
