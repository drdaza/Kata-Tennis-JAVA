package com.factoriaf5.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.factoriaf5.kata.Player.Player;

public class Score {
    private List<Integer> counter;
    private List<Player> players;
    
    public Score() {
        this.counter = new ArrayList<>();
        initScore();
        this.players = new ArrayList<>();

    }
    
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        this.players.add(player);
    }

    public List<Integer> getCounter() {
        return counter;
    }

    public void setCounter(Integer counter, Integer position) {
        this.counter.add(position, counter);
    }

    public void initScore(){
        this.counter.add(0);
        this.counter.add(0);
    }

    public Boolean decidedService(){
        Random numAleatorio = new Random();

        boolean coin = numAleatorio.nextBoolean();

        if(coin){
            players.get(0).setBegin(true);
            players.get(1).setBegin(false);
            return true;
        }
        if (!coin) {
            players.get(0).setBegin(false);
            players.get(1).setBegin(true);
            return false;
        }
        return decidedService();
    }
    
    public void InitGame(){
        decidedService();

        // crear una clase que dependiendo si hacen o no puntos uno u otro player 
        // me retorne el que puntuo para saber cual de los scores aumento 
    }
}
