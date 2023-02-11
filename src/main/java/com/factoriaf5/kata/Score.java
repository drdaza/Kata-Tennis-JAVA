package com.factoriaf5.kata;

import java.util.ArrayList;
import java.util.List;

import com.factoriaf5.kata.Player.Player;


public class Score {
    private List<String> counter;
    private List<Integer> counterGame;
    private List<Integer> counterSet;
    
    public Score() {
        this.counter = new ArrayList<>();
        initScore();
        this.counterGame = new ArrayList<>();
        initCounterGmae();
        this.counterSet = new ArrayList<>();
    }
    public List<Integer> getCounterGame() {
        return counterGame;
    }

    public void setCounterGame(Integer counter, Integer position) {
        this.counterGame.add(counter, position);
    }


    public List<Integer> getCounterSet() {
        return counterSet;
    }

    public void setCounterSet(Integer counter, Integer position) {
        this.counterSet.add(position, counter);
    }

    

    public List<String> getCounter() {
        return counter;
    }

    public void setCounter(String counter, Integer position) {
        this.counter.add(position, counter);
    }

    public void initScore(){
        this.counter.add("0");
        this.counter.add("0");
    }
    public void initCounterGmae(){
        this.counterGame.add(0);
        this.counterGame.add(0);
    }
    public void initCounterSet(){
        this.counterSet.add(0);
        this.counterSet.add(0);
    }
    public void increaseScore(Player player, Integer position){
        if(player.getPoint()<=2) setCounter(String.format("%s", player.getPoint()*15), position);
        if(player.getPoint()==3) setCounter(String.format("%s", 40), position);
        if(player.getPoint()>3) setCounter("A", position);
    }
    public void increaseCounterGame(Player player1, Player player2){
        if((player1.getPoint() > 4 && player2.getPoint()<3)) setCounterGame(counterGame.get(0)+1, 0);
        
    }
}
