package com.sto.cloud.member.client;

import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.common.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: p_quzhou
 * @Description: 服务提供
 * @Date: 2021/2/20 10:04
 */
@FeignClient(name = "cloud-member-service")
public interface MemberClient {

    @RequestMapping(value = "/member/queryMemberInfoById", method = RequestMethod.POST)
    CommonResult<QueryMemberInfoResponse> queryMemberInfoById(Long memberId);

    @RequestMapping(value = "/member/queryMemberInfoByNo", method = RequestMethod.POST)
    CommonResult<QueryMemberInfoResponse> queryMemberInfoByNo(String memberNo);
}
