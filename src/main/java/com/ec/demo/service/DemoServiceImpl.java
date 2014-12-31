package com.ec.demo.service;

import com.ec.base.service.BaseServiceImpl;
import com.ec.demo.dao.DemoDao;
import com.ec.demo.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: chaocui200783
 * Date: 14-10-27
 * Time: 下午3:08
 */
@Transactional
@Service
public class DemoServiceImpl extends BaseServiceImpl<Demo> implements DemoService{
    @Autowired
    private DemoDao demoDao;


}
