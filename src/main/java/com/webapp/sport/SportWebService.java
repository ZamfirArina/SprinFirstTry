package com.webapp.sport;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/sport")
public class SportWebService {
    PlayerRepository pRep = new PlayerRepository();
    TrainerRepository tRep = new TrainerRepository();


    @GetMapping
    public String test() {
        return "First try in Spring Web"; }

    @GetMapping("/players")
    public List<Player> playersList() {
        return pRep.getPlayers();
    }

    @GetMapping("/trainers")
    public List<Trainer> trainersList() {
        return tRep.getTrainers();
    }

    @PostMapping("/addPlayer")
    public void addPlayer(@RequestBody Player player) {
        pRep.addPlayer(player);
    }

    @PostMapping("addTrainer")
    public void addTrainer(@RequestBody Trainer trainer) {
        tRep.addTrainer(trainer);
    }

    @PutMapping("/updatePlayer/{firstName}")
    public void updatePlayer(@PathVariable String firstName, @RequestBody Player player) {
        pRep.delPlayer(firstName);
        pRep.addPlayer(player);
    }

    @PutMapping("/updateTrainer")
    public void uppdateTrainer(@RequestParam String firstName, @RequestBody Trainer trainer) {
        tRep.delTrainer(firstName);
        tRep.addTrainer(trainer);
    }

    @DeleteMapping("/delPlayer")
    public void delPlayer(@PathVariable("firstName") String firstName) {
        pRep.delPlayer(firstName);
    }

    @DeleteMapping("/delTrainer")
    public void delTrainer(@RequestParam String firstName) {
        tRep.delTrainer(firstName);
    }


}