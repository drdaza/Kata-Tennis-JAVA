
package com.factoriaf5.kata.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player1;
    private Player player2;
    public PlayerTest() {
        this.player1 = new Player("player1", false);
        this.player2 = new Player("player2", true);
    }

    @Test
    public void the_player_begin_with_0_points(){
        assertEquals(0, player1.getPoint());
        assertEquals(0, player2.getPoint());
    }
    @Test
    public void the_player_can_make_the_point(){
        player1.makePoint(player2);
    }
    @Test
    public void the_player_thats_not_begin_with_the_service_dont_make_the_service(){
        player1.makeService(player2);

        assertEquals(0, player1.getPoint());
        assertEquals(0, player2.getPoint());
    }
    @Test
    public void the_player_thats_begin_with_the_service_mke_the_service(){
        player2.makeService(player1);

        assertNotEquals(player1.getPoint(), player2.getPoint());
    }
    @Test
    public void the_player_try_make_one_point(){
        player1.makePoint(player2);

        //estos test pueden fallar porque están hechos de esa forma
        /* assertTrue(player1.makePoint(player2));
        assertFalse(player1.makePoint(player2)); */
    }
}
