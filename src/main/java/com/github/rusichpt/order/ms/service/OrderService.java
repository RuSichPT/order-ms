package com.github.rusichpt.order.ms.service;

import com.github.rusichpt.order.ms.entity.Order;

public interface OrderService {

    Order insert(Order order);

    Order select(int id);

    Order update(int id, Order order);

    void delete(int id);

}
