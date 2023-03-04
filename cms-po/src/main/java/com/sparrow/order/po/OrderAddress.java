package com.sparrow.order.po;

import com.sparrow.protocol.MethodOrder;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_address")
public class OrderAddress {

    private Long id;
    private Long orderId;
    private String orderNo;
    private Long createUserId;
    private String userAddressId;
    private String consigneeName;
    private String consigneeMobile;
    private String province;
    private String city;
    private String region;
    private String consigneeAddress;
    private Long createTime;
    private Integer idDelete;

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

    @Column(name = "order_id", columnDefinition = "int(11) UNSIGNED  DEFAULT 0 COMMENT '订单ID'", nullable = false)
    @MethodOrder(order = 2)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Column(name = "order_no", columnDefinition = "varchar(32)  DEFAULT 0 COMMENT '订单编号'", nullable = false)
    @MethodOrder(order = 3)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Column(name = "create_user_id", columnDefinition = "int(11) UNSIGNED  DEFAULT 0 COMMENT '订单用户ID'", nullable = false)
    @MethodOrder(order = 4)
    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Column(name = "user_address_id", columnDefinition = "int(11) UNSIGNED  DEFAULT 0 COMMENT '用户地址ID'", nullable = false)
    @MethodOrder(order = 5)
    public String getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(String userAddressId) {
        this.userAddressId = userAddressId;
    }

    @Column(name = "consignee_name", columnDefinition = "varchar(32)  DEFAULT 0 COMMENT '收货人姓名'", nullable = false)
    @MethodOrder(order = 6)
    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    @Column(name = "consignee_mobile", columnDefinition = "varchar(32)  DEFAULT 0 COMMENT '收货人手机号'", nullable = false)
    @MethodOrder(order = 6)
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    @Column(name = "province", columnDefinition = "varchar(16)  DEFAULT 0 COMMENT '省'", nullable = false)
    @MethodOrder(order = 7)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "city", columnDefinition = "varchar(16)  DEFAULT 0 COMMENT '市'", nullable = false)
    @MethodOrder(order = 8)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "region", columnDefinition = "varchar(16)  DEFAULT 0 COMMENT '区县'", nullable = false)
    @MethodOrder(order = 9)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "consignee_address", columnDefinition = "varchar(256)  DEFAULT 0 COMMENT '详细地址'", nullable = false)
    @MethodOrder(order = 10)
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    @Column(name = "create_time", columnDefinition = "bigint(10)   DEFAULT 0 COMMENT '生单时间'", nullable = false)
    @MethodOrder(order = 10)
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Column(name = "is_delete", columnDefinition = "tinyint(3)   DEFAULT 0 COMMENT '是否删除'", nullable = false)
    @MethodOrder(order = 10)
    public Integer getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Integer idDelete) {
        this.idDelete = idDelete;
    }
}
