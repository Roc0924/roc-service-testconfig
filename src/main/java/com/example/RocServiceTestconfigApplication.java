package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RefreshScope
public class RocServiceTestconfigApplication {
	@Value("${environment}")
	String appName;

	@RequestMapping("/")
	public String home() {
		return appName;
	}

	public static void main(String[] args) {
		SpringApplication.run(RocServiceTestconfigApplication.class, args);
	}
}
