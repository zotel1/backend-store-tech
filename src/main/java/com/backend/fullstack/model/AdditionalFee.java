package com.backend.fullstack.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

public class AdditionalFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FeeID")
    private Long feeId;

    @ManyToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @Column(name = "Amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "ExtendedAmount", precision = 10, scale = 2)
    private BigDecimal extendedAmount;

    @Column(name = "Code", length = 50)
    private String code;

    public Long getFeeId() {
        return feeId;
    }

    public void setFeeId(Long feeId) {
        this.feeId = feeId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getExtendedAmount() {
        return extendedAmount;
    }

    public void setExtendedAmount(BigDecimal extendedAmount) {
        this.extendedAmount = extendedAmount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
