package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FarewellServiceImpl implements FarewellService {
    @Override
    public String getFarewell() {
        return "Goodbye, Spring Boot!";
    }
}
