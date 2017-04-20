package com.fang.DAO;

import com.fang.model.RefreshPlan;

public interface RefreshPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefreshPlan record);

    int insertSelective(RefreshPlan record);

    RefreshPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefreshPlan record);

    int updateByPrimaryKey(RefreshPlan record);
}