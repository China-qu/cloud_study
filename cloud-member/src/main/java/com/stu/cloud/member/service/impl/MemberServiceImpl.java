package com.stu.cloud.member.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.stu.cloud.member.dao.MemberDao;
import com.stu.cloud.member.entity.Member;
import com.stu.cloud.member.entity.MemberExample;
import com.stu.cloud.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: p_quzhou
 * @Description: 会员业务
 * @Date: 2021/2/19 14:52
 */
@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberDao memberDao;

    @Override
    public Integer createMember(Member member) {
        return memberDao.insert(member);
    }

    @Override
    public Member queryMemberById(Long memberId) {
        return memberDao.selectByPrimaryKey(memberId);
    }

    @Override
    public Member queryMemberByNo(String memberNo) {
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMemberNoEqualTo(memberNo);
        List<Member> memberList = memberDao.selectByExample(memberExample);
        if (CollUtil.isNotEmpty(memberList)) {
            return memberList.get(0);
        }
        return null;
    }
}
