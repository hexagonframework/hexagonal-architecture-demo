package io.github.hexagonframework.demo.adapter.sql;

import io.github.hexagonframework.demo.domain.User;
import io.github.hexagonframework.demo.domain.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SqlUserRepository implements UserRepository {
    @Override
    public User findByUsername(String username) {
        User user = new User();
        return user;
    }
}
