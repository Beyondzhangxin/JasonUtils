package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_MATERIAL_CLASSIFY")
public class EmResourceMaterialClassify {
    @Column(name = "CLASSIFY_ID")
    private String classifyId;

    @Column(name = "CLASSIFY_NAME")
    private String classifyName;

    /**
     * @return CLASSIFY_ID
     */
    public String getClassifyId() {
        return classifyId;
    }

    /**
     * @param classifyId
     */
    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    /**
     * @return CLASSIFY_NAME
     */
    public String getClassifyName() {
        return classifyName;
    }

    /**
     * @param classifyName
     */
    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }
}