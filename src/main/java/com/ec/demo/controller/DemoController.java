package com.ec.demo.controller;

import com.ec.demo.service.DemoService;
import com.ec.utils.JsonResult;
import com.ec.demo.model.Demo;
import com.ec.demo.service.DemoServiceImp;
import com.ec.utils.JsonResultWrapper;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult  save(@ModelAttribute Demo demo) {
        demoService.save(demo);
        return  JsonResultWrapper.createSuccessResult();
    }

    @RequestMapping("/delete/{id}")
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult delete(@PathVariable int id) {
        demoService.delete(id);
        return  JsonResultWrapper.createSuccessResult();

    }

    @RequestMapping("/find/{id}")
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult find(@PathVariable int id) {
        Demo demo = demoService.find(id);
        return JsonResultWrapper.createSuccessResult(demo);
    }

    @RequestMapping("/findAll")
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult findAll() {
        List<Demo> demoList = demoService.findAll();
        return JsonResultWrapper.createSuccessResult(demoList);
    }

    @RequestMapping("/count")
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult count() {
        int count  = demoService.count();
        Map<String,String> map = new HashMap<String,String>();
        map.put("count",String.valueOf(count));
        return JsonResultWrapper.createSuccessResult(map);
    }

    @RequestMapping("/test/{id}")
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult test(@PathVariable int id) {
       // demoService.test(id);
        return JsonResultWrapper.createSuccessResult();
    }
}
