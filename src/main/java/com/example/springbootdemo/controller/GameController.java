package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Game;
import com.example.springbootdemo.repo.gameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {

    @Autowired
    private com.example.springbootdemo.repo.gameRepository gameRepository;

    public GameController(gameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/game")
    public List<Game> games(){ return (List<Game>) gameRepository.findAll();} //hittar alla spel med all info


  /** ska kunna uppdatera moves, accepted osv**/
    @PutMapping(path = "/game/update")
    public Game editGame (@RequestBody Game game){
        Optional<Game> gameInDatabase = gameRepository.findById((game.getId()));
        if(gameInDatabase.isPresent()){
            gameRepository.save(game);

            return game;
        }else{
            return null;
        }
    }
/** Kan lägga till och ta bort games  **/
    @PostMapping(path = "game/add")
    public Game addGame(@RequestBody Game game){
        gameRepository.save(game);
        return game;
    }

    @DeleteMapping(path = "game/delete")
    public Game deleteUser(@RequestBody Game game){
        gameRepository.delete(game);
        return game;
    }



}
