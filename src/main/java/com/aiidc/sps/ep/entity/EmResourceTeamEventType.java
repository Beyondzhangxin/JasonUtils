package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_TEAM_EVENT_TYPE")
public class EmResourceTeamEventType {
    @Column(name = "EVENT_TYPE_ID")
    private Short eventTypeId;

    @Column(name = "EVENT_TYPE_NAME")
    private String eventTypeName;

    /**
     * @return EVENT_TYPE_ID
     */
    public Short getEventTypeId() {
        return eventTypeId;
    }

    /**
     * @param eventTypeId
     */
    public void setEventTypeId(Short eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * @return EVENT_TYPE_NAME
     */
    public String getEventTypeName() {
        return eventTypeName;
    }

    /**
     * @param eventTypeName
     */
    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}