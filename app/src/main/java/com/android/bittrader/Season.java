package com.android.bittrader;

import java.util.Random;

/**
 * Created by Jason on 9/1/2017.
 */

public class Season {
    private int[] events;
    private int[] days;
    private int season;

    /*
        @params: season
        When game starts rng the season by modding time by 4. After each season retrieve the prev
        season and add 1 to get the next season
     */
    public Season(int season){
        this.season = season;
        this.events = this.initializeEvents();
        this.days = this.initializeDays(events);
    }

    /*
        @params: seed
     */
    private int[] initializeEvents(){
        int numOfEvents = (int)(System.currentTimeMillis() % 5 + 1);
        return new int[numOfEvents];
    }

    private int[] initializeDays(int[] events){
        int[] days = new int[29 + (int)(System.currentTimeMillis() % 3)];
        for(int i : events){
            Random rand = new Random();
            int dayOfEvent = rand.nextInt(days.length);
            days[dayOfEvent] = 1;
        }
        return days;
    }

    @Override
    public String toString(){
        switch(season) {
            case 0: return "Spring";
            case 1: return "Summer";
            case 2: return "Fall";
            case 3: return "Winter";
            default: return "Error";
        }
    }

}
