package com.backend.fullstack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PaymentMethods")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentMethodID")
    private Long paymentMethodId;

    @ManyToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;

    @Column(name = "PONumber", length = 100)
    private String poNumber;

    @Column(name = "Method", length = 50)
    private String method;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "VatAccountNumber", length = 100)
    private String vatAccountNumber;

    public Long getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Long paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVatAccountNumber() {
        return vatAccountNumber;
    }

    public void setVatAccountNumber(String vatAccountNumber) {
        this.vatAccountNumber = vatAccountNumber;
    }
}
