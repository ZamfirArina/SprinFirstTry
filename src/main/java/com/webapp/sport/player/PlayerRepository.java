package com.webapp.sport.player;

import com.webapp.sport.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class PlayerRepository {
    List<Player> players = new ArrayList<>();

    public PlayerRepository() {
        players.add(new Player("Cristian", "Ronaldo", "Portugalia"));
        players.add(new Player("Chilian", "Mbappe", "Franta"));
        players.add(new Player("Zinedin", "Zidan", "Franta"));
        players.add(new Player("Stanciu", "Nicolae", "Romania"));
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void delPlayer(String fName) {
        Predicate<Player> condition = player -> player.getFirstName().equals(fName);
        players.removeIf(condition);

    }
}