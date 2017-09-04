package com.android.bittrader;

/**
 * Created by Jason on 8/31/2017.
 */

class Character {
    private int health;
    private int moves;
    private double money;
    private int knowledge;

    public Character(int health, int moves, double money, int knowledge) {
        this.health = health;
        this.moves = moves;
        this.money = money;
        this.knowledge = knowledge;
    }

    /*
        @param: none
        Spend one health point to regain one health point, updates stocks
    */
    void exercise(){
        moves--;
        health++;
        //Update stocks
    }

    /*
        @param: none
        Ends the day and restores half of health spent during that day
    */
    void sleep(){
        health += (10 - health)/2;
    }

    /*
        @param: none
        Lets user invest in market for two move points, updates socks
    */
    void invest(){
        moves -= moves - 2;
        //Updates stocks
    }

    /*
        @param: int cost - How much it costs to attend the talk
        Attends event and gain knowledge, ends day
    */
    void attendEvent(int cost){
        moves -= cost;
        knowledge += (cost - 3);
        //End day and update health
    }

    /*
        @param: none
        Sets up a meeting this season, update stocks
     */
    void createMeeting(){}

    /*
        @param: none
        Increases knowledge by one point
     */
    void research() {

        knowledge++;
        //Updates stocks
    }

    /*
        @param: none
        Resets moves back to full if above four
     */
    void refreshMoves () {
        //Updates moves if tired
        moves = 10;
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
