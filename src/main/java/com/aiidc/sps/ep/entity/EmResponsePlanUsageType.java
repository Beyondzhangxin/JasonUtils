package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESPONSE_PLAN_USAGE_TYPE")
public class EmResponsePlanUsageType {
    @Column(name = "USAGE_ID")
    private String usageId;

    @Column(name = "USAGE_NAME")
    private String usageName;

    /**
     * @return USAGE_ID
     */
    public String getUsageId() {
        return usageId;
    }

    /**
     * @param usageId
     */
    public void setUsageId(String usageId) {
        this.usageId = usageId;
    }

    /**
     * @return USAGE_NAME
     */
    public String getUsageName() {
        return usageName;
    }

    /**
     * @param usageName
     */
    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }
}