package com.example.springbootdemo.repo;

import com.example.springbootdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}

