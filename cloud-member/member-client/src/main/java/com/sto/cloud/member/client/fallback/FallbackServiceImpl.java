package com.sto.cloud.member.client.fallback;

import com.sto.cloud.member.client.MemberClient;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.common.result.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @Author: p_quzhou
 * @Description: 熔断处理
 * @Date: 2021/3/2 11:12
 */
@Component
public class FallbackServiceImpl implements MemberClient {

    @Override
    public CommonResult<QueryMemberInfoResponse> queryMemberInfoById(Long memberId) {
        return CommonResult.error("会员不存在");
    }

    @Override
    public CommonResult<QueryMemberInfoResponse> queryMemberInfoByNo(String memberNo) {
        return CommonResult.error("会员不存在");
    }
}
