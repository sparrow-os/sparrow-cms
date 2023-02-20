package com.sparrow.stock.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "stock_out_record")
public class StockOutRecord extends PO {
    private Long id;
    private Long skuId;
    private Long orderId;
    private Integer num;
    private Boolean isRollback;

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
    @Column(name = "sku_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT 'sku id'", nullable = false)
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @MethodOrder(order = 3)
    @Column(name = "order_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT '订单 id'", nullable = false)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @MethodOrder(order = 4)
    @Column(name = "num", columnDefinition = "int(10)  DEFAULT 0 COMMENT '出库数'", nullable = false)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @MethodOrder(order = 5)
    @Column(name = "is_rollback", columnDefinition = "int(10)  DEFAULT 0 COMMENT '是否回滚'", nullable = false)
    public Boolean getRollback() {
        return isRollback;
    }

    public void setRollback(Boolean rollback) {
        isRollback = rollback;
    }
}
