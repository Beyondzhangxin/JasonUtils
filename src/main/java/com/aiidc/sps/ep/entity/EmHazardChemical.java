package com.aiidc.sps.ep.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_CHEMICAL")
public class EmHazardChemical {
    @Column(name = "CHEMICAL_ID")
    private String chemicalId;

    @Column(name = "CHEMICAL_NAME")
    private String chemicalName;

    @Column(name = "RISK_CATEGORY")
    private String riskCategory;

    @Column(name = "UN_CODE")
    private String unCode;

    @Column(name = "USAGE")
    private String usage;

    @Column(name = "TECHNIQUE")
    private String technique;

    @Column(name = "PHYSICAL_STATE")
    private String physicalState;

    @Column(name = "WORKING_TEMPERATURE")
    private BigDecimal workingTemperature;

    @Column(name = "WORKING_PRESSURE")
    private BigDecimal workingPressure;

    @Column(name = "STOCK")
    private BigDecimal stock;

    @Column(name = "UNIT_CHEMICAL_STOCK")
    private BigDecimal unitChemicalStock;

    @Column(name = "CRITICAL_QUANTITY")
    private BigDecimal criticalQuantity;

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

    /**
     * @return CHEMICAL_NAME
     */
    public String getChemicalName() {
        return chemicalName;
    }

    /**
     * @param chemicalName
     */
    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    /**
     * @return RISK_CATEGORY
     */
    public String getRiskCategory() {
        return riskCategory;
    }

    /**
     * @param riskCategory
     */
    public void setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
    }

    /**
     * @return UN_CODE
     */
    public String getUnCode() {
        return unCode;
    }

    /**
     * @param unCode
     */
    public void setUnCode(String unCode) {
        this.unCode = unCode;
    }

    /**
     * @return USAGE
     */
    public String getUsage() {
        return usage;
    }

    /**
     * @param usage
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * @return TECHNIQUE
     */
    public String getTechnique() {
        return technique;
    }

    /**
     * @param technique
     */
    public void setTechnique(String technique) {
        this.technique = technique;
    }

    /**
     * @return PHYSICAL_STATE
     */
    public String getPhysicalState() {
        return physicalState;
    }

    /**
     * @param physicalState
     */
    public void setPhysicalState(String physicalState) {
        this.physicalState = physicalState;
    }

    /**
     * @return WORKING_TEMPERATURE
     */
    public BigDecimal getWorkingTemperature() {
        return workingTemperature;
    }

    /**
     * @param workingTemperature
     */
    public void setWorkingTemperature(BigDecimal workingTemperature) {
        this.workingTemperature = workingTemperature;
    }

    /**
     * @return WORKING_PRESSURE
     */
    public BigDecimal getWorkingPressure() {
        return workingPressure;
    }

    /**
     * @param workingPressure
     */
    public void setWorkingPressure(BigDecimal workingPressure) {
        this.workingPressure = workingPressure;
    }

    /**
     * @return STOCK
     */
    public BigDecimal getStock() {
        return stock;
    }

    /**
     * @param stock
     */
    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    /**
     * @return UNIT_CHEMICAL_STOCK
     */
    public BigDecimal getUnitChemicalStock() {
        return unitChemicalStock;
    }

    /**
     * @param unitChemicalStock
     */
    public void setUnitChemicalStock(BigDecimal unitChemicalStock) {
        this.unitChemicalStock = unitChemicalStock;
    }

    /**
     * @return CRITICAL_QUANTITY
     */
    public BigDecimal getCriticalQuantity() {
        return criticalQuantity;
    }

    /**
     * @param criticalQuantity
     */
    public void setCriticalQuantity(BigDecimal criticalQuantity) {
        this.criticalQuantity = criticalQuantity;
    }
}