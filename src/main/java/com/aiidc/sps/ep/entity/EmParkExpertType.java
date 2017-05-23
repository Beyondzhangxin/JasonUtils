package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_EXPERT_TYPE")
public class EmParkExpertType {
    @Column(name = "EXPERT_ID")
    private Short expertId;

    @Column(name = "EXPERT_TYPE_NAME")
    private String expertTypeName;

    /**
     * @return EXPERT_ID
     */
    public Short getExpertId() {
        return expertId;
    }

    /**
     * @param expertId
     */
    public void setExpertId(Short expertId) {
        this.expertId = expertId;
    }

    /**
     * @return EXPERT_TYPE_NAME
     */
    public String getExpertTypeName() {
        return expertTypeName;
    }

    /**
     * @param expertTypeName
     */
    public void setExpertTypeName(String expertTypeName) {
        this.expertTypeName = expertTypeName;
    }
}