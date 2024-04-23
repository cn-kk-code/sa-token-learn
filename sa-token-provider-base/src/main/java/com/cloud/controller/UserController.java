package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 用户管理
 *
 * @author 文学武
 * @version 1.0
 * @date 2024/4/23 11:39
 */
@RestController
public class UserController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/user/get")
    public String get() {
        return "provider port is :" + port;
    }
}
