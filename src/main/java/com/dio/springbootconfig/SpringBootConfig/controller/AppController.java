package com.dio.springbootconfig.SpringBootConfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;

    }

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "A variável de ambiente passada foi: " + dbEnvironmentVariable;
    }
}
