package com.delivery.management.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public DeliveryManagementDomainService orderDomainService() {
        return new DeliveryManagementDomainService();
    }
}
