package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_HAZARD_CHEMICAL")
public class EmParkHazardChemical {
    @Column(name = "CHINESE_NAME")
    private String chineseName;

    @Column(name = "ENGNISH_NAME")
    private String engnishName;

    @Column(name = "CAS_CODE")
    private String casCode;

    @Column(name = "CONTENT")
    private String content;

    /**
     * @return CHINESE_NAME
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * @param chineseName
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    /**
     * @return ENGNISH_NAME
     */
    public String getEngnishName() {
        return engnishName;
    }

    /**
     * @param engnishName
     */
    public void setEngnishName(String engnishName) {
        this.engnishName = engnishName;
    }

    /**
     * @return CAS_CODE
     */
    public String getCasCode() {
        return casCode;
    }

    /**
     * @param casCode
     */
    public void setCasCode(String casCode) {
        this.casCode = casCode;
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