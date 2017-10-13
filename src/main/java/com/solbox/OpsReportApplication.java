package com.solbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableRedisHttpSession
public class OpsReportApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpsReportApplication.class, args);
	}
}
