package com.github.rusichpt.order.ms.mappers;

import com.github.rusichpt.order.ms.entities.OrderItem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderItemMapper {

    void insertOrderItemsByOrderId(int orderId, List<OrderItem> orderItemList);

    void updateOrderItems(List<OrderItem> orderItemList);

    void deleteOrderItems(List<OrderItem> orderItemList);

}
