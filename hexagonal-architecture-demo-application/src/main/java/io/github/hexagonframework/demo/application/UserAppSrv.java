package io.github.hexagonframework.demo.application;

import io.github.hexagonframework.demo.domain.User;
import io.github.hexagonframework.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAppSrv {
    @Autowired UserRepository userRepository;

    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
}
