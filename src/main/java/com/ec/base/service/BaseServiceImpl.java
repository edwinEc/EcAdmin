package com.ec.base.service;

import com.ec.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-29
 * Time: 下午5:21
 */
@SuppressWarnings("ALL")
public abstract class BaseServiceImpl<T extends Serializable> implements BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    @Override
    public T save(T t){
        return baseDao.save(t);
    }

    @Override
    public T delete(int id){
        T entity = find(id);
        baseDao.delete(entity);
        return entity;
    }

    @Override
    public T find(int id){
        return baseDao.find(id);
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
