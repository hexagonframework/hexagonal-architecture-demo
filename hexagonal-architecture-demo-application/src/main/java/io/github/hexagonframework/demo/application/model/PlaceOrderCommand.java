package io.github.hexagonframework.demo.application.model;

import lombok.Value;

import java.util.List;

@Value
public class PlaceOrderCommand {
    private int userId;
}
