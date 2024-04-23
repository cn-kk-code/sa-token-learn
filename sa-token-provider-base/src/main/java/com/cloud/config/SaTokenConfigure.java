package com.cloud.config;

/**
 * description SaTokenConfigure <br>
 *
 * @author 文学武 <br>
 * @version 1.0 <br>
 * @date 2024/4/23 18:14 <br>
 */

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.same.SaSameUtil;
import cn.dev33.satoken.util.SaResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * description 权限认证 配置类
 *
 * @author 文学武
 * @version 1.0
 * @date 2024/4/23 18:17
 */
@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    @Bean
    public SaServletFilter getSaServletFilter() {
        return new SaServletFilter()
                .addInclude("/**")
                .addExclude("/favicon.ico")
                .setAuth(obj -> {
                    String token = SaHolder.getRequest().getHeader(SaSameUtil.SAME_TOKEN);
                    SaSameUtil.checkToken(token);
                })
                .setError(e -> SaResult.error(e.getMessage()));
    }
}

