package com.example.demo.controller;

import com.example.demo.config.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${app.name}")
    private String appName;

    @Value("${api.base.url}")
    private String baseUrl;

    @Value("${api.timeout}")
    private int timeout;


    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUser;

    @GetMapping
    public String home() {
        return "Welcome to " + appName;
    }

    @GetMapping("/config")
    public String getConfig() {
        return "Base URL: " + baseUrl + ", Timeout: " + timeout + "ms";
    }

    @GetMapping("/db")
    public String getDbInfo() {
        return "Database URL: " + dbUrl + ", User: " + dbUser;
    }
    private final AppConfig appConfig;

    public HomeController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/details")
    public String getAppDetails() {
        return "App: " + appConfig.getName() + ", Version: " + appConfig.getVersion() + ", Author: " + appConfig.getAuthor();
    }
}




