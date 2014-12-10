package com.ec.base.service;

import com.ec.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-29
 * Time: 下午5:21
 */
@Transactional
@Service
public abstract class BaseServiceImp<T> implements BaseService<T> {

    @Autowired
    private BaseDao baseDaoImp;

    @Override
    public T save(T t){
        return (T)baseDaoImp.save(t);
    }

    @Override
    public T delete(int id){
        T entity = find(id);
        baseDaoImp.delete(entity);
        return entity;
    }

    @Override
    public T find(int id){
        return (T)baseDaoImp.find(id);
    }

    @Override
    public int count() {
        return baseDaoImp.count();
    }

    @Override
    public List<T> findAll() {
        return baseDaoImp.findAll();
    }

    @Override
    public List<T> findByPage(int offset, int limit) {
        return baseDaoImp.findByPage(offset, limit);
    }
}
