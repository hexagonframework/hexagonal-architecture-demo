package io.github.hexagonframework.demo.rest.service;

import io.github.hexagonframework.demo.application.HelloAppSrv;
import io.github.hexagonframework.demo.application.UserAppSrv;
import io.github.hexagonframework.demo.domain.User;
import io.github.hexagonframework.demo.rest.service.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    HelloAppSrv helloAppSrv;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                helloAppSrv.greeting(name));
    }
}
