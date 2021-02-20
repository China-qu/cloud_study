package com.stu.cloud.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * stu_member
 * @author 
 */
@Data
public class Member implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 会员卡号
     */
    private String memberNo;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 会员电话号码
     */
    private String memberPhone;

    /**
     * 性别 0男 1女
     */
    private Byte memberSex;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 会员类型
     */
    private Byte memberType;

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