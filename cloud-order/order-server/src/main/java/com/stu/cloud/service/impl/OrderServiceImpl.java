package com.stu.cloud.service.impl;

import com.sto.cloud.member.client.MemberClient;
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


}
