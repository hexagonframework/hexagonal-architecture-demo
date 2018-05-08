package io.github.hexagonframework.demo.domain;

public interface UserRepository {
    User findByUsername(String username);
}
