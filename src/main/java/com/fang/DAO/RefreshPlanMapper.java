package com.fang.DAO;

import com.fang.model.RefreshPlan;
import com.fang.model.RefreshPlanCus;

import java.util.List;

public interface RefreshPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefreshPlan record);

    int insertSelective(RefreshPlan record);

    RefreshPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefreshPlan record);

    int updateByPrimaryKey(RefreshPlan record);

    List<RefreshPlan> selectAllRefreshPlans();

    List<RefreshPlan> selectRefreshPlanPage(RefreshPlan record);

    RefreshPlanCus selectRefreshPlanPageCus(RefreshPlanCus refreshPlanCus);
}