package io.github.hexagonframework.demo.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import io.github.hexagonframework.demo.dubbo.api.HelloService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = HelloService.class)
@Component
public class DubboHelloService implements HelloService {
    public String say(String words) {
        return "Hello " + words;
    }
}
