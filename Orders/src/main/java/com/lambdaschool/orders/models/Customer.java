package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    //dim primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long custcode;

    //dim name
    private String custname;

    //dim city
    private String custcity;

    //dim working area
    private String custworkingarea;

    //dim country
    private String custcountry;

    //dim grade
    private String grade;

    //dim opening amount
    private double  openingamt;

    //dim receive amount
    private double receiveamt;

    //dim payment amount
    private double paymentamt;

    //dim outstanding amount
    private double outstandingamt;

    //dim phone
    private double phone;

    //Constructors
    public Customer() {
    }

    public Customer(
        String custname,
        String custcity,
        String custworkingarea,
        String custcountry,
        String grade,
        double openingamt,
        double receiveamt,
        double paymentamt,
        double outstandingamt,
        double phone) {
        this.custname = custname;
        this.custcity = custcity;
        this.custworkingarea = custworkingarea;
        this.custcountry = custcountry;
        this.grade = grade;
        this.openingamt = openingamt;
        this.receiveamt = receiveamt;
        this.paymentamt = paymentamt;
        this.outstandingamt = outstandingamt;
        this.phone = phone;
    }

    /*=== getters and setters ===*/

    //customer code
    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long custcode) {
        this.custcode = custcode;
    }

    //customer name
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    //customer city
    public String getCustcity() {
        return custcity;
    }

    public void setCustcity(String custcity) {
        this.custcity = custcity;
    }

    //customer working area
    public String getCustworkingarea() {
        return custworkingarea;
    }

    public void setCustworkingarea(String custworkingarea) {
        this.custworkingarea = custworkingarea;
    }

    //customer country
    public String getCustcountry() {
        return custcountry;
    }

    public void setCustcountry(String custcountry) {
        this.custcountry = custcountry;
    }

    //grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //opening amount
    public double getOpeningamt() {
        return openingamt;
    }

    public void setOpeningamt(double openingamt) {
        this.openingamt = openingamt;
    }

    //recieving amount
    public double getReceiveamt() {
        return receiveamt;
    }

    public void setReceiveamt(double receiveamt) {
        this.receiveamt = receiveamt;
    }

    //payment amount
    public double getPaymentamt() {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt) {
        this.paymentamt = paymentamt;
    }

    //outstanding amount
    public double getOutstandingamt() {
        return outstandingamt;
    }

    public void setOutstandingamt(double outstandingamt) {
        this.outstandingamt = outstandingamt;
    }

    //phone
    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }
}
