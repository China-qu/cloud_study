package com.stu.cloud.repository;

import com.stu.cloud.entity.Member;

/**
 * @Author: p_quzhou
 * @Description: 数据交互
 * @Date: 2021/2/20 9:55
 */
public interface MemberRepository {

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
