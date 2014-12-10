package com.ec.exception;

import com.ec.utils.ErrorCodeUtils;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * User: chaocui200783
 * Date: 14-12-10
 * Time: 下午3:10
 */
public class BusinessException extends Exception{

    public interface BusinessExceptionView{};

    private int errorCode = -1;
    private String errorMsg = "unknown";

    public BusinessException(int errorCode){
          this.errorCode = errorCode;
          this.errorMsg  =  ErrorCodeUtils.getErrorMsg(errorCode);
    }

    public BusinessException(){

    }

    @JsonView(BusinessExceptionView.class)
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @JsonView(BusinessExceptionView.class)
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
