package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_HAZARD_CHEM_RISK_CATEGORY")
public class EmHazardChemRiskCategory {
    @Column(name = "RISK_CATEGORY_ID")
    private String riskCategoryId;

    @Column(name = "RISK_CATEGORY_NAME")
    private String riskCategoryName;

    /**
     * @return RISK_CATEGORY_ID
     */
    public String getRiskCategoryId() {
        return riskCategoryId;
    }

    /**
     * @param riskCategoryId
     */
    public void setRiskCategoryId(String riskCategoryId) {
        this.riskCategoryId = riskCategoryId;
    }

    /**
     * @return RISK_CATEGORY_NAME
     */
    public String getRiskCategoryName() {
        return riskCategoryName;
    }

    /**
     * @param riskCategoryName
     */
    public void setRiskCategoryName(String riskCategoryName) {
        this.riskCategoryName = riskCategoryName;
    }
}