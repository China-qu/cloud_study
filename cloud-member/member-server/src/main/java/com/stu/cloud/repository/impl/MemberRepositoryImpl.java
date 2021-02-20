package com.stu.cloud.repository.impl;

import cn.hutool.core.collection.CollUtil;
import com.stu.cloud.dao.MemberDao;
import com.stu.cloud.entity.Member;
import com.stu.cloud.entity.MemberExample;
import com.stu.cloud.repository.MemberRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: p_quzhou
 * @Description: 数据交互业务
 * @Date: 2021/2/20 9:56
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    @Resource
    private MemberDao memberDao;

    @Override
    public Integer createMember(Member member) {
        return memberDao.insertSelective(member);
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
