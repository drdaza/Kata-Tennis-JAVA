package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.factoriaf5.kata.Player.Player;

public class MatchTest {
    private Match match;
    private Player player1;
    private Player player2;
    private Referee referee;
    

    public MatchTest() {
        this.match = new Match();
        this.player1 = new Player("Nadal", false);
        this.player2 = new Player("Federer", false);
        this.referee = new Referee();

        this.match.setPlayers(player1);
        this.match.setPlayers(player2);
        this.match.setReferee(referee);
    }


    @Test
    public void test_game(){
        String winner = match.initGame(0);

        System.out.println(winner);
        System.out.println(match.getPlayers().get(0).getPoint());
        System.out.println(match.getPlayers().get(1).getPoint());
        assertNotEquals(match.getPlayers().get(0).getPoint(), match.getPlayers().get(1).getPoint());
    }
}
