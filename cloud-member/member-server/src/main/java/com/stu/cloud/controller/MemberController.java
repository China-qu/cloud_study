package com.stu.cloud.controller;

import com.sto.cloud.member.request.CreateMemberInfoRequest;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.common.result.CommonResult;
import com.stu.cloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody CreateMemberInfoRequest createMemberInfoRequest) {
        memberService.createMember(createMemberInfoRequest);
    }

    @RequestMapping(value = "/queryMemberInfoById/{memberId}", method = RequestMethod.POST)
    public CommonResult<QueryMemberInfoResponse> queryMemberInfoById(@PathVariable("memberId") Long memberId) {
        QueryMemberInfoResponse response = memberService.queryMemberById(memberId);
        return CommonResult.success(response);
    }

    @RequestMapping(value = "/queryMemberInfoByNo/{memberNo}", method = RequestMethod.POST)
    public CommonResult<QueryMemberInfoResponse> queryMemberInfoByNo(@PathVariable("memberNo") String memberNo) {
        QueryMemberInfoResponse response = memberService.queryMemberByNo(memberNo);
        return CommonResult.success(response);
    }
    
}