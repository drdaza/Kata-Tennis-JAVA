package com.factoriaf5.kata;

import java.util.ArrayList;
import java.util.List;

import com.factoriaf5.kata.Player.Player;

public class Match {
    private Score score;
    private Referee referee;
    private List<Player> players;
    public Match() {
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
    
    public String initGame(Integer numGames){
        
        if(numGames == 3){
            Integer maxPoint = Math.max(players.get(0).getPoint(), players.get(1).getPoint());

            if (maxPoint == players.get(0).getPoint()) {
                return players.get(0).getNickName();
            }
            if (maxPoint == players.get(1).getPoint()) {
                return players.get(1).getNickName();
            }
        }
        if(referee.decidedService(players)){
            players.get(0).makeService(players.get(1));
            score.increaseScore(players.get(0), 0);
        }
        if (!referee.decidedService(players)) {
            players.get(1).makeService(players.get(0));
            score.increaseScore(players.get(1), 1);
        }
        return initGame(numGames+1);
        
    }
    
}
