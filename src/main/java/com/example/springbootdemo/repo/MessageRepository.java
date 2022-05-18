package com.example.springbootdemo.repo;

import com.example.springbootdemo.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, String> {

}

