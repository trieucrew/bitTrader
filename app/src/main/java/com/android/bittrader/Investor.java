package com.android.bittrader;

/**
 * Created by Jason on 8/31/2017.
 */

public class Investor implements Character {
    private int health;
    private double money;
    private int knowledge;

    /*
        @params: none
        Initialized Investor object
     */
    void Investor(){
        health = 10;
        money = 10000.00;
        knowledge = 0;
    }

    /*
        @params: none
        Increases max health
     */
    @Override
    public void exercise(){
        health++;
    }

    /*
        @params: none
        Ends the day and resets health
     */
    @Override
    public void sleep(){
       health = 10;
    }

    /*
        @params: none
        Investment
     */
    @Override
    public void invest(){
        health -= 3;
    }

    @Override
    public void attendEvent(){}

    @Override
    public void research(){
        knowledge++;
    }


}
