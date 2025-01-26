package com.backend.fullstack.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "OrderLines")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderLineID")
    private Long orderLineId;

    @ManyToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @Column(name = "MouserPartNumber", length = 255)
    private String mouserPartNumber;

    @Column(name = "MfrPartNumber", length = 255)
    private String mfrPartNumber;

    @Column(name = "Description", length = 500)
    private String description;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "UnitPrice", precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "ExtendedPrice", precision = 10, scale = 2)
    private BigDecimal extendedPrice;

    @Column(name = "LifeCycle", length = 100)
    private String lifeCycle;

    @Column(name = "ManuFacturer", length = 255)
    private String manufacturer;

    public Long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getMouserPartNumber() {
        return mouserPartNumber;
    }

    public void setMouserPartNumber(String mouserPartNumber) {
        this.mouserPartNumber = mouserPartNumber;
    }

    public String getMfrPartNumber() {
        return mfrPartNumber;
    }

    public void setMfrPartNumber(String mfrPartNumber) {
        this.mfrPartNumber = mfrPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(BigDecimal extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
