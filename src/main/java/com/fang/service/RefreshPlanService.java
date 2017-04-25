package com.fang.service;

import com.fang.DAO.RefreshPlanMapper;
import com.fang.model.RefreshPlan;
import com.fang.model.RefreshPlanCus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;

/**
 * Created by qiaodandan on 2017/4/24.
 */
@Service
public class RefreshPlanService {

    @Autowired
    private RefreshPlanMapper refreshPlanMapper;

    public  RefreshPlan selectByPrimaryKey(Integer id){
        return refreshPlanMapper.selectByPrimaryKey(id);
    }


    public int insertRefreshPlan(int companyid, String refreshtime, String createTime,String state,int soufunid,String remark,int caseid){

        RefreshPlan plan = new RefreshPlan();
        plan.setState(state);
        plan.setCaseid(caseid);
        plan.setCompanyid(companyid);
        plan.setCreatetime(null);
        plan.setRefreshtime(null);
        plan.setRemark(remark);
        plan.setSoufunid(soufunid);
        return refreshPlanMapper.insert(plan);
    }

    public List<RefreshPlan> selectAllRefreshPlans(){
        return refreshPlanMapper.selectAllRefreshPlans();
    }

    public List<RefreshPlan> selectRefreshPlanPage(RefreshPlan record){
        return refreshPlanMapper.selectRefreshPlanPage(record);
    }
    public RefreshPlanCus selectRefreshPlanPageCus(RefreshPlanCus refreshPlanCus){
        return refreshPlanMapper.selectRefreshPlanPageCus(refreshPlanCus);
    }

    public  RefreshPlanCus selectRefreshPlanPageCusHashMap(HashMap hashMap){
        return refreshPlanMapper.selectRefreshPlanPageCusHashMap(hashMap);
    }
}
