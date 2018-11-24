package com.iztao.pkuse.base.common.dao;

import java.util.List;

import com.iztao.pkuse.base.common.model.Page;

public interface BaseMapper<T> {
    int deleteByPrimaryKey(String[] ids);

    int insert(T t);

    T selectByPrimaryKey(String id);

    List<T> selectAll();

    int updateByPrimaryKey(T t);

	List<T> findTByPage(Page<T> page);

	int findTCountByT(T t);

	List<T> findTByT(T t);
	
	int deleteByT(T[] Ts);
}