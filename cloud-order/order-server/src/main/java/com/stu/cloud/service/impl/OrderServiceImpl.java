package com.stu.cloud.service.impl;

import com.sto.cloud.member.client.MemberClient;
import com.sto.cloud.member.response.QueryMemberInfoResponse;
import com.stu.cloud.common.result.CommonResult;
import com.stu.cloud.entity.Order;
import com.stu.cloud.repository.OrderRepository;
import com.stu.cloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: p_quzhou
 * @Description: 订单业务
 * @Date: 2021/2/19 14:54
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private MemberClient memberClient;
    @Resource
    private OrderRepository orderRepository;

    @Override
    public void createOrder() {
        CommonResult<QueryMemberInfoResponse> result = memberClient.queryMemberInfoByNo("88886666");
        if (!result.isSuccess()) {
            System.out.println(result.getMsg());
            return;
        }
        QueryMemberInfoResponse data = result.getData();
        Order order = new Order();
        order.setOrderNo("293845782904");
        order.setBuyerId(data.getMemberNo());
        order.setOrderType(new Byte("1"));
        order.setOrderStatus(new Byte("1"));
        order.setOrderAmount(1L);
        order.setOrderSource(new Byte("1"));
        order.setRemark("AAA");
        orderRepository.createOrder(order);
    }
}
