package io.github.hexagonframework.demo.sql;

import io.github.hexagonframework.demo.domain.model.Order;
import io.github.hexagonframework.demo.domain.model.OrderItem;
import io.github.hexagonframework.demo.domain.repository.OrderRepository;
import io.github.hexagonframework.demo.sql.mapper.OrderItemMapper;
import io.github.hexagonframework.demo.sql.mapper.OrderMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MybatisOrderRepository implements OrderRepository {
    @Resource
    OrderMapper orderMapper;

    @Resource
    OrderItemMapper orderItemMapper;

    @Override
    public void save(Order order) {
        orderMapper.createIfNotExistsTable();
        orderItemMapper.createIfNotExistsTable();
        Assert.notNull(order, "订单不能为空");
        Long orderId = orderMapper.insert(order);
        if (order.sizeOfOrderItems() > 0) {
            List<OrderItem> orderItems = order.getOrderItems();
            for (OrderItem orderItem : orderItems) {
                orderItem.setOrderId(orderId);
                orderItemMapper.insert(orderItem);
            }
        }
    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Order orderOfId(Long id) {
        return null;
    }

    @Override
    public List<OrderItem> allOrderItemsOfOrderId(Long orderId) {
        return null;
    }
}
