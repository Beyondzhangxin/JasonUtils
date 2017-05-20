package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_CHEM_TECH_TYPE")
public class EmHazardChemTechType {
    @Column(name = "TECHNIQUE_ID")
    private String techniqueId;

    @Column(name = "TECHNIQUE_NAME")
    private String techniqueName;

    /**
     * @return TECHNIQUE_ID
     */
    public String getTechniqueId() {
        return techniqueId;
    }

    /**
     * @param techniqueId
     */
    public void setTechniqueId(String techniqueId) {
        this.techniqueId = techniqueId;
    }

    /**
     * @return TECHNIQUE_NAME
     */
    public String getTechniqueName() {
        return techniqueName;
    }

    /**
     * @param techniqueName
     */
    public void setTechniqueName(String techniqueName) {
        this.techniqueName = techniqueName;
    }
}