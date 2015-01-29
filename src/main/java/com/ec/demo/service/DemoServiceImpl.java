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

    public Demo find(int id){
        return demoRepository.find(id);
    }

    public List<Demo> findAll(){
        return demoRepository.findAll();
    }
    public int count(){
            return demoRepository.count();
    }
    public Demo save(Demo demo){
        return demoRepository.save(demo);
    }
    public Demo delete(int id){
        Demo demo = demoRepository.find(id);
        if(demo!=null){
            demoRepository.delete(demo);
            return demo;
        }
        return null;
    }


}
