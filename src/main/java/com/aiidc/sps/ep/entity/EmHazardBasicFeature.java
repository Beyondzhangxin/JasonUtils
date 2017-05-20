package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_BASIC_FEATURE")
public class EmHazardBasicFeature {
    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "HAZARD_ID")
    private String hazardId;

    @Column(name = "HAZARD_NAME")
    private String hazardName;

    @Column(name = "HAZARD_ADDR")
    private String hazardAddr;

    @Column(name = "USE_START_TIME")
    private Date useStartTime;

    @Column(name = "PLAN_CONTENT")
    private String planContent;

    @Column(name = "R_VALUE")
    private BigDecimal rValue;

    @Column(name = "MAIN_EQUIPMENT")
    private String mainEquipment;

    @Column(name = "FACILITY_CAPACITY")
    private String facilityCapacity;

    @Column(name = "PROTECTION_MIN_DIST")
    private Integer protectionMinDist;

    @Column(name = "ESTIMATION_POPULATION")
    private Integer estimationPopulation;

    @Column(name = "CHEMICAL_ACCIDENT")
    private String chemicalAccident;

    /**
     * @return COMPANY_ID
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

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
     * @return HAZARD_NAME
     */
    public String getHazardName() {
        return hazardName;
    }

    /**
     * @param hazardName
     */
    public void setHazardName(String hazardName) {
        this.hazardName = hazardName;
    }

    /**
     * @return HAZARD_ADDR
     */
    public String getHazardAddr() {
        return hazardAddr;
    }

    /**
     * @param hazardAddr
     */
    public void setHazardAddr(String hazardAddr) {
        this.hazardAddr = hazardAddr;
    }

    /**
     * @return USE_START_TIME
     */
    public Date getUseStartTime() {
        return useStartTime;
    }

    /**
     * @param useStartTime
     */
    public void setUseStartTime(Date useStartTime) {
        this.useStartTime = useStartTime;
    }

    /**
     * @return PLAN_CONTENT
     */
    public String getPlanContent() {
        return planContent;
    }

    /**
     * @param planContent
     */
    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    /**
     * @return R_VALUE
     */
    public BigDecimal getrValue() {
        return rValue;
    }

    /**
     * @param rValue
     */
    public void setrValue(BigDecimal rValue) {
        this.rValue = rValue;
    }

    /**
     * @return MAIN_EQUIPMENT
     */
    public String getMainEquipment() {
        return mainEquipment;
    }

    /**
     * @param mainEquipment
     */
    public void setMainEquipment(String mainEquipment) {
        this.mainEquipment = mainEquipment;
    }

    /**
     * @return FACILITY_CAPACITY
     */
    public String getFacilityCapacity() {
        return facilityCapacity;
    }

    /**
     * @param facilityCapacity
     */
    public void setFacilityCapacity(String facilityCapacity) {
        this.facilityCapacity = facilityCapacity;
    }

    /**
     * @return PROTECTION_MIN_DIST
     */
    public Integer getProtectionMinDist() {
        return protectionMinDist;
    }

    /**
     * @param protectionMinDist
     */
    public void setProtectionMinDist(Integer protectionMinDist) {
        this.protectionMinDist = protectionMinDist;
    }

    /**
     * @return ESTIMATION_POPULATION
     */
    public Integer getEstimationPopulation() {
        return estimationPopulation;
    }

    /**
     * @param estimationPopulation
     */
    public void setEstimationPopulation(Integer estimationPopulation) {
        this.estimationPopulation = estimationPopulation;
    }

    /**
     * @return CHEMICAL_ACCIDENT
     */
    public String getChemicalAccident() {
        return chemicalAccident;
    }

    /**
     * @param chemicalAccident
     */
    public void setChemicalAccident(String chemicalAccident) {
        this.chemicalAccident = chemicalAccident;
    }
}