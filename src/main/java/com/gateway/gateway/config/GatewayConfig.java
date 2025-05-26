package com.gateway.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("userService", r -> r.path("/api/user/**")
                        .uri("lb://userService"))
                .route("productService", r -> r.path("/api/product/**")
                        .uri("lb://productService"))
                .build();
    }
}
