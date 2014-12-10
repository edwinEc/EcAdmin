package com.ec.base.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-28
 * Time: 下午4:58
 */
@Repository
public abstract class BaseDaoImp<T> implements BaseDao<T> {

    protected Class<T> entityClass;
    protected String className;
    public BaseDaoImp(){
        entityClass=(Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        className=entityClass.getName();
    }

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public T find(int id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public T save(T t) {
        return entityManager.merge(t);
    }

    @Override
    public void delete(T t) {
        entityManager.remove(t);
    }


    @Override
    public int count() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<T> root = query.from(entityClass);
        query.select(criteriaBuilder.countDistinct(root));
        int count = entityManager.createQuery(query).getSingleResult().intValue();
        return count;
    }

    @Override
    public List<T> findByPage(int offset, int limit) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(entityClass);
        Root<T> root = query.from(entityClass);
        query.select(root);
        List<T> result = entityManager.createQuery(query)
                .setFirstResult(offset)
                .setMaxResults(limit)
                .getResultList();
        return result;
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(entityClass);
        Root<T> root = query.from(entityClass);
        query.select(root);
        List<T> result = entityManager.createQuery(query).getResultList();
        return result;
    }
}
