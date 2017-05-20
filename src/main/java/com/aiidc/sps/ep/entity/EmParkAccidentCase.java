package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_ACCIDENT_CASE")
public class EmParkAccidentCase {
    @Column(name = "ACCIDENT_NAME")
    private String accidentName;

    @Column(name = "ACCIDENT_TIME")
    private String accidentTime;

    @Column(name = "ACCIDENT_TYPE")
    private String accidentType;

    @Column(name = "CONTENT")
    private String content;

    /**
     * @return ACCIDENT_NAME
     */
    public String getAccidentName() {
        return accidentName;
    }

    /**
     * @param accidentName
     */
    public void setAccidentName(String accidentName) {
        this.accidentName = accidentName;
    }

    /**
     * @return ACCIDENT_TIME
     */
    public String getAccidentTime() {
        return accidentTime;
    }

    /**
     * @param accidentTime
     */
    public void setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
    }

    /**
     * @return ACCIDENT_TYPE
     */
    public String getAccidentType() {
        return accidentType;
    }

    /**
     * @param accidentType
     */
    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
    }

    /**
     * @return CONTENT
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}