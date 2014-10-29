package com.ec.demo.service;

import com.ec.base.service.BaseService;
import com.ec.demo.dao.DemoDao;
import com.ec.demo.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: chaocui200783
 * Date: 14-10-27
 * Time: 下午3:08
 */
@Service
public class DemoService  extends BaseService<Demo> {
    @Autowired
    private DemoDao demoDao;


}
