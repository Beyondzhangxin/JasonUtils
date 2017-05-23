package com.aiidc.sps.ep.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESPONSE_PLAN")
public class EmResponsePlan {
    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "PLAN_ID")
    private String planId;

    @Column(name = "PLAN_NAME")
    private String planName;

    @Column(name = "PLAN_TYPE")
    private String planType;

    @Column(name = "USAGE_SCOPE")
    private String usageScope;

    @Column(name = "REPORTING_TIME")
    private Date reportingTime;

    @Column(name = "PLAN_CONTENT")
    private String planContent;

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
     * @return PLAN_ID
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * @return PLAN_NAME
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * @param planName
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * @return PLAN_TYPE
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * @param planType
     */
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * @return USAGE_SCOPE
     */
    public String getUsageScope() {
        return usageScope;
    }

    /**
     * @param usageScope
     */
    public void setUsageScope(String usageScope) {
        this.usageScope = usageScope;
    }

    /**
     * @return REPORTING_TIME
     */
    public Date getReportingTime() {
        return reportingTime;
    }

    /**
     * @param reportingTime
     */
    public void setReportingTime(Date reportingTime) {
        this.reportingTime = reportingTime;
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
}