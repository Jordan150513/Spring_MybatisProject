package com.fang.model;

import java.util.Date;

public class RefreshConsumption {
    private Integer id;

    private Integer refreshplanid;

    private Integer caseid;

    private Integer companyid;

    private String refreshtype;

    private Date refreshtime;

    private Integer soufunid;

    private Date createtime;

    private Boolean isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefreshplanid() {
        return refreshplanid;
    }

    public void setRefreshplanid(Integer refreshplanid) {
        this.refreshplanid = refreshplanid;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getRefreshtype() {
        return refreshtype;
    }

    public void setRefreshtype(String refreshtype) {
        this.refreshtype = refreshtype == null ? null : refreshtype.trim();
    }

    public Date getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Date refreshtime) {
        this.refreshtime = refreshtime;
    }

    public Integer getSoufunid() {
        return soufunid;
    }

    public void setSoufunid(Integer soufunid) {
        this.soufunid = soufunid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}