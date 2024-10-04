package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    //POJO to store chat message and user
    private String username;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
