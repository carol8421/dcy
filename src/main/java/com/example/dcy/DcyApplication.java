package com.example.dcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 被@SpringBootApplication注解的启动类一定要放在所有的RestController的根路径的package下，@SpringBootApplication只会扫描@SpringBootApplication注解标记类包下及其子包的类，如果不放在根路径下，可以指定下：@SpringBootApplication(scanBasePackages = "com.example.api_demo")
 */
@SpringBootApplication	//spring boot入口注解
public class DcyApplication {

	public static void main(String[] args) {

		SpringApplication.run(DcyApplication.class, args);

	}
}
