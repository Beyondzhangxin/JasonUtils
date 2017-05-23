package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_RESERVE_PLAN_TYPE")
public class EmParkReservePlanType {
    @Column(name = "RESERVE_PLAN_ID")
    private Short reservePlanId;

    @Column(name = "RESERVE_PLAN_NAME")
    private String reservePlanName;

    /**
     * @return RESERVE_PLAN_ID
     */
    public Short getReservePlanId() {
        return reservePlanId;
    }

    /**
     * @param reservePlanId
     */
    public void setReservePlanId(Short reservePlanId) {
        this.reservePlanId = reservePlanId;
    }

    /**
     * @return RESERVE_PLAN_NAME
     */
    public String getReservePlanName() {
        return reservePlanName;
    }

    /**
     * @param reservePlanName
     */
    public void setReservePlanName(String reservePlanName) {
        this.reservePlanName = reservePlanName;
    }
}