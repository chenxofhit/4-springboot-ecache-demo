package com.hnust.controller.vo;

public enum Res {

    // 成功
    OK(200, "SUCCESS"),
    // 未登录
    NOT_LOGON(409, "未登录"),
    // 请求参数错误或者参数不合法
    ERR_PARAMS(410, "请求参数错误或者参数不合法"),
    ERROR(500, "服务异常"),
    USER_NOT_EXISTS(1024, "该用户不存在")
    ;


    private int code;
    private String message;

    Res(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
