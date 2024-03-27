package com.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description ConsumerGuardController <br>
 *
 * @author aven <br>
 * @version 1.0 <br>
 * @date 2024/3/26 16:58 <br>
 */
@RestController
@RequestMapping("/card/test")
public class CardTestController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
