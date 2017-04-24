package com.fang.Controller;

import com.fang.DAO.RefreshPlanMapper;
import com.fang.model.RefreshPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fang.service.RefreshPlanService;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by qiaodandan on 2017/4/20.
 */
@RestController
public class RefreshPlanController {

    @Autowired
    private RefreshPlanService refreshPlanService;

    //      http://localhost:8099/dd/RefreshPlan/selectByPrimaryKey?id=1
    @RequestMapping("RefreshPlan/selectByPrimaryKey")
    public RefreshPlan selectByPrimaryKey(Integer id){
                return refreshPlanService.selectByPrimaryKey(id);
    }

    //        http://localhost:8099/dd/RefreshPlan/insert?companyid=1&state=state2&soufunid=10010&remark=theThird&caseid=1
    @RequestMapping("RefreshPlan/insert")
    public int insertRefreshPlan(int companyid, String refreshtime, String createTime,String state,int soufunid,String remark,int caseid){
        return refreshPlanService.insertRefreshPlan(companyid,refreshtime,createTime,state,soufunid,remark,caseid);
    }

    //        http://localhost:8099/dd/RefreshPlan/selectAllRefreshPlans
    @RequestMapping("RefreshPlan/selectAllRefreshPlans")
    public List<RefreshPlan> selectAllRefreshPlans(){
        return refreshPlanService.selectAllRefreshPlans();
    }

    //      http://localhost:8099/dd/RefreshPlan/selectRefreshPlanPage?fromIndex=0&toIndex=3
    //      http://localhost:8099/dd/RefreshPlan/selectRefreshPlanPage?pageNO=1&pageSize=3
    @RequestMapping("RefreshPlan/selectRefreshPlanPage")
    public List<RefreshPlan> selectRefreshPlanPage(int fromIndex,int toIndex){
        RefreshPlan record = new RefreshPlan();
        record.setFromIndex(fromIndex);
        record.setToIndex(toIndex);
        return refreshPlanService.selectRefreshPlanPage(record);
    }
}
