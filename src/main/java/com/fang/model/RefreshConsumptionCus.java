package com.fang.model;

/**
 * Created by qiaodandan on 2017/4/25.
 */
public class RefreshConsumptionCus extends RefreshConsumption {

    // 后面一步 再加改功能 单继承的多层继承实现了
//    private Integer pageNO;
//    private Integer pageSize;
//    private Integer count;

    private String refreshPlanState;
    private String refreshPlanRemark;

    public String getRefreshPlanState() {
        return refreshPlanState;
    }

    public void setRefreshPlanState(String refreshPlanState) {
        this.refreshPlanState = refreshPlanState;
    }

    public String getRefreshPlanRemark() {
        return refreshPlanRemark;
    }

    public void setRefreshPlanRemark(String refreshPlanRemark) {
        this.refreshPlanRemark = refreshPlanRemark;
    }


}
