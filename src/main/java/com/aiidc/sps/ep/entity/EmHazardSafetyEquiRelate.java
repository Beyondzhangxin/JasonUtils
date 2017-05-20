package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_SAFETY_EQUI_RELATE")
public class EmHazardSafetyEquiRelate {
    @Column(name = "HAZARD_ID")
    private String hazardId;

    @Column(name = "EQUIPMENT_ID")
    private String equipmentId;

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
     * @return EQUIPMENT_ID
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * @param equipmentId
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }
}