package com.fang.DAO;

import com.fang.model.RefreshError;

public interface RefreshErrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefreshError record);

    int insertSelective(RefreshError record);

    RefreshError selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefreshError record);

    int updateByPrimaryKey(RefreshError record);
}