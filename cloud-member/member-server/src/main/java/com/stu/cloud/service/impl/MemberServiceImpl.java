package com.stu.cloud.service.impl;

import com.sto.cloud.member.request.CreateMemberInfoRequest;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.entity.Member;
import com.stu.cloud.repository.MemberRepository;
import com.stu.cloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @Author: p_quzhou
 * @Description: 会员业务
 * @Date: 2021/2/19 14:52
 */
@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberRepository memberRepository;

    @Override
    public Integer createMember(CreateMemberInfoRequest request) {
        Member member = new Member();
        member.setMemberNo(request.getMemberNo());
        member.setMemberName(request.getMemberName());
        member.setMemberPhone(request.getMemberPhone());
        member.setMemberSex(request.getMemberSex().byteValue());
        member.setMemberType(request.getMemberType().byteValue());
        return memberRepository.createMember(member);
    }

    @Override
    public QueryMemberInfoResponse queryMemberById(Long memberId) {
        Member member = memberRepository.queryMemberById(memberId);
        return buildQueryResponse(member);
    }

    @Override
    public QueryMemberInfoResponse queryMemberByNo(String memberNo) {
        Member member = memberRepository.queryMemberByNo(memberNo);
        return buildQueryResponse(member);
    }

    private QueryMemberInfoResponse buildQueryResponse(Member member) {
        QueryMemberInfoResponse response = null;
        if (Objects.nonNull(member)) {
            response = new QueryMemberInfoResponse();
            response.setId(member.getId());
            response.setMemberNo(member.getMemberNo());
            response.setMemberName(member.getMemberName());
            response.setMemberPhone(member.getMemberPhone());
            response.setMemberSex(member.getMemberSex().intValue());
            response.setStatus(member.getStatus().intValue());
            response.setMemberType(member.getMemberType().intValue());
            response.setCreateTime(member.getCreateTime().getTime());
            response.setUpdateTime(member.getUpdateTime().getTime());
            response.setIsDeleted(member.getIsDeleted().intValue());
        }
        return response;
    }
}
