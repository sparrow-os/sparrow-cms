package com.sparrow.order.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order{
    private Long id;
    private String orderNo;
    private Integer goodsNum;
    private Long totalAmounts;
    private Long discountTotalAmounts;
    private Long actualTotalAmounts;
    private Long freightCouponId;
    private Long freightAmounts;
    private Long freightActualAmounts;
    private Long orderActualAmounts;
    private String logisticsNo;
    private Integer payChannel;
    private Integer payMethod;
    private Integer orderType;
    private Integer orderChannel;
    private Integer cancelType;
    private String cancelReason;
    private String buyerRemark;
    private String platformRemark;
    private Integer orderStatus;
    private Integer refundStatus;
    private Long paidTime;
    private String createUserName;
    private Long createUserId;
    private Long modifiedUserId;
    private String modifiedUserName;
    private Long gmtCreate;
    private Long gmtModified;

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

    @Column(name = "order_no", columnDefinition = "varchar(32)  DEFAULT 0 COMMENT '订单编号'", nullable = false)
    @MethodOrder(order = 2)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Column(name = "goods_num", columnDefinition = "int(10)  DEFAULT 0 COMMENT '商品总数'", nullable = false)
    @MethodOrder(order = 2)
    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Column(name = "total_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '销售总额'", nullable = false)
    @MethodOrder(order = 3)
    public Long getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(Long totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    @Column(name = "discount_total_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '商品优惠总额'", nullable = false)
    @MethodOrder(order = 4)
    public Long getDiscountTotalAmounts() {
        return discountTotalAmounts;
    }

    public void setDiscountTotalAmounts(Long discountTotalAmounts) {
        this.discountTotalAmounts = discountTotalAmounts;
    }

    @Column(name = "actual_total_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '商品实付总额=销售总额-商品优惠总额'", nullable = false)
    @MethodOrder(order = 5)
    public Long getActualTotalAmounts() {
        return actualTotalAmounts;
    }

    public void setActualTotalAmounts(Long actualTotalAmount) {
        this.actualTotalAmounts = actualTotalAmounts;
    }

    @Column(name = "freight_coupon_id", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '运费券ID'", nullable = false)
    @MethodOrder(order = 5)
    public Long getFreightCouponId() {
        return freightCouponId;
    }

    public void setFreightCouponId(Long freightCouponId) {
        this.freightCouponId = freightCouponId;
    }

    @Column(name = "freight_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '运费总额'", nullable = false)
    @MethodOrder(order = 6)
    public Long getFreightAmounts() {
        return freightAmounts;
    }

    public void setFreightAmounts(Long freightAmounts) {
        this.freightAmounts = freightAmounts;
    }

    @Column(name = "actual_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '实付运费=运费总额-运费券额度'", nullable = false)
    @MethodOrder(order = 7)
    public Long getFreightActualAmounts() {
        return freightActualAmounts;
    }

    public void setFreightActualAmounts(Long freightActualAmounts) {
        this.freightActualAmounts = freightActualAmounts;
    }

    @Column(name = "order_actual_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '订单实付金额=商品实付总额+实付运费'", nullable = false)
    @MethodOrder(order = 8)
    public Long getOrderActualAmounts() {
        return orderActualAmounts;
    }

    public void setOrderActualAmounts(Long orderActualAmounts) {
        this.orderActualAmounts = orderActualAmounts;
    }

    @Column(name = "logistics_no", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '运单号'", nullable = false)
    @MethodOrder(order = 9)
    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    @Column(name = "pay_channel", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '支付渠道:1 支付宝；2 微信；'", nullable = false)
    @MethodOrder(order = 10)
    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    @Column(name = "pay_method", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '支付方式:1 在线支付；2 货到付款；'", nullable = false)
    @MethodOrder(order = 10)
    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    @Column(name = "order_type", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '订单类型'", nullable = false)
    @MethodOrder(order = 11)
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Column(name = "order_channel", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '订单渠道：1 app 2 web'", nullable = false)
    @MethodOrder(order = 12)
    public Integer getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(Integer orderChannel) {
        this.orderChannel = orderChannel;
    }

    @Column(name = "cancel_type", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '取消类型'", nullable = false)
    @MethodOrder(order = 13)
    public Integer getCancelType() {
        return cancelType;
    }

    public void setCancelType(Integer cancelType) {
        this.cancelType = cancelType;
    }

    @Column(name = "cancel_reason", columnDefinition = "varchar(512)  DEFAULT '' COMMENT '取消原因'", nullable = false)
    @MethodOrder(order = 14)
    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    @Column(name = "buyer_remark", columnDefinition = "varchar(512)  DEFAULT '' COMMENT '买家备注'", nullable = false)
    @MethodOrder(order = 15)
    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark;
    }

    @Column(name = "platform_remark", columnDefinition = "varchar(512)  DEFAULT '' COMMENT '平台备注'", nullable = false)
    @MethodOrder(order = 15)
    public String getPlatformRemark() {
        return platformRemark;
    }

    public void setPlatformRemark(String platformRemark) {
        this.platformRemark = platformRemark;
    }

    @Column(name = "order_status", columnDefinition = "tinyint(4)  DEFAULT 0 COMMENT '订单状态: 10 待支付，20：已付款，待发货,30:已发货 40 确认收货 -10:用户关闭，-20：平台关闭， -30：系统关闭'", nullable = false)
    @MethodOrder(order = 16)
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Column(name = "refund_status", columnDefinition = "tinyint(4)  DEFAULT 0 COMMENT '退款状态: 10 退款中，20：退款完成'", nullable = false)
    @MethodOrder(order = 17)
    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Column(name = "paid_time", columnDefinition = "bigint(11) UNSIGNED DEFAULT 0 COMMENT '支付时间'", nullable = false)
    @MethodOrder(order = 17)
    public Long getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Long paidTime) {
        this.paidTime = paidTime;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public void setModifiedUserId(Long modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    @MethodOrder(
        order = 101.0F
    )
    @Column(
        name = "create_user_id",
        columnDefinition = "int(11) UNSIGNED  DEFAULT 0 COMMENT '创建人ID'",
        nullable = false,
        updatable = false
    )
    public Long getCreateUserId() {
        return this.createUserId;
    }

    @MethodOrder(
        order = 102.0F
    )
    @Column(
        name = "gmt_create",
        columnDefinition = "bigint(11)  DEFAULT 0 COMMENT '创建时间'",
        nullable = false,
        updatable = false
    )
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    @MethodOrder(
        order = 103.0F
    )
    @Column(
        name = "modified_user_id",
        columnDefinition = "int(11) unsigned  DEFAULT 0 COMMENT '更新人ID'",
        nullable = false
    )
    public Long getModifiedUserId() {
        return this.modifiedUserId;
    }

    @MethodOrder(
        order = 104.0F
    )
    @Column(
        name = "gmt_modified",
        columnDefinition = "bigint(11)  DEFAULT 0 COMMENT '更新时间'",
        nullable = false
    )
    public Long getGmtModified() {
        return this.gmtModified;
    }

    @MethodOrder(
        order = 105.0F
    )
    @Column(
        name = "create_user_name",
        columnDefinition = "varchar(64)  DEFAULT '' COMMENT '创建人'",
        nullable = false
    )
    public String getCreateUserName() {
        return this.createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @MethodOrder(
        order = 105.0F
    )
    @Column(
        name = "modified_user_name",
        columnDefinition = "varchar(64)  DEFAULT '' COMMENT '更新人'",
        nullable = false
    )
    public String getModifiedUserName() {
        return this.modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

}
