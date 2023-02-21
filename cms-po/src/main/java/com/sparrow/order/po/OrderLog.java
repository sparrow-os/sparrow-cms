package com.sparrow.order.po;

import com.sparrow.protocol.MethodOrder;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_log")
public class OrderLog {
    private Long id;
    private Long orderId;
    private String orderNo;
    private Long skuId;
    private Integer beforeStatus;
    private Integer afterStatus;
    private Integer operatorType;
    private Long operatorId;
    private Long operatorName;
    private Long operatorTime;
    private String remark;

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

    @Column(name = "sku_id", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '商品ID'", nullable = false)
    @MethodOrder(order = 4)
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Column(name = "before_status", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '原始状态'", nullable = false)
    @MethodOrder(order = 5)
    public Integer getBeforeStatus() {
        return beforeStatus;
    }

    public void setBeforeStatus(Integer beforeStatus) {
        this.beforeStatus = beforeStatus;
    }

    @Column(name = "after_status", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '改后状态'", nullable = false)
    @MethodOrder(order = 6)
    public Integer getAfterStatus() {
        return afterStatus;
    }

    public void setAfterStatus(Integer afterStatus) {
        this.afterStatus = afterStatus;
    }

    @Column(name = "operator_type", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '操作人类型:普通用户 管理员 系统调度'", nullable = false)
    @MethodOrder(order = 7)
    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    @Column(name = "operator_id", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '操作人id'", nullable = false)
    @MethodOrder(order = 8)
    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    @Column(name = "operator_name", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '操作人'", nullable = false)
    @MethodOrder(order = 8)
    public Long getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(Long operatorName) {
        this.operatorName = operatorName;
    }

    @Column(name = "operator_time", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '操作时间'", nullable = false)
    @MethodOrder(order = 9)
    public Long getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Long operatorTime) {
        this.operatorTime = operatorTime;
    }

    @Column(name = "remark", columnDefinition = "varchar(512) DEFAULT '' COMMENT '备注'", nullable = false)
    @MethodOrder(order = 8)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
