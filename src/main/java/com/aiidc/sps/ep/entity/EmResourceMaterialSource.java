package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_MATERIAL_SOURCE")
public class EmResourceMaterialSource {
    @Column(name = "SOURCE_ID")
    private String sourceId;

    @Column(name = "SOURCE_NAME")
    private String sourceName;

    /**
     * @return SOURCE_ID
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * @param sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * @return SOURCE_NAME
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * @param sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
}