package com.ec.demo.controller;

import com.ec.demo.entity.Demo;
import com.ec.demo.service.DemoService;
import com.ec.exception.BusinessException;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-22
 * Time: 上午11:27
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/save")
    @JsonView(Demo.DemoView.class)
    public Demo  save(@ModelAttribute Demo demo) {
        return demoService.save(demo);
    }

    @RequestMapping("/delete/{id}")
    @JsonView(Demo.DemoView.class)
    public Demo delete(@PathVariable int id) {
        return  demoService.delete(id);

    }

    @RequestMapping("/find/{id}")
    @JsonView(Demo.DemoView.class)
    public Demo find(@PathVariable int id) {
        return demoService.find(id);
    }

    @RequestMapping("/findAll")
    @JsonView(Demo.DemoView.class)
    public List<Demo> findAll() throws BusinessException {

        throw new BusinessException(1);
        //return demoService.findAll();
    }

    @RequestMapping("/count")
    @JsonView(Demo.DemoView.class)
    public int count() {
        return demoService.count();
    }

}
