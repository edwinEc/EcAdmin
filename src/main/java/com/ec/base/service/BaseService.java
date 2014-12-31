package com.ec.base.service;

import java.io.Serializable;
import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-25
 * Time: 下午2:15
 */
public interface BaseService<T extends Serializable>{
    public T save(T t);
    public T delete(int id);
    public T find(int id);
    public int count();
    public List<T> findAll();
    List<T> findByPage(int offset, int limit) ;
}
