package com.ec.demo.service;

import com.ec.base.service.BaseService;
import com.ec.demo.entity.Demo;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-30
 * Time: 下午5:25
 */
public interface DemoService extends BaseService{
    public Demo find(long id);
    public List<Demo> findAll();
    public long count();
    public Demo save(Demo demo);
    public void delete(long id);
    public Demo findByUsername(String username);
}
