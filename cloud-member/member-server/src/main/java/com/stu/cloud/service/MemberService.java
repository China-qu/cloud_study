package com.stu.cloud.service;

import com.sto.cloud.member.request.CreateMemberInfoRequest;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.entity.Member;

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
    Integer createMember(CreateMemberInfoRequest member);

    /**
     * 根据id查询会员信息
     * @param memberId
     * @return
     */
    QueryMemberInfoResponse queryMemberById(Long memberId);

    /**
     * 根据会员卡号查询会员信息
     * @param memberNo
     * @return
     */
    QueryMemberInfoResponse queryMemberByNo(String memberNo);
}
