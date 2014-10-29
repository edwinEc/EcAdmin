package com.ec.base.dao;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-25
 * Time: 下午2:14
 */
public interface IBaseDao<T>{
    <T> T find(int id);
    void save(T t);
    void delete(T t);
    int count();
    List<T> findByPage(int offset, int limit) ;
    List<T> findAll();
}
