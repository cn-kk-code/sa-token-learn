package com.cloud.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sa-token-provider-base")
public interface UserClient {

    @GetMapping("/user/get")
    String get();
}
