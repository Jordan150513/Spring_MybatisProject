package com.fang.model;

/**
 * Created by qiaodandan on 2017/4/25.
 */
public class OperationResult {
    private  int isSuccess;
    private String Message;

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
