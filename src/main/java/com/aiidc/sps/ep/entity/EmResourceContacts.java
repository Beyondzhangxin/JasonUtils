package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_RESOURCE_CONTACTS")
public class EmResourceContacts {
    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "CONTACTS_ID")
    private String contactsId;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "DEPARTMENT_DUTY")
    private String departmentDuty;

    @Column(name = "HEADER")
    private String header;

    @Column(name = "POST")
    private String post;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "WECHAT")
    private String wechat;

    @Column(name = "QQ")
    private String qq;

    /**
     * @return COMPANY_ID
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * @return CONTACTS_ID
     */
    public String getContactsId() {
        return contactsId;
    }

    /**
     * @param contactsId
     */
    public void setContactsId(String contactsId) {
        this.contactsId = contactsId;
    }

    /**
     * @return DEPARTMENT
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return DEPARTMENT_DUTY
     */
    public String getDepartmentDuty() {
        return departmentDuty;
    }

    /**
     * @param departmentDuty
     */
    public void setDepartmentDuty(String departmentDuty) {
        this.departmentDuty = departmentDuty;
    }

    /**
     * @return HEADER
     */
    public String getHeader() {
        return header;
    }

    /**
     * @param header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * @return POST
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return TELEPHONE
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return MOBILE_PHONE
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return FAX
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return WECHAT
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * @param wechat
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * @return QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }
}