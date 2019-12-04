package com.webapp.sport.trainer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerWebService {
    TrainerRepository trainerRepository= new TrainerRepository();

    @GetMapping
    public List<Trainer> findAll() {
        return trainerRepository.getTrainers();
    }

        @PostMapping
        public void addTrainer(@RequestBody Trainer trainer) {
            trainerRepository.addTrainer(trainer);
        }

        @PutMapping
    public void uppdateTrainer(@RequestParam String firstName, @RequestBody Trainer trainer) {
            trainerRepository.delTrainer(firstName);
            trainerRepository.addTrainer(trainer);
        }
    @DeleteMapping
    public void delTrainer(@RequestParam String firstName) {
        trainerRepository.delTrainer(firstName);
    }

}
