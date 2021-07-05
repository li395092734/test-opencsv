package com.lydms.testopencsv.common;

import java.io.Serializable;
import java.util.HashMap;

public class Result extends HashMap<String, Object> implements Serializable {
    private static final long serialVersionUID = 64161316464L;

    public Result() {
        this.put("code", 0);
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.put("code", 200);
        result.put("data",data);
        return result;
    }

    public static Result error() {
        return error(500, "系统异常");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public Result put(Object data) {
        super.put("data", data);
        return this;
    }
}