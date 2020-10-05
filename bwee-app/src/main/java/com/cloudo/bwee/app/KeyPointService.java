package com.cloudo.bwee.app;

import com.cloudo.bwee.repository.KeyPointRepository;
import com.cloudo.bwee.domain.KeyPoint;
import com.cloudo.bwee.inter.IKeyPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 知识点管理
 * Created by cloudpj on 2018-12-30.
 */
@Service
public class KeyPointService   implements IKeyPointService {

    @Autowired
    private KeyPointRepository dao;





}
