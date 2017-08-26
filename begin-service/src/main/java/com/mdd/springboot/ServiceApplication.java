package com.mdd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by madongdong on 2017/8/24.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "ServiceApplication");
        SpringApplication.run(ServiceApplication.class, args);
    }
}
