package com.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.cors.reactive.CorsUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * description //TODO
 *
 * @author aven
 * @version 1.0
 * @date 2021/1/12 16:10
 */

@Configuration
public class CorsConfig {
    private static final String MAX_AGE = "18000L";

    @Bean
    public WebFilter corsFilter() {
        return (ServerWebExchange ctx, WebFilterChain chain) -> {
            ServerHttpRequest request = ctx.getRequest();
            if (CorsUtils.isCorsRequest(request)) {
                HttpHeaders requestHeaders = request.getHeaders();
                ServerHttpResponse response = ctx.getResponse();
                HttpHeaders headers = response.getHeaders();

                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, requestHeaders.getOrigin());
                headers.addAll(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, requestHeaders.getAccessControlRequestHeaders());

                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET");
                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "POST");
                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "DELETE");
                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "PUT");
                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "OPTIONS");

                headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS, "false");
                headers.add(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "*");
                headers.add(HttpHeaders.ACCESS_CONTROL_MAX_AGE, MAX_AGE);
                if (request.getMethod() == HttpMethod.OPTIONS) {
                    response.setStatusCode(HttpStatus.OK);
                    return Mono.empty();
                }
            }
            return chain.filter(ctx);
        };
    }
}
