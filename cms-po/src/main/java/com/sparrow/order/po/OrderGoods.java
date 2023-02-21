package com.sparrow.order.po;

import com.sparrow.protocol.MethodOrder;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_goods")
public class OrderGoods {
    private Long id;
    private Long orderId;
    private String orderNo;
    private Long skuId;
    private String goodsCategory;
    private String goodsType;
    private String goodsPicture;
    private String goodsTitle;
    private String goodsBrand;
    private Integer goodsNum;
    private Long goodsUnitPrice;
    private Long saleTotalAmounts;
    private Long discountTotalAmounts;
    private Long actualTotalAmounts;
    private String goodsSpecifications;

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

    @Column(name = "order_id", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '订单ID'", nullable = false)
    @MethodOrder(order = 2)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Column(name = "order_no", columnDefinition = "varchar(32)  DEFAULT '' COMMENT '订单编号'", nullable = false)
    @MethodOrder(order = 3)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Column(name = "sku_id", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT 'SKU ID'", nullable = false)
    @MethodOrder(order = 4)
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Column(name = "goods_category", columnDefinition = "varchar(128) UNSIGNED  DEFAULT '' COMMENT '商品品类'", nullable = false)
    @MethodOrder(order = 5)
    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    @Column(name = "goods_type", columnDefinition = "tinyint(3) UNSIGNED  DEFAULT 0 COMMENT '商品类型'", nullable = false)
    @MethodOrder(order = 6)
    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    @Column(name = "goods_picture", columnDefinition = "varchar(128) UNSIGNED  DEFAULT '' COMMENT '商品图片'", nullable = false)
    @MethodOrder(order = 7)
    public String getGoodsPicture() {
        return goodsPicture;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture;
    }

    @Column(name = "goods_title", columnDefinition = "varchar(128) UNSIGNED  DEFAULT '' COMMENT '商品标题'", nullable = false)
    @MethodOrder(order = 8)
    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    @Column(name = "goods_brand", columnDefinition = "varchar(128) UNSIGNED  DEFAULT '' COMMENT '商品品牌'", nullable = false)
    @MethodOrder(order = 8)
    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    @Column(name = "goods_num", columnDefinition = "varchar(128) UNSIGNED  DEFAULT '' COMMENT '商品数量'", nullable = false)
    @MethodOrder(order = 9)
    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Column(name = "goods_unit_price", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '商品单价'", nullable = false)
    @MethodOrder(order = 10)
    public Long getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    public void setGoodsUnitPrice(Long goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    @Column(name = "sale_total_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '总金额=商品单价+商品数'", nullable = false)
    @MethodOrder(order = 10)
    public Long getSaleTotalAmounts() {
        return saleTotalAmounts;
    }

    public void setSaleTotalAmounts(Long saleTotalAmounts) {
        this.saleTotalAmounts = saleTotalAmounts;
    }

    @Column(name = "discount_total_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '优惠总额'", nullable = false)
    @MethodOrder(order = 11)
    public Long getDiscountTotalAmounts() {
        return discountTotalAmounts;
    }

    public void setDiscountTotalAmounts(Long discountTotalAmounts) {
        this.discountTotalAmounts = discountTotalAmounts;
    }

    @Column(name = "actual_total_amounts", columnDefinition = "int(10) UNSIGNED  DEFAULT 0 COMMENT '商品实付总额=销售总额-商品优惠总额'", nullable = false)
    @MethodOrder(order = 12)
    public Long getActualTotalAmounts() {
        return actualTotalAmounts;
    }

    public void setActualTotalAmounts(Long actualTotalAmounts) {
        this.actualTotalAmounts = actualTotalAmounts;
    }

    @Column(name = "goods_specifications", columnDefinition = "varchar(128) UNSIGNED  DEFAULT '' COMMENT '商品规格描述 json'", nullable = false)
    @MethodOrder(order = 8)
    public String getGoodsSpecifications() {
        return goodsSpecifications;
    }

    public void setGoodsSpecifications(String goodsSpecifications) {
        this.goodsSpecifications = goodsSpecifications;
    }
}
