package com.stu.cloud.repository;

import com.stu.cloud.entity.Order;

/**
 * @Author: p_quzhou
 * @Description: 订单数据交互
 * @Date: 2021/3/2 11:22
 */
public interface OrderRepository {

    Integer createOrder(Order order);
}
