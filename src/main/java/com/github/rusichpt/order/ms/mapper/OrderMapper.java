package com.github.rusichpt.order.ms.mapper;

import com.github.rusichpt.order.ms.entity.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper {
    void insertOrder(Order order);

    Order selectOrder(int id);

    Order selectCurrentOrder();

    void updateOrder(Order order);

    void deleteOrder(int id);
}
