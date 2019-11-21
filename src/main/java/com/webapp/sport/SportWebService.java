package com.webapp.sport;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportWebService {
    TrainersRepository tRep = new TrainersRepository();
    PlayersRepository pRep = new PlayersRepository();

    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }

    @GetMapping("/trainers")
    public List<String> trainersList() {
        return tRep.getTrainers();
    }

    @GetMapping("/players")
    public List<String> playersList() {
        return pRep.getPlayers();
    }

    @PostMapping("addTrainers/{name}")
    public void addTrainers(@PathVariable String name) {
       tRep.addTrainers (name);

    }

    @PutMapping ("/addPlayers/{name}")
    public void addPlayers(@PathVariable("name")String name) {
        pRep.addPlayers(name);

    }

    @DeleteMapping("delPlayers/{name}")
    public void delPlayers(@PathVariable("name") String name) {
        pRep.delPlayers(name);
    }
}