package com.aiidc.sps.ep.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_STANDARD_SPEC")
public class EmParkStandardSpec {
    @Column(name = "NAME")
    private String name;

    @Column(name = "PUBLISH_DEPARTMENT")
    private String publishDepartment;

    @Column(name = "PUBLIS_DATE")
    private Date publisDate;

    @Column(name = "IMPLEMENT_DATE")
    private Date implementDate;

    @Column(name = "CONTENT")
    private String content;

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PUBLISH_DEPARTMENT
     */
    public String getPublishDepartment() {
        return publishDepartment;
    }

    /**
     * @param publishDepartment
     */
    public void setPublishDepartment(String publishDepartment) {
        this.publishDepartment = publishDepartment;
    }

    /**
     * @return PUBLIS_DATE
     */
    public Date getPublisDate() {
        return publisDate;
    }

    /**
     * @param publisDate
     */
    public void setPublisDate(Date publisDate) {
        this.publisDate = publisDate;
    }

    /**
     * @return IMPLEMENT_DATE
     */
    public Date getImplementDate() {
        return implementDate;
    }

    /**
     * @param implementDate
     */
    public void setImplementDate(Date implementDate) {
        this.implementDate = implementDate;
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