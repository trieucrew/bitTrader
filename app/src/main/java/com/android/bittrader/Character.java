package com.android.bittrader;

/**
 * Created by Jason on 8/31/2017.
 */

class Character {
    private int health;
    private double money;
    private int knowledge;

    public Character(int health, double money, int knowledge) {
        this.health = health;
        this.money = money;
        this.knowledge = knowledge;
    }

    /*
        @param: none
    */
    void exercise(){
        health++;
    }
    /*
        @param: none
    */
    void sleep(){

    }
    /*
        @param: none
    */
    void invest(){}
    /*
        @param: none
    */
    void attendEvent(){}

    void createMeeting(){}

    void research() {
        knowledge++;
    }

    public int getHealth() {
        return health;
    }

    public double getMoney() {
        return money;
    }

    public int getKnowledge() {
        return knowledge;
    }
}
