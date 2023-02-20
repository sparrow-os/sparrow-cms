package com.sparrow.stock.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Stock extends PO {
    private Long id;
    private Long skuId;
    private Long availableStock;
    private Long lockedStock;

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

    @Column(name = "sku_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT 'sku id'", nullable = false)
    @MethodOrder(order = 2)
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Column(name = "available_stock", columnDefinition = "int(10)  DEFAULT 0 COMMENT '可用库存'", nullable = false)
    @MethodOrder(order = 2)
    public Long getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(Long availableStock) {
        this.availableStock = availableStock;
    }

    @Column(name = "lock_stock", columnDefinition = "int(10)  DEFAULT 0 COMMENT '锁定库存'", nullable = false)
    @MethodOrder(order = 2)
    public Long getLockedStock() {
        return lockedStock;
    }

    public void setLockedStock(Long lockedStock) {
        this.lockedStock = lockedStock;
    }
}
