package com.ec.demo.service;

import com.ec.demo.entity.Demo;
import com.ec.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-27
 * Time: 下午3:08
 */
@Transactional
@Service
public class DemoServiceImpl  implements DemoService{
    @Autowired
    private DemoRepository demoRepository;

    public Demo find(long id){
        return demoRepository.findOne(id);
    }
    public Demo findByUsername(String username){
        return demoRepository.findByUsername(username);
    }

    public List<Demo> findAll(){
        return demoRepository.findAll();
    }
    public long count(){
            return demoRepository.count();
    }
    public Demo save(Demo demo){
        return demoRepository.save(demo);
    }
    public void delete(long id){
        demoRepository.delete(id);
    }


}
