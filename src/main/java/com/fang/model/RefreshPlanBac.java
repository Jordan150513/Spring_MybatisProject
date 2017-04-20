package com.fang.model;

import java.util.Date;

public class RefreshPlanBac {
    private Integer id;

    private Integer caseid;

    private Date refreshtime;

    private Date createtime;

    private String state;

    private Date importcreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public Date getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Date refreshtime) {
        this.refreshtime = refreshtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getImportcreatetime() {
        return importcreatetime;
    }

    public void setImportcreatetime(Date importcreatetime) {
        this.importcreatetime = importcreatetime;
    }
}