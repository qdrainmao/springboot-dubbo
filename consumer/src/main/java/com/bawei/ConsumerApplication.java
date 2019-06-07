package com.bawei;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                SpringApplication.run(ConsumerApplication.class, args);
        ConsumerServiceAPI consumerServiceAPI = (ConsumerServiceAPI) run.getBean("consumerServiceAPI");
        consumerServiceAPI.sendMessage("hello");

    }

}
