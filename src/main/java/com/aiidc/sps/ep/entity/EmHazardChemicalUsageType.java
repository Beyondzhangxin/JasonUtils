package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_CHEMICAL_USAGE_TYPE")
public class EmHazardChemicalUsageType {
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