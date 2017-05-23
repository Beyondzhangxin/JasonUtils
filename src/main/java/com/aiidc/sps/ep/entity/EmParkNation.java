package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_NATION")
public class EmParkNation {
    @Id
    @Column(name = "NATION_ID")
    private String nationId;

    @Column(name = "NATION_NAME")
    private String nationName;

    /**
     * @return NATION_ID
     */
    public String getNationId() {
        return nationId;
    }

    /**
     * @param nationId
     */
    public void setNationId(String nationId) {
        this.nationId = nationId;
    }

    /**
     * @return NATION_NAME
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * @param nationName
     */
    public void setNationName(String nationName) {
        this.nationName = nationName;
    }
}