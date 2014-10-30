package com.ec.demo.service;

import com.ec.base.service.BaseServiceImp;
import com.ec.demo.dao.DemoDao;
import com.ec.demo.model.Demo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * User: chaocui200783
 * Date: 14-10-27
 * Time: 下午3:08
 */
@Transactional
@Service
public class DemoServiceImp extends BaseServiceImp<Demo> implements DemoService{

    @Resource(name= "demoDaoImp")
    private DemoDao demoDao;


}
