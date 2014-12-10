package com.ec.security.controller;

import com.ec.demo.model.Demo;
import com.ec.demo.service.DemoService;
import com.ec.exception.BusinessException;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: chaocui200783
 * Date: 14-10-22
 * Time: 上午11:27
 */
@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private DemoService demoService;

    @JsonView(BusinessException.BusinessExceptionView.class)

    @RequestMapping("/validate")
    public void  validate(@RequestParam(value="username")String username,
                                @RequestParam(value="password")String password) {
    }

}
