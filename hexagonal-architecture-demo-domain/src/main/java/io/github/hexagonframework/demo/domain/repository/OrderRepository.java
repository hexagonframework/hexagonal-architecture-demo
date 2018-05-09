package io.github.hexagonframework.demo.domain.repository;

import io.github.hexagonframework.demo.domain.model.Order;
import io.github.hexagonframework.demo.domain.model.OrderItem;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    void update(Order order);
    void delete(Long id);
    Order orderOfId(Long id);
    List<OrderItem> allOrderItemsOfOrderId(Long orderId);
}
