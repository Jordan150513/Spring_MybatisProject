package com.fang.Controller;

import com.fang.DAO.RefreshPlanMapper;
import com.fang.model.RefreshPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by qiaodandan on 2017/4/20.
 */
@RestController
public class RefreshPlanController {
    @Autowired
    private RefreshPlanMapper refreshPlanMapper;

    // http://localhost:8090/dd/RefreshPlan/selectByPrimaryKey?id=1
    @RequestMapping("RefreshPlan/selectByPrimaryKey")
    public RefreshPlan selectByPrimaryKey(Integer id){
        return refreshPlanMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("RefreshPlan/insert")
    public int insertRefreshPlan(int companyid, String refreshtime, String createTime,String state,int soufunid,String remark,int caseid){
//        http://localhost:8090/dd/RefreshPlan/insert?companyid=1&state=state2&soufunid=10010&remark=theThird&caseid=1
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
