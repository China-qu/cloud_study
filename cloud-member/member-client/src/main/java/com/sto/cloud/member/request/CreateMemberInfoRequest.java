package com.sto.cloud.member.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: p_quzhou
 * @Description: 创建会员信息请求数据
 * @Date: 2021/2/20 10:20
 */
@Data
public class CreateMemberInfoRequest implements Serializable {

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
     * 会员类型
     */
    private Integer memberType;
}
