package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description BaseProviderApplication <br>
 *
 * @author 文学武 <br>
 * @version 1.0 <br>
 * @date 2024/4/23 11:32 <br>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BaseProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseProviderApplication.class, args);
    }
}
