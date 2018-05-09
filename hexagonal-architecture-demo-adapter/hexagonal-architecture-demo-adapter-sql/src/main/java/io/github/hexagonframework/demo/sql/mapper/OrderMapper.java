package io.github.hexagonframework.demo.sql.mapper;

import io.github.hexagonframework.demo.domain.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    void createIfNotExistsTable();

    void truncateTable();

    Long insert(Order model);

    void delete(Long orderId);

    void dropTable();
}
