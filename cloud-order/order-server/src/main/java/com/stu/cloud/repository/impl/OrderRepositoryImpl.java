package com.stu.cloud.repository.impl;

import com.stu.cloud.dao.OrderDao;
import com.stu.cloud.entity.Order;
import com.stu.cloud.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author: p_quzhou
 * @Description: 订单
 * @Date: 2021/3/2 11:23
 */
@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Resource
    private OrderDao orderDao;

    @Override
    public Integer createOrder(Order order) {
        return orderDao.insertSelective(order);
    }
}
