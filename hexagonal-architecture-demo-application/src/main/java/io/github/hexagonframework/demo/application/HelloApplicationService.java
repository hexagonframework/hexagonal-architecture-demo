package io.github.hexagonframework.demo.application;

import com.alibaba.dubbo.config.annotation.Reference;
import io.github.hexagonframework.demo.dubbo.api.HelloService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class HelloApplicationService {
    private final AtomicLong counter = new AtomicLong();

    @Reference(url = "dubbo://127.0.0.1:20880", lazy = true)
    HelloService helloService;

    public String greeting(String name) {
        return helloService.say(name);
    }
}
