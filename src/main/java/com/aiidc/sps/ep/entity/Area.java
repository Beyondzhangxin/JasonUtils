package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.AREA")
public class Area {
    @Id
    @Column(name = "AREA_ID")
    private String areaId;

    @Column(name = "AREA_NM")
    private String areaNm;

    @Column(name = "PROV_ID")
    private String provId;

    @Column(name = "CITY_ID")
    private String cityId;

    @Column(name = "COUNTY_ID")
    private String countyId;

    @Column(name = "FULL_NM")
    private String fullNm;

    /**
     * @return AREA_ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * @return AREA_NM
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * @param areaNm
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    /**
     * @return PROV_ID
     */
    public String getProvId() {
        return provId;
    }

    /**
     * @param provId
     */
    public void setProvId(String provId) {
        this.provId = provId;
    }

    /**
     * @return CITY_ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * @param cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * @return COUNTY_ID
     */
    public String getCountyId() {
        return countyId;
    }

    /**
     * @param countyId
     */
    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    /**
     * @return FULL_NM
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * @param fullNm
     */
    public void setFullNm(String fullNm) {
        this.fullNm = fullNm;
    }
}