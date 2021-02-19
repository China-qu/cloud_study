package com.stu.cloud.member.service;

import com.stu.cloud.member.entity.Member;

/**
 * @Author: p_quzhou
 * @Description: 会员业务接口
 * @Date: 2021/2/19 14:51
 */
public interface MemberService {

    /**
     * 新增会员
     * @param member
     * @return
     */
    Integer createMember(Member member);

    /**
     * 根据id查询会员信息
     * @param memberId
     * @return
     */
    Member queryMemberById(Long memberId);

    /**
     * 根据会员卡号查询会员信息
     * @param memberNo
     * @return
     */
    Member queryMemberByNo(String memberNo);
}
