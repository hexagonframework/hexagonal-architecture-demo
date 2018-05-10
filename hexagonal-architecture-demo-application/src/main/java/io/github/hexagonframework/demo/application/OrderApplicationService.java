package io.github.hexagonframework.demo.application;

import io.github.hexagonframework.demo.application.model.PlaceOrderCommand;
import io.github.hexagonframework.demo.domain.model.Order;
import io.github.hexagonframework.demo.domain.model.OrderItem;
import io.github.hexagonframework.demo.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderApplicationService {
    @Resource
    private OrderRepository orderRepository;

    public List<OrderItem> findAllOrderItemByOrderId(long orderId){
        return null;
    }

    public Long placeOrder(PlaceOrderCommand placeOrderCommand) {
        Order order = Order.builder()
                .userId(placeOrderCommand.getUserId())
                .status("INIT")
                .build();
        orderRepository.save(order);
        return order.getOrderId();
    }
}
