package com.byschoo.apiret_notion_secret.confi;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("secret")
public record NotionConfigurationProperties(String apiUrl, String authToken, String ID_Database) {

}
