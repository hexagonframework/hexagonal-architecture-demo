package io.github.hexagonframework.demo.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Order {
    private Long orderId;

    private int userId;

    private String status;

    private List<OrderItem> orderItems;

    public void addOrderItem(OrderItem orderItem) {
        if (orderItems == null) {
            orderItems = new ArrayList<>();
        }
        orderItems.add(orderItem);
    }

    public void clearOrderItems() {
        if (orderItems != null) {
            orderItems.clear();
        }
    }

    public int sizeOfOrderItems() {
        int size = 0;
        if (orderItems != null) {
            size = orderItems.size();
        }
        return size;
    }
}
