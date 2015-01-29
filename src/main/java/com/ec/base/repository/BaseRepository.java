package com.ec.base.repository;

import java.io.Serializable;
import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-25
 * Time: 下午2:14
 */
public interface BaseRepository<T extends Serializable>{
    T find(int id);
    T save(T t);
    void delete(T t);
    int count();
    List<T> findByPage(int offset, int limit) ;
    List<T> findAll();
}
