package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    //dim primary key payment id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long paymentid;

    //dim type
    private String type;

    //constructors
    public Payment() {
    }

    public Payment(String type) {
        this.type = type;
    }

    /*=== getters and setters ===*/

    //payment id
    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    //type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
