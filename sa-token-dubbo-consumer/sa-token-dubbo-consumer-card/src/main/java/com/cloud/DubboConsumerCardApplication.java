package com.cloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description //TODO
 * @date 2024/3/26 16:50
 * @author 文学武
 * @version 1.0
 */
@EnableDubbo
@SpringBootApplication
public class DubboConsumerCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerCardApplication.class, args);
		System.out.println("Dubbo3ConsumerApplication 启动成功");
	}

}
