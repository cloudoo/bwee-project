package com.cloudo.bwee.app;

import com.cloudo.base.domain.BaseDomain;
import com.cloudo.bwee.dao.BaseDao;

/**
 * Created by cloudpj on 2018-12-30.
 */
public abstract class BaseService<T extends BaseDomain> {

    private BaseDao dao;

    public void setDao(BaseDao dao){
        this.dao = dao;
    }

    public BaseDomain findById(Long id){
        return dao.findById(id);
    }

    public BaseDomain insert(T t){
        dao.insert(t);
        return t;
    }

    public boolean delete(Long id){
        int re = dao.delete(id);
        return re>0;
        }

    public boolean update(T t){
        dao.update(t);
        return true;
    }
}
