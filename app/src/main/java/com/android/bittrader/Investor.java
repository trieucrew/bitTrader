package com.android.bittrader;

import java.lang.*;

/**
 * Created by Jason on 8/31/2017.
 */

public class Investor extends Character {

    /*
        @params: none
        Initialized Investor object
     */
    public Investor() {
        super(10, 10000.00, 0);
    }

    /*
        @params: none
        Increases max health
     */
    public void exercise(){
        super.exercise();
    }

    /*
        @params: none
        Ends the day and resets health
     */
    public void sleep(){
        super.sleep();
    }

    /*
        @params: none
        Investment
     */
    public void invest(){
        super.invest();
    }

    public void attendEvent(){
        super.attendEvent();
    }

    public void research(){
        super.research();
    }

    public int getHealth(){
        return super.getHealth();
    }

    public double getMoney(){
        return super.getMoney();
    }

    public int getKnowledge(){
        return super.getKnowledge();
    }

}
