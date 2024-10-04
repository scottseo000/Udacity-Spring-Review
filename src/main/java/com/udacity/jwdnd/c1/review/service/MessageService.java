package com.udacity.jwdnd.c1.review.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private String Message;

    public MessageService(String message) {
        this.Message = message;
    }

    public String uppercase() {
        return this.Message.toUpperCase();
    }

    public String lowercase() {
        return this.Message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }
}
