package io.github.hexagonframework.demo.domain.model;

import lombok.Data;

@Data
public class OrderItem {
    private long orderItemId;

    private long orderId;

    private int userId;

    private String status;
}
