package io.github.hexagonframework.demo.adapter.sql;

import io.github.hexagonframework.demo.domain.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SqlAdapterConfiguration {
    @Bean
    UserRepository userRepository() {
        return new SqlUserRepository();
    }
}
