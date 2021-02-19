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
}
