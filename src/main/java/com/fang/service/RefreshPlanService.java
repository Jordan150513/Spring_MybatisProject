package com.fang.service;

import com.fang.DAO.RefreshPlanMapper;
import com.fang.model.RefreshPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
