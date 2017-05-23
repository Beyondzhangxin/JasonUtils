package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.USER_ROLES")
public class UserRoles {
    @Id
    @Column(name = "USERNAME")
    private String username;

    @Id
    @Column(name = "ROLE_ID")
    private String roleId;

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}