package com.sparrow.pay.po;

import com.sparrow.protocol.MethodOrder;
import com.sparrow.protocol.dao.PO;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "pay_order")
public class PayOrder extends PO {
    private Long id;
    private Long tradeOrderId;
    private String tradeOrderNo;
    private String title;
    private String payOrderNo;
    private Long amount;
    private Integer appId;
    private Integer platform;//支付宝 微信 收钱吧
    private Integer channel;//渠道

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

    @Column(name = "trade_order_id", columnDefinition = "int(10)  DEFAULT 0 COMMENT '交易订单ID'", nullable = false)
    @MethodOrder(order = 2)
    public Long getTradeOrderId() {
        return tradeOrderId;
    }

    public void setTradeOrderId(Long tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
    }

    @Column(name = "trade_order_no", columnDefinition = "int(10)  DEFAULT 0 COMMENT '交易订单编号'", nullable = false)
    @MethodOrder(order = 2)
    public String getTradeOrderNo() {
        return tradeOrderNo;
    }

    public void setTradeOrderNo(String tradeOrderNo) {
        this.tradeOrderNo = tradeOrderNo;
    }

    @Column(name = "title", columnDefinition = "varchar(128)  DEFAULT '' COMMENT '标题'", nullable = false)
    @MethodOrder(order = 4)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "pay_order_no", columnDefinition = "varchar(64)  DEFAULT '' COMMENT '支付订单编号'", nullable = false)
    @MethodOrder(order = 5)
    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    @Column(name = "amount", columnDefinition = "int(10) UNSIGNED DEFAULT 0 COMMENT '总额'", nullable = false)
    @MethodOrder(order = 6)
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "app_id", columnDefinition = "int(10) UNSIGNED DEFAULT 0 COMMENT 'app id'", nullable = false)
    @MethodOrder(order = 7)
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Column(name = "platform", columnDefinition = "tinyint(3) UNSIGNED DEFAULT 0 COMMENT '平台: 1支付宝 2微信 3收钱吧'", nullable = false)
    @MethodOrder(order = 7)
    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    @Column(name = "channel", columnDefinition = "tinyint(3) UNSIGNED DEFAULT 0 COMMENT '渠道: 1 PC 2 APP'", nullable = false)
    @MethodOrder(order = 8)
    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }
}
