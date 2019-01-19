package com.cloudo.bwee.app;

import com.cloudo.bwee.dao.BaseDao;
import com.cloudo.bwee.dao.KeyPointDao;
import com.cloudo.bwee.domain.KeyPoint;
import com.cloudo.bwee.inter.IKeyPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Key;

/**
 * Created by cloudpj on 2018-12-30.
 */
@Service
public class KeyPointService extends BaseService<KeyPoint> implements IKeyPointService {

    @Autowired
    private KeyPointDao dao;




}
