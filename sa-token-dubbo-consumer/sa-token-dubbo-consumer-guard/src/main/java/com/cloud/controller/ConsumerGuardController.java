package com.cloud.controller;

import com.cloud.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
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
@RequestMapping("/consumer/guard")
public class ConsumerGuardController {
    @DubboReference
    private DemoService demoService;
    @RequestMapping("/isLogin")
    public String isLogin() {
        demoService.isLogin("----------- 会话信息 ");
        return "ok";
    }

}
