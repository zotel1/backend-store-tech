package com.backend.fullstack.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @Column(name = "OrderID", nullable = false)
    private String orderId;

    @Column(name = "CurrencyCode", length = 10)
    private String currencyCode;

    @Column(name = "MerchandiseTotal", precision = 10, scale = 2)
    private BigDecimal merchandiseTotal;

    @Column(name = "AdditionalFeesTotal", precision = 10, scale = 2)
    private BigDecimal additionalFeesTotal;

    @Column(name = "OrderTotal", precision = 10, scale = 2)
    private BigDecimal orderTotal;

    @Column(name = "OrderType", length = 50)
    private String orderType;

    @Column(name = "CartGUID", length = 255)
    private String cartGUID;

    @Column(name = "TaxAmount", precision = 10, scale = 2)
    private BigDecimal taxAmount;

    @Column(name = "TaxCertificateId", length = 255)
    private String taxCertificateId;

    @Column(name = "IECCode", length = 255)
    private String iecCode;

    @Column(name = "LanguageCode", length = 10)
    private String languageCode;

    @Column(name = "SubmitOrder", nullable = false)
    private boolean submitOrder;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderLine> orderLines;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Address> addresses;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getMerchandiseTotal() {
        return merchandiseTotal;
    }

    public void setMerchandiseTotal(BigDecimal merchandiseTotal) {
        this.merchandiseTotal = merchandiseTotal;
    }

    public BigDecimal getAdditionalFeesTotal() {
        return additionalFeesTotal;
    }

    public void setAdditionalFeesTotal(BigDecimal additionalFeesTotal) {
        this.additionalFeesTotal = additionalFeesTotal;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCartGUID() {
        return cartGUID;
    }

    public void setCartGUID(String cartGUID) {
        this.cartGUID = cartGUID;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxCertificateId() {
        return taxCertificateId;
    }

    public void setTaxCertificateId(String taxCertificateId) {
        this.taxCertificateId = taxCertificateId;
    }

    public String getIecCode() {
        return iecCode;
    }

    public void setIecCode(String iecCode) {
        this.iecCode = iecCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public boolean isSubmitOrder() {
        return submitOrder;
    }

    public void setSubmitOrder(boolean submitOrder) {
        this.submitOrder = submitOrder;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
