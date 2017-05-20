package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_SAFETY_EQUIPMENTS")
public class EmHazardSafetyEquipments {
    @Column(name = "EQUIPMENT_ID")
    private String equipmentId;

    @Column(name = "COMB_GAS_ALARM_DEV_NUM")
    private Integer combGasAlarmDevNum;

    @Column(name = "TOXIC_GAS_ALARM_DEV_NUM")
    private Integer toxicGasAlarmDevNum;

    @Column(name = "SHUTOFF_DEV_NUM")
    private Integer shutoffDevNum;

    @Column(name = "CAMERA_NUM")
    private Integer cameraNum;

    @Column(name = "HOWER_CONVERTER_NUM")
    private Integer howerConverterNum;

    @Column(name = "HYDRANT_NUM")
    private Integer hydrantNum;

    @Column(name = "FOAM_EMBOLUS_NUM")
    private Integer foamEmbolusNum;

    @Column(name = "COOLING_SPRAYS")
    private Integer coolingSprays;

    @Column(name = "FLAME_ARRESTER_NUM")
    private Integer flameArresterNum;

    @Column(name = "RUNNING_RECORD")
    private Integer runningRecord;

    @Column(name = "DCS_ESD_SYS")
    private Integer dcsEsdSys;

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

    /**
     * @return COMB_GAS_ALARM_DEV_NUM
     */
    public Integer getCombGasAlarmDevNum() {
        return combGasAlarmDevNum;
    }

    /**
     * @param combGasAlarmDevNum
     */
    public void setCombGasAlarmDevNum(Integer combGasAlarmDevNum) {
        this.combGasAlarmDevNum = combGasAlarmDevNum;
    }

    /**
     * @return TOXIC_GAS_ALARM_DEV_NUM
     */
    public Integer getToxicGasAlarmDevNum() {
        return toxicGasAlarmDevNum;
    }

    /**
     * @param toxicGasAlarmDevNum
     */
    public void setToxicGasAlarmDevNum(Integer toxicGasAlarmDevNum) {
        this.toxicGasAlarmDevNum = toxicGasAlarmDevNum;
    }

    /**
     * @return SHUTOFF_DEV_NUM
     */
    public Integer getShutoffDevNum() {
        return shutoffDevNum;
    }

    /**
     * @param shutoffDevNum
     */
    public void setShutoffDevNum(Integer shutoffDevNum) {
        this.shutoffDevNum = shutoffDevNum;
    }

    /**
     * @return CAMERA_NUM
     */
    public Integer getCameraNum() {
        return cameraNum;
    }

    /**
     * @param cameraNum
     */
    public void setCameraNum(Integer cameraNum) {
        this.cameraNum = cameraNum;
    }

    /**
     * @return HOWER_CONVERTER_NUM
     */
    public Integer getHowerConverterNum() {
        return howerConverterNum;
    }

    /**
     * @param howerConverterNum
     */
    public void setHowerConverterNum(Integer howerConverterNum) {
        this.howerConverterNum = howerConverterNum;
    }

    /**
     * @return HYDRANT_NUM
     */
    public Integer getHydrantNum() {
        return hydrantNum;
    }

    /**
     * @param hydrantNum
     */
    public void setHydrantNum(Integer hydrantNum) {
        this.hydrantNum = hydrantNum;
    }

    /**
     * @return FOAM_EMBOLUS_NUM
     */
    public Integer getFoamEmbolusNum() {
        return foamEmbolusNum;
    }

    /**
     * @param foamEmbolusNum
     */
    public void setFoamEmbolusNum(Integer foamEmbolusNum) {
        this.foamEmbolusNum = foamEmbolusNum;
    }

    /**
     * @return COOLING_SPRAYS
     */
    public Integer getCoolingSprays() {
        return coolingSprays;
    }

    /**
     * @param coolingSprays
     */
    public void setCoolingSprays(Integer coolingSprays) {
        this.coolingSprays = coolingSprays;
    }

    /**
     * @return FLAME_ARRESTER_NUM
     */
    public Integer getFlameArresterNum() {
        return flameArresterNum;
    }

    /**
     * @param flameArresterNum
     */
    public void setFlameArresterNum(Integer flameArresterNum) {
        this.flameArresterNum = flameArresterNum;
    }

    /**
     * @return RUNNING_RECORD
     */
    public Integer getRunningRecord() {
        return runningRecord;
    }

    /**
     * @param runningRecord
     */
    public void setRunningRecord(Integer runningRecord) {
        this.runningRecord = runningRecord;
    }

    /**
     * @return DCS_ESD_SYS
     */
    public Integer getDcsEsdSys() {
        return dcsEsdSys;
    }

    /**
     * @param dcsEsdSys
     */
    public void setDcsEsdSys(Integer dcsEsdSys) {
        this.dcsEsdSys = dcsEsdSys;
    }
}