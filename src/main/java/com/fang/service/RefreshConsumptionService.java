package com.fang.service;

import com.fang.DAO.RefreshConsumptionMapper;
import com.fang.model.RefreshConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
