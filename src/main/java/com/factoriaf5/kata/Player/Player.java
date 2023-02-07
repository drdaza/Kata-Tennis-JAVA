package com.factoriaf5.kata.Player;

import java.util.Random;

public class Player {

    private int point;
    private String nickName;
    private Boolean begin;

    public Player(String nickName, Boolean begin) {
        this.point = 0;
        this.nickName = nickName;
        this.begin = begin;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Boolean getBegin() {
        return begin;
    }

    public void setBegin(Boolean begin) {
        this.begin = begin;
    }

    public void makeService(Player opponent){
        
        if(begin){
            if(makePoint(opponent)) setPoint(getPoint()+1);
            if(!makePoint(opponent)) opponent.setPoint(opponent.getPoint()+1);
        }
    }

    public Boolean makePoint(Player opponent){
        if(!opponent.punchBall()){
            return true;
        } 
        if(opponent.punchBall() && !punchBall()){
            return false;
        }
        return makePoint(opponent);  
    }

    public Boolean punchBall(){
        Random numAleatorio = new Random();

        boolean punch = numAleatorio.nextBoolean();

        if(punch) return true;

        return false;
    }

    

    
}
