package com.cloud.controller;

import com.cloud.client.UserClient;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Resource
    private UserClient userClient;

    @GetMapping("/get")
    public String get() {
        return userClient.get();
    }
}
