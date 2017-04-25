package com.fang.service;

import com.fang.DAO.RefreshConsumptionMapper;
import com.fang.model.RefreshConsumption;
import com.fang.model.RefreshConsumptionCus;
import com.fang.model.RefreshConsumptionCusPages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by qiaodandan on 2017/4/25.
 */

@Service
public class RefreshConsumptionService {

    @Autowired
    RefreshConsumptionMapper refreshConsumptionMapper;
// ----   插入一条消费记录
   public int insert(RefreshConsumption record){
        return refreshConsumptionMapper.insert(record);
    }

    // 查询companyid的公司的消费记录 以及每条消费记录的刷新plan的详情
    public List<RefreshConsumptionCus>  selectAssociatedByCompanyId(Integer id){
        return refreshConsumptionMapper.selectAssociatedByCompanyId(id);
    }

    // 获取关联的消费记录的总数
    public Integer selectAssociatedCountByCompanyId(Integer id){
        return refreshConsumptionMapper.selectAssociatedCountByCompanyId(id);
    }

    // 获取带总数的某公司的消费记录
    public RefreshConsumptionCusPages selectAssociatedByCompanyIdPages(HashMap hashMap){
        return refreshConsumptionMapper.selectAssociatedByCompanyIdPages(hashMap);
    }
}
