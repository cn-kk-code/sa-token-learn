package com.cloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description //TODO
 * @date 2024/3/26 16:50
 * @author aven
 * @version 1.0
 */
@EnableDubbo
@SpringBootApplication
public class DubboConsumerGuardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerGuardApplication.class, args);
		System.out.println("DubboConsumerGuardApplication 启动成功");
	}

}
