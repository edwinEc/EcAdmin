package com.ec.demo.dao;

import com.ec.base.dao.BaseDao;
import com.ec.demo.model.Demo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: chaocui200783
 * Date: 14-10-25
 * Time: 下午2:16
 */
@Transactional
@Repository
public class DemoDao extends BaseDao<Demo>{



}
