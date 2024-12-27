package com.byschoo.apiret_notion_secret;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.byschoo.apiret_notion_secret.confi.NotionConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigurationProperties.class)
public class ApiretNotionSecretApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiretNotionSecretApplication.class, args);
	}

}
