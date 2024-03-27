package com.cloud.service;

import cn.dev33.satoken.stp.StpUtil;
import com.cloud.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * description DemoServiceImpl <br>
 *
 * @author aven <br>
 * @version 1.0 <br>
 * @date 2024/3/26 16:38 <br>
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public void doLogin(Object loginId) {
        StpUtil.login(loginId);
    }

    @Override
    public void isLogin(String str) {
        System.out.println(str);
        System.out.println("Token值：" + StpUtil.getTokenValue());
        System.out.println("是否登录：" + StpUtil.isLogin());
    }

}
