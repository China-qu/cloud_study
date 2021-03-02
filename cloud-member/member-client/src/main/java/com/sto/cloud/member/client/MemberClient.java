package com.sto.cloud.member.client;

import com.sto.cloud.member.client.fallback.FallbackServiceImpl;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.common.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: p_quzhou
 * @Description: 服务提供
 * @Date: 2021/2/20 10:04
 */
@FeignClient(name = "cloud-member-service", fallback = FallbackServiceImpl.class)
public interface MemberClient {

    @RequestMapping(value = "/member/queryMemberInfoById/{memberId}", method = RequestMethod.POST)
    CommonResult<QueryMemberInfoResponse> queryMemberInfoById(@PathVariable("memberId") Long memberId);

    @RequestMapping(value = "/member/queryMemberInfoByNo/{memberNo}", method = RequestMethod.POST)
    CommonResult<QueryMemberInfoResponse> queryMemberInfoByNo(@PathVariable("memberNo") String memberNo);
}
