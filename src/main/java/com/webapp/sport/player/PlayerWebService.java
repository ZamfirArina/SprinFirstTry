package com.webapp.sport.player;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerWebService {
    PlayerRepository playerRepository = new PlayerRepository();

    @GetMapping
    public List<Player> findAll() {
        return playerRepository.getPlayers();
    }

    @PostMapping
    public void save(@RequestBody Player player) {
        playerRepository.addPlayer(player);
    }

    @PutMapping
    public void updatePlayer(@PathVariable String firstName, @RequestBody Player player) {
        playerRepository.delPlayer(firstName);
        playerRepository.addPlayer(player);
    }

    @DeleteMapping
    public void delPlayer(@PathVariable String firstName) {
        playerRepository.delPlayer(firstName);
    }
}
