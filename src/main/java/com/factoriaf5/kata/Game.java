package com.factoriaf5.kata;

import java.util.ArrayList;
import java.util.List;

import com.factoriaf5.kata.Player.Player;

public class Game {
    private Score score;
    private Referee referee;
    private List<Player> players;
    public Game() {
        this.players = new ArrayList<>();
        this.score = new Score();
        this.referee = new Referee();
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        this.players.add(player);
    }
    public Score getScore() {
        return score;
    }
    public void setScore(Score score) {
        this.score = score;
    }
    public Referee getReferee() {
        return referee;
    }
    public void setReferee(Referee referee) {
        this.referee = referee;
    }
    
    public void initGame(){
        
        if(referee.decidedService(players)){
            players.get(0).makeService(players.get(1));
        }
        if (!referee.decidedService(players)) {
            players.get(1).makeService(players.get(0));
        }


    }
    
}
