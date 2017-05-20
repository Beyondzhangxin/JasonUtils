package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_TEAM_TYPE")
public class EmResourceTeamType {
    @Column(name = "TEAM_TYPE_ID")
    private String teamTypeId;

    @Column(name = "TEAM_TYPE_NAME")
    private String teamTypeName;

    /**
     * @return TEAM_TYPE_ID
     */
    public String getTeamTypeId() {
        return teamTypeId;
    }

    /**
     * @param teamTypeId
     */
    public void setTeamTypeId(String teamTypeId) {
        this.teamTypeId = teamTypeId;
    }

    /**
     * @return TEAM_TYPE_NAME
     */
    public String getTeamTypeName() {
        return teamTypeName;
    }

    /**
     * @param teamTypeName
     */
    public void setTeamTypeName(String teamTypeName) {
        this.teamTypeName = teamTypeName;
    }
}