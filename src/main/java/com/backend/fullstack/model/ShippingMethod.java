package com.backend.fullstack.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ShippingMethods")
public class ShippingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShippingMethodID")
    private Long shippingMethodId;

    @ManyToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @Column(name = "PrimaryMethod", length = 100)
    private String primaryMethod;

    @Column(name = "SecondaryMethod", length = 100)
    private String secondaryMethod;

    @Column(name = "PrimaryShippingRate", precision = 10, scale = 2)
    private BigDecimal primaryShippingRate;

    @Column(name = "SecondaryShippingRate", precision = 10, scale = 2)
    private BigDecimal secondaryShippingRate;

    @Column(name = "PrimaryFreightCollectAccount", length = 255)
    private String primaryFreightCollectAccount;

    @Column(name = "SecondaryFreightCollectAccount", length = 255)
    private String secondaryFreightCollectAccount;

    public Long getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(Long shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getPrimaryMethod() {
        return primaryMethod;
    }

    public void setPrimaryMethod(String primaryMethod) {
        this.primaryMethod = primaryMethod;
    }

    public String getSecondaryMethod() {
        return secondaryMethod;
    }

    public void setSecondaryMethod(String secondaryMethod) {
        this.secondaryMethod = secondaryMethod;
    }

    public BigDecimal getPrimaryShippingRate() {
        return primaryShippingRate;
    }

    public void setPrimaryShippingRate(BigDecimal primaryShippingRate) {
        this.primaryShippingRate = primaryShippingRate;
    }

    public BigDecimal getSecondaryShippingRate() {
        return secondaryShippingRate;
    }

    public void setSecondaryShippingRate(BigDecimal secondaryShippingRate) {
        this.secondaryShippingRate = secondaryShippingRate;
    }

    public String getPrimaryFreightCollectAccount() {
        return primaryFreightCollectAccount;
    }

    public void setPrimaryFreightCollectAccount(String primaryFreightCollectAccount) {
        this.primaryFreightCollectAccount = primaryFreightCollectAccount;
    }

    public String getSecondaryFreightCollectAccount() {
        return secondaryFreightCollectAccount;
    }

    public void setSecondaryFreightCollectAccount(String secondaryFreightCollectAccount) {
        this.secondaryFreightCollectAccount = secondaryFreightCollectAccount;
    }
}
