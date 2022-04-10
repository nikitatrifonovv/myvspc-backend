package com.ntsoftware.myvspc.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("news-service", r -> r.path("/news/**").uri("lb://NEWS-SERVICE"))
                .route("news-image-service", r -> r.path("/image/**").uri("lb://NEWS-SERVICE"))
                .route("schedule-service", r -> r.path("/schedule/**").uri("lb://SCHEDULE-SERVICE"))
                .build();
    }
}
