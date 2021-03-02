package com.stu.cloud.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: p_quzhou
 * @Description: 公共结果类
 * @Date: 2021/2/19 13:06
 */
@Data
public class CommonResult<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    private static Integer SUCCESS_CODE = 1;
    private static Integer FAIL_CODE = 500;
    private static String SUCCESS_MSG = "SUCCESS";

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(data);
    }

    public static <T> CommonResult<T> error(Integer code, String msg) {
        return new CommonResult(code, msg);
    }

    public static <T> CommonResult<T> error(String msg) {
        return new CommonResult(msg);
    }

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(this.code);
    }

    public CommonResult(T data) {
        this.data = data;
        this.code = SUCCESS_CODE;
        this.msg = SUCCESS_MSG;
    }

    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResult(String msg) {
        this.code = FAIL_CODE;
        this.msg = msg;
    }

    public CommonResult() {

    }
}
