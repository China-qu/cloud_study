package com.sto.cloud.member.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: p_quzhou
 * @Description: 查询会员信息响应结果数据
 * @Date: 2021/2/20 10:18
 */
@Data
public class QueryMemberInfoResponse implements Serializable {

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
    private Integer memberSex;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 会员类型
     */
    private Integer memberType;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long updateTime;

    /**
     * 软删除标记; 0: 正常, 1: 已删除
     */
    private Integer isDeleted;
}
