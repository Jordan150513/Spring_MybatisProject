package com.fang.DAO;

import com.fang.model.RefreshConsumption;
import com.fang.model.RefreshConsumptionCus;
import com.fang.model.RefreshConsumptionCusPages;

import java.util.HashMap;
import java.util.List;

public interface RefreshConsumptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefreshConsumption record);

    int insertSelective(RefreshConsumption record);

    RefreshConsumption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefreshConsumption record);

    int updateByPrimaryKey(RefreshConsumption record);

    List<RefreshConsumptionCus>  selectAssociatedByCompanyId(Integer id);

    public Integer selectAssociatedCountByCompanyId(Integer companyId);

    public List<RefreshConsumptionCus> selectAssociatedByCompanyIdPages(HashMap hashMap);
}