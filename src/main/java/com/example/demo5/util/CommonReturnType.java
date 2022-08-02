package com.example.demo5.util;


public class CommonReturnType {
    private String ErrorCode;
    private String ErrorMsg;
    private Object data;

    private String MachineStatus; //机械状态 暂时不用

    public CommonReturnType() {

    }

    public CommonReturnType(String code, String message, Object data) {
        this.ErrorCode = code;
        this.ErrorMsg = message;
        this.data = data;
    }

    public String getCode() {
        return ErrorCode;
    }

    public void setCode(String code) {
        this.ErrorCode = code;
    }

    public String getMessage() {
        return ErrorMsg;
    }

    public void setMessage(String message) {
        this.ErrorMsg = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonReturnType{" +
                "ErrorCode='" + ErrorCode + '\'' +
                ", ErrorMsg='" + ErrorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}



