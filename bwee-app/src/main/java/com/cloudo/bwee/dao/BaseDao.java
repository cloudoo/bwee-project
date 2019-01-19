package com.cloudo.bwee.dao;

import com.cloudo.base.domain.BaseDomain;

import java.io.Serializable;

/**
 * Created by cloudpj on 2018-12-30.
 */
public interface BaseDao<T extends BaseDomain> {
    T findById(Serializable id);
    int insert(T t);
    int update(T t);
    int updateByParam(T t);
    int delete(Serializable id);
}
