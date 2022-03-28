package com.hnust.controller.vo;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class R extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public R() {
    }

    public R(int status) {
        put("code", status);
        put("message", "success");
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * 成功
     *
     * @return
     */
    public static R OK() {
        R res = new R();
        res.put("timeStamp", System.currentTimeMillis());
        res.put("code", 200);
        res.put("message", "success");
        res.put("body", null);
        return res;
    }

    /**
     * 成功
     *
     * @return
     */
    public static R OK(Res res) {
        R response = new R();
        response.put("timeStamp", System.currentTimeMillis());
        response.put("code", res.getCode());
        response.put("message", res.getMessage());
        response.put("body", null);
        return response;
    }

    /**
     * 成功
     *
     * @return
     */
    public static R OK(Res res, Map<String, Object> body) {
        R response = new R();
        response.put("timeStamp", System.currentTimeMillis());
        response.put("code", res.getCode());
        response.put("message", res.getMessage());
        response.put("body", body);
        return response;
    }

    /**
     * 成功
     *
     * @param body
     * @return
     */
    public static R OK(Map<String, Object> body) {
        R res = new R();
        res.put("timeStamp", System.currentTimeMillis());
        res.put("code", 200);
        res.put("message", "success");
        res.put("body", body);
        return res;
    }

    /**
     * 成功
     *
     * @param body
     * @return
     */
    public static R OK(Object body) {
        R res = new R();
        res.put("timeStamp", System.currentTimeMillis());
        res.put("code", 200);
        res.put("message", "success");
        res.put("body", body);
        return res;
    }

    /**
     * 成功
     *
     * @param code
     * @return
     */
    public static R OK(int code, String message) {
        R res = new R();
        res.put("timeStamp", System.currentTimeMillis());
        res.put("code", code);
        res.put("message", message);
        res.put("body", null);
        return res;
    }

    /**
     * 失败
     *
     * @param code
     * @return
     */
    public static R ERROR(int code, String message) {
        R res = new R();
        res.put("timeStamp", System.currentTimeMillis());
        res.put("code", code);
        res.put("message", message);
        res.put("body", null);
        return res;
    }

    public static R ERROR(Res res) {
        R response = new R();
        response.put("timeStamp", System.currentTimeMillis());
        response.put("code", res.getCode());
        response.put("message", res.getMessage());
        response.put("body", null);
        return response;
    }

    public static R ERROR(Res res, String message) {
        R response = new R();
        response.put("timeStamp", System.currentTimeMillis());
        response.put("code", res.getCode());
        response.put("message", res.getMessage() + message);
        response.put("body", null);
        return response;
    }

}

