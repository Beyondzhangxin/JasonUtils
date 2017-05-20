package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.AUTHZ_FUNCTION")
public class AuthzFunction {
    @Id
    @Column(name = "ROLEID")
    private String roleid;

    @Id
    @Column(name = "FUNC_ID")
    private String funcId;

    @Column(name = "AUTHZ")
    private Integer authz;

    /**
     * @return ROLEID
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * @return FUNC_ID
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * @param funcId
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * @return AUTHZ
     */
    public Integer getAuthz() {
        return authz;
    }

    /**
     * @param authz
     */
    public void setAuthz(Integer authz) {
        this.authz = authz;
    }
}