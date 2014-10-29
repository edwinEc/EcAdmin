package com.ec.base.service;

import com.ec.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-29
 * Time: 下午5:21
 */
public abstract class BaseService<T> implements IBaseService<T>{

    @Autowired
    private BaseDao baseDao;

    @Override
    public void save(T t){
        baseDao.save(t);
    }

    @Override
    public void delete(T t){
        baseDao.delete(t);
    }

    @Override
    public <T> T find(int id){
        return (T)baseDao.find(id);
    }

    @Override
    public int count() {
        return baseDao.count();
    }

    @Override
    public List<T> findAll() {
        return baseDao.findAll();
    }

    @Override
    public List<T> findByPage(int offset, int limit) {
        return baseDao.findByPage(offset, limit);
    }
}
