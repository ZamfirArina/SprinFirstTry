package com.webapp.sport;

import java.util.List;
import java.util.ArrayList;

public class TrainersRepository {
    List<String> trainers = new ArrayList<>();

    public TrainersRepository() {
        trainers.add("Ion");
        trainers.add("Pavel");
        trainers.add("Denis");
        trainers.add("Petru");
        trainers.add("Eduard");
    }

    public List<String> getTrainers() {
        return trainers;
    }

    public void addTrainers(String name) {
        trainers.add(name);
    }
}