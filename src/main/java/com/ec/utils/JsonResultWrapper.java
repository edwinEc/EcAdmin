package com.ec.utils;

/**
 * User: chaocui200783
 * Date: 14-10-29
 * Time: 下午3:36
 */
public class JsonResultWrapper {

    public static JsonResult createResult(String code,Object data){
        JsonResult result = new JsonResult(code,getMsg(code),data);
        return result;
    }

    public static JsonResult createSuccessResult(Object data){
        return createResult("0",data);
    }

    public static JsonResult createResult(String code){
        JsonResult result = new JsonResult(code,getMsg(code));
        return result;
    }

    public static JsonResult createSuccessResult(){
        return createResult("0",null);
    }


    private static String getMsg(String code){
        return ErrorCodeUtils.getErrorMsg(code);
    }
}
