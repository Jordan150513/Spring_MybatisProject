package com.fang.Controller;

import com.fang.model.OperationResult;
import com.fang.model.RefreshConsumption;
import com.fang.service.RefreshConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
}
