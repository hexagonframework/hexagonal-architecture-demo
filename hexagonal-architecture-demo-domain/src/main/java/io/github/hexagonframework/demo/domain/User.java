package io.github.hexagonframework.demo.domain;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String mobile;
    private String password;
}
