package com.ec.security.controller;

import com.ec.utils.JsonResult;
import com.ec.demo.service.DemoService;
import com.ec.utils.JsonResultWrapper;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/validate")
    @JsonView(JsonResult.JsonResultView.class)
    public JsonResult  validate(@RequestParam(value="username")String username,
                                @RequestParam(value="password")String password) {
        return JsonResultWrapper.createJsonResult("0");
    }

}
