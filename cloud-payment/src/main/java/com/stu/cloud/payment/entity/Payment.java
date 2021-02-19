package com.stu.cloud.payment.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * stu_payment
 * @author 
 */
@Data
public class Payment implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户ID
     */
    private String buyerId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 交易通道
     */
    private String channel;

    /**
     * 交易流水号
     */
    private String traceNo;

    /**
     * 支付金额
     */
    private Long amount;

    /**
     * 支付状态
     */
    private Byte paymentStatus;

    /**
     * 成功时间
     */
    private Date successTime;

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