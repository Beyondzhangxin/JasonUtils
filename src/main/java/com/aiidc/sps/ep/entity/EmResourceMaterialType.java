package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_MATERIAL_TYPE")
public class EmResourceMaterialType {
    @Column(name = "TYPE_ID")
    private String typeId;

    @Column(name = "TYPE_NAME")
    private String typeName;

    /**
     * @return TYPE_ID
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * @return TYPE_NAME
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}