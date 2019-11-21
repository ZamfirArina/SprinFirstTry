package com.webapp.sport;

import java.util.ArrayList;
import java.util.List;

public class PlayersRepository {
    List<String> players = new ArrayList<>();

    public PlayersRepository() {
        players.add("Alex");
        players.add("Cristian");
        players.add("Andrei");
        players.add("Mihai");
        players.add("Emil");
    }

    public List<String> getPlayers() {
        return players;
    }

    public void addPlayers(String name) {
        players.add(name);
    }

    public void delPlayers(String name) {
        players.remove(name);

    }
}