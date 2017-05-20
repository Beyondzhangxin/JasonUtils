package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_TEAM_LEVEL")
public class EmResourceTeamLevel {
    @Column(name = "LEVEL_ID")
    private String levelId;

    @Column(name = "LEVEL_NAME")
    private String levelName;

    /**
     * @return LEVEL_ID
     */
    public String getLevelId() {
        return levelId;
    }

    /**
     * @param levelId
     */
    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    /**
     * @return LEVEL_NAME
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * @param levelName
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
}