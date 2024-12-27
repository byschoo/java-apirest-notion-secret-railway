package com.byschoo.apiret_notion_secret.confi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping ("/notionsecrets")
public class NotionSecretController {

    private final NotionConfigurationProperties notionconfig;

    public NotionSecretController (NotionConfigurationProperties notionconfig) {
        this.notionconfig = notionconfig;
    }

    @GetMapping
    public Map<String, String> getSecrets() {
        return Map.of(
            "apiUrl", notionconfig.apiUrl(),
            "authToken", notionconfig.authToken(),
            "ID_Database", notionconfig.ID_Database()
        );
    }
    
}
