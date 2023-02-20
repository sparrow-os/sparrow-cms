package com.sparrow.stock.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "stock_out_record")
public class StockInRecord extends PO {
    private Long id;
    private Long skuId;
    private Integer num;
    private Long purchaseOrderId;

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

    @MethodOrder(order = 4)
    @Column(name = "num", columnDefinition = "int(10)  DEFAULT 0 COMMENT '出库数'", nullable = false)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @MethodOrder(order = 4)
    @Column(name = "purchase_order_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT '采购单ID'", nullable = false)
    public Long getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
}
