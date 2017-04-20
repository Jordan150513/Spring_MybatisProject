package com.fang.DAO;

import com.fang.model.RefreshPlanBac;

public interface RefreshPlanBacMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefreshPlanBac record);

    int insertSelective(RefreshPlanBac record);

    RefreshPlanBac selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefreshPlanBac record);

    int updateByPrimaryKey(RefreshPlanBac record);
}