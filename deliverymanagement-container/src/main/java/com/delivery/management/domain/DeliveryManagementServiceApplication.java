package com.delivery.management.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.delivery.management.dataaccess"})
@EntityScan(basePackages = { "com.delivery.management.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.delivery.management")
public class DeliveryManagementServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeliveryManagementServiceApplication.class, args);
    }
}

