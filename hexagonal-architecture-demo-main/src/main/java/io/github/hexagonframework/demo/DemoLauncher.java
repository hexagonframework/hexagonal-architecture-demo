package io.github.hexagonframework.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import io.github.hexagonframework.demo.adapter.sql.SqlAdapterConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDubboConfiguration
public class DemoLauncher {
    public static void main(String[] args) {
        SpringApplication.run(DemoLauncher.class, args);
    }
}
