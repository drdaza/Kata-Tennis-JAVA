package com.factoriaf5.kata;

import java.util.ArrayList;
import java.util.List;

import com.factoriaf5.kata.Player.Player;


public class Score {
    private List<String> counter;
    
    public Score() {
        this.counter = new ArrayList<>();
        initScore();
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
    public void increaseScore(Player player, Integer position){
        if(player.getPoint()<=2) setCounter(String.format("%s", player.getPoint()*15), position);
        if(player.getPoint()==3) setCounter(String.format("%s", 40), position);
        if(player.getPoint()>3) setCounter("A", position);
    }
}
