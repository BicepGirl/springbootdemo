package com.example.springbootdemo.repo;

import com.example.springbootdemo.entity.Game;
import org.springframework.data.repository.CrudRepository;

public interface gameRepository extends CrudRepository<Game, String> {


}
