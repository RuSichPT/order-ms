package com.github.rusichpt.order.ms.services;

import com.github.rusichpt.order.ms.entities.Order;

public interface OrderService {

    Order insert(Order order);

    Order select(int id);

    Order update(int id, Order order);

    void delete(int id);

}
