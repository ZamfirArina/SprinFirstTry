package com.webapp.sport;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TrainerRepository {
    List<Trainer> trainers = new ArrayList<>();

    public TrainerRepository() {
        trainers.add(new Trainer("Zeinep","Artur",30));
        trainers.add(new Trainer("Tratan","Emil",25));
        trainers.add(new Trainer("Metan","Artiom",42));
        trainers.add(new Trainer("Corbo","Eduard",35));
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void addTrainer(Trainer trainer ){
        trainers.add(trainer);
    }
    public void delTrainer(String fName) {
        Predicate<Trainer> condition = trainer -> trainer.getFirstName().equals(fName);
        trainers.removeIf(condition);
    }

}