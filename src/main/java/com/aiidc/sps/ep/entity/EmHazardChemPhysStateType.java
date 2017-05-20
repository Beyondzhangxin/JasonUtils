package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_CHEM_PHYS_STATE_TYPE")
public class EmHazardChemPhysStateType {
    @Column(name = "PHYSICAL_STATE_ID")
    private String physicalStateId;

    @Column(name = "PHYSICAL_STATE_NAME")
    private String physicalStateName;

    /**
     * @return PHYSICAL_STATE_ID
     */
    public String getPhysicalStateId() {
        return physicalStateId;
    }

    /**
     * @param physicalStateId
     */
    public void setPhysicalStateId(String physicalStateId) {
        this.physicalStateId = physicalStateId;
    }

    /**
     * @return PHYSICAL_STATE_NAME
     */
    public String getPhysicalStateName() {
        return physicalStateName;
    }

    /**
     * @param physicalStateName
     */
    public void setPhysicalStateName(String physicalStateName) {
        this.physicalStateName = physicalStateName;
    }
}