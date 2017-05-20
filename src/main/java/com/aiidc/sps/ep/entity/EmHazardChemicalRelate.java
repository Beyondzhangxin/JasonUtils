package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_CHEMICAL_RELATE")
public class EmHazardChemicalRelate {
    @Column(name = "HAZARD_ID")
    private String hazardId;

    @Column(name = "CHEMICAL_ID")
    private String chemicalId;

    /**
     * @return HAZARD_ID
     */
    public String getHazardId() {
        return hazardId;
    }

    /**
     * @param hazardId
     */
    public void setHazardId(String hazardId) {
        this.hazardId = hazardId;
    }

    /**
     * @return CHEMICAL_ID
     */
    public String getChemicalId() {
        return chemicalId;
    }

    /**
     * @param chemicalId
     */
    public void setChemicalId(String chemicalId) {
        this.chemicalId = chemicalId;
    }
}