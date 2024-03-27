package com.cloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description //TODO
 * @date 2024/3/26 16:28
 * @author 文学武
 * @version 1.0
 */
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
		System.out.println("DubboProviderApplication 启动成功");
	}
	
}
