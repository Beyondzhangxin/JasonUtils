package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.NAVIGATION")
public class Navigation {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "ICON_CLS")
    private String iconCls;

    @Column(name = "FUNC_ID")
    private String funcId;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "PID")
    private Integer pid;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return TEXT
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return ICON_CLS
     */
    public String getIconCls() {
        return iconCls;
    }

    /**
     * @param iconCls
     */
    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
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
     * @return ACTION
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return PID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}