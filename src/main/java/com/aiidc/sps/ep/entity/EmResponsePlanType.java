package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESPONSE_PLAN_TYPE")
public class EmResponsePlanType {
    @Column(name = "PLAN_TYPE_ID")
    private String planTypeId;

    @Column(name = "PLAN_TYPE_NAME")
    private String planTypeName;

    /**
     * @return PLAN_TYPE_ID
     */
    public String getPlanTypeId() {
        return planTypeId;
    }

    /**
     * @param planTypeId
     */
    public void setPlanTypeId(String planTypeId) {
        this.planTypeId = planTypeId;
    }

    /**
     * @return PLAN_TYPE_NAME
     */
    public String getPlanTypeName() {
        return planTypeName;
    }

    /**
     * @param planTypeName
     */
    public void setPlanTypeName(String planTypeName) {
        this.planTypeName = planTypeName;
    }
}