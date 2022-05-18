package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Message;
import com.example.springbootdemo.repo.MessageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/messages")
    public Iterable<Message> messages(){return messageRepository.findAll();

    }

    @PostMapping(path = "/messages/add")
    public Message findMessages (@RequestBody Message message){
        messageRepository.save(message);
        return message;
    }



}
