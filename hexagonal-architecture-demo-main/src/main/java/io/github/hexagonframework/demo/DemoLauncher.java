package io.github.hexagonframework.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import io.github.hexagonframework.demo.application.OrderApplicationService;
import io.github.hexagonframework.demo.application.model.PlaceOrderCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@EnableDubboConfiguration
public class DemoLauncher {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoLauncher.class, args);

        // test only
        for (int userId=1; userId<100; userId++) {
            PlaceOrderCommand placeOrderCommand = new PlaceOrderCommand(userId);
            applicationContext.getBean(OrderApplicationService.class).placeOrder(placeOrderCommand);
        }
    }
}
