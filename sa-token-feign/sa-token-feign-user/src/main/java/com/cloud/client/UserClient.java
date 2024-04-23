package com.cloud.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sa-token-service-base")
public interface UserClient {

    @GetMapping("/user/get")
    String get();
}
