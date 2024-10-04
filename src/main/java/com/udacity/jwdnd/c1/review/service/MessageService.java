package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private List<ChatMessage> chatMessages;

    @PostConstruct
    public void postConstruct() {
        this.chatMessages = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage message = new ChatMessage();
        message.setUsername(chatForm.getUsername());
        if(chatForm.getMessageType() == "Shout") {
            message.setMessage(chatForm.getMessageText().toUpperCase());
        } else if (chatForm.getMessageType() == "Whisper") {
            message.setMessage(chatForm.getMessageText().toLowerCase());
        } else {
            message.setMessage(chatForm.getMessageText());
        }
        this.chatMessages.add(message);
    }

    public List<ChatMessage> getChatMessages() {
        return chatMessages;
    }
}
