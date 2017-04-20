package com.fang.DAO;

import com.fang.model.CaseRefresh;

public interface CaseRefreshMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CaseRefresh record);

    int insertSelective(CaseRefresh record);

    CaseRefresh selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CaseRefresh record);

    int updateByPrimaryKey(CaseRefresh record);
}