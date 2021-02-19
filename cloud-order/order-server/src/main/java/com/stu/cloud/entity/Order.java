package com.stu.cloud.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * stu_order
 * @author 
 */
@Data
public class Order implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 买家id
     */
    private String buyerId;

    /**
     * 订单类型
     */
    private Byte orderType;

    /**
     * 订单状态
     */
    private Byte orderStatus;

    /**
     * 订单金额
     */
    private Long orderAmount;

    /**
     * 订单来源
     */
    private Byte orderSource;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 软删除标记; 0: 正常, 1: 已删除
     */
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;
}