package com.ec.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.HashMap;
import java.util.Map;

/**
 * User: chaocui200783
 * Date: 14-10-30
 * Time: 上午11:37
 */
@ControllerAdvice(annotations = RestController.class)
public class GlobalControllerExceptionHandler {

    private static Logger logger = LogManager.getLogger(GlobalControllerExceptionHandler.class.getName());


    @ExceptionHandler(Exception.class)
    public @ResponseBody
    JsonResult handleException(Exception e) {
        logger.error("handleException:",e);
        return new JsonResult("-1",e.getMessage());
    }
}