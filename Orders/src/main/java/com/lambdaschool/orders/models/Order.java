package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    //dim order number as the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;

    //dim order amount
    private double ordamount;

    //dim advance amount
    private double advanceamount;

    //dim order description
    private String orderdescription;

    //constructors
    public Order() {
    }

    public Order(
        double ordamount,
        double advanceamount,
        String orderdescription) {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orderdescription = orderdescription;
    }

    /*=== getters and setters ===*/

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }
}
