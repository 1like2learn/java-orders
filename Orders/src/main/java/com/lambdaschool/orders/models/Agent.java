package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agent {

    //dim a long primary id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long agentcode;

    //dim a name for the agent
    private String agentname;

    //dim an area they operate in
    private String workingarea;

    //dim a commission they make on sales
    private double commission;

    //dim a phone number
    private String phone;

    //dim a country they live in
    private String country;

    public Agent() {
    }

    public Agent(
        String agentname,
        String workingarea,
        double commission,
        String phone,
        String country) {
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.commission = commission;
        this.phone = phone;
        this.country = country;
    }

    /*=== getters and setters ===*/

    //agent code
    public long getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(long agentcode) {
        this.agentcode = agentcode;
    }

    //agent name
    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    //working area
    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    //commission
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    //phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
