package io.github.hexagonframework.demo.sql.mapper;

import io.github.hexagonframework.demo.domain.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    void createIfNotExistsTable();

    void truncateTable();

    Long insert(OrderItem model);

    void delete(Long orderItemId);

    List<OrderItem> selectAll();

    void dropTable();
}
