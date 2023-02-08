package com.factoriaf5.kata;

import java.util.List;
import java.util.Random;

import com.factoriaf5.kata.Player.Player;

public class Referee {
    public Boolean decidedService( List<Player> players){
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
        return decidedService(players);
    }
    public Player decidedPlayerPoint(){
        return null;
    }
}
