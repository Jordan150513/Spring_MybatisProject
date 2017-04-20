package com.fang.model;

import java.util.Date;

public class CaseRefresh {
    private Integer id;

    private Integer caseid;

    private Integer companyid;

    private Integer refreshcount;

    private Date modifytime;

    private Date createtime;

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

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getRefreshcount() {
        return refreshcount;
    }

    public void setRefreshcount(Integer refreshcount) {
        this.refreshcount = refreshcount;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}