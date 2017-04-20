package com.fang.DAO;

import com.fang.model.RefreshConsumption;

public interface RefreshConsumptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefreshConsumption record);

    int insertSelective(RefreshConsumption record);

    RefreshConsumption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefreshConsumption record);

    int updateByPrimaryKey(RefreshConsumption record);
}