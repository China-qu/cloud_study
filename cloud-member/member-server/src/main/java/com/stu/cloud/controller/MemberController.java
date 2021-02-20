package com.stu.cloud.controller;

import com.sto.cloud.member.request.CreateMemberInfoRequest;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.common.result.CommonResult;
import com.stu.cloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/create")
    public void create(@RequestBody CreateMemberInfoRequest createMemberInfoRequest) {
        memberService.createMember(createMemberInfoRequest);
    }

    @RequestMapping("/queryMemberInfoById")
    public CommonResult<QueryMemberInfoResponse> queryMemberInfoById(@RequestParam Long memberId) {
        QueryMemberInfoResponse response = memberService.queryMemberById(memberId);
        return CommonResult.success(response);
    }

    @RequestMapping("/queryMemberInfoByNo")
    public CommonResult<QueryMemberInfoResponse> queryMemberInfoByNo(@RequestParam String memberNo) {
        QueryMemberInfoResponse response = memberService.queryMemberByNo(memberNo);
        return CommonResult.success(response);
    }
    
}