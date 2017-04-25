package com.fang.Controller;

import com.fang.model.OperationResult;
import com.fang.model.RefreshConsumption;
import com.fang.model.RefreshConsumptionCus;
import com.fang.model.RefreshConsumptionCusPages;
import com.fang.service.RefreshConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by qiaodandan on 2017/4/25.
 */

@RestController
public class RefreshConsumptionController {

    @Autowired
    private RefreshConsumptionService restConsumptionService;

    // --- 插入一条消费记录
    //  http://localhost:8055/dd/RefreshConsumption/insert?refreshPlanId=2&caseId=2&companyId=2&refreshType=refreshType3&refreshTime=2017-01-25&soufunId=10010&createTime=13:30:40&isDel=0
    @RequestMapping("RefreshConsumption/insert")
    public OperationResult insert(int refreshPlanId, int caseId,int companyId, String refreshType,String refreshTime,int soufunId, String createTime, int isDel){
        RefreshConsumption record = new RefreshConsumption();
        record.setRefreshplanid(refreshPlanId);
        record.setCaseid(caseId);
        record.setCompanyid(companyId);
        record.setRefreshtype(refreshType);
        record.setRefreshtime(new Date());
        record.setSoufunid(soufunId);
        record.setCreatetime(new Date());
        record.setIsdel(isDel==1?true:false);
        int rs = restConsumptionService.insert(record);

        OperationResult operationResult = new OperationResult();
        operationResult.setIsSuccess(rs);
        operationResult.setMessage(rs==1?"操作成功！":"操作失败！");

        return operationResult;
    }

    // 查询companyid的公司的消费记录 以及每条消费记录的刷新plan的详情
    //      http://localhost:8055/dd/RefreshConsumption/selectAssociatedByCompanyId?companyId=1


    @RequestMapping("RefreshConsumption/selectAssociatedByCompanyId")
    List<RefreshConsumptionCus> selectAssociatedByCompanyId(Integer companyId){
        return restConsumptionService.selectAssociatedByCompanyId(companyId);
    }

    //      http://localhost:8055/dd/RefreshConsumption/selectAssociatedCountByCompanyId?companyId=1
    @RequestMapping("RefreshConsumption/selectAssociatedCountByCompanyId")
    public Integer selectAssociatedCountByCompanyId(Integer companyId){
        return restConsumptionService.selectAssociatedCountByCompanyId(companyId);
    }

    //      http://localhost:8055/dd/RefreshConsumption/RefreshConsumptionCusPages?companyId=1&pageNO=1&pageSize=3
    @RequestMapping("RefreshConsumption/RefreshConsumptionCusPages")
    public RefreshConsumptionCusPages selectAssociatedByCompanyIdPages(Integer companyId,Integer pageNO, Integer pageSize){
            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
            hashMap.put("companyId",companyId);
            hashMap.put("fromIndex",(pageNO-1)*pageSize);
            hashMap.put("toIndex",pageSize*pageSize);
        List<RefreshConsumptionCus> list=  restConsumptionService.selectAssociatedByCompanyIdPages(hashMap);
        RefreshConsumptionCusPages refreshConsumptionCusPages = new RefreshConsumptionCusPages();
        refreshConsumptionCusPages.setList(list);
        refreshConsumptionCusPages.setPageNO(pageNO);
        refreshConsumptionCusPages.setPageSize(pageSize);
        refreshConsumptionCusPages.setCount(selectAssociatedCountByCompanyId(companyId));
        return refreshConsumptionCusPages;
    }

}