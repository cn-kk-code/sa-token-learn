package com.cloud.config;

import cn.dev33.satoken.same.SaSameUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * description FeignInterceptor <br>
 *
 * @author 文学武 <br>
 * @version 1.0 <br>
 * @date 2024/4/23 18:25 <br>
 */
@Component
public class FeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(SaSameUtil.SAME_TOKEN, SaSameUtil.getToken());
    }
}
