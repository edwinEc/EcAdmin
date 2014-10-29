package com.ec.utils;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * User: chaocui200783
 * Date: 14-10-28
 * Time: 下午5:49
 */
public class JsonResult {

    public interface JsonResultView{};

    private String code;
    private String msg;
    private Object data;

    JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    JsonResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @JsonView(JsonResult.JsonResultView.class)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonView(JsonResult.JsonResultView.class)
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonView(JsonResult.JsonResultView.class)
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
