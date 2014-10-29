package com.ec.utils;

/**
 * User: chaocui200783
 * Date: 14-10-29
 * Time: 下午3:36
 */
public class JsonResultWrapper {

    public static JsonResult createJsonResult(String code,Object data){
        JsonResult result = new JsonResult(code,getMsg(code),data);
        return result;
    }
    public static JsonResult createJsonResult(String code){
        JsonResult result = new JsonResult(code,getMsg(code));
        return result;
    }
    private static String getMsg(String code){
        return ErrorCodeUtils.getErrorMsg(code);
    }
}
