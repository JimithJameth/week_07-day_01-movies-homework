package com.example.user.top10movies;

/**
 * Created by user on 03/07/2017.
 */

public class Ranking {

    public Movie[] rank;


    public Ranking(){
        rank = new Movie[10];
    }

    public int getLength(){
        int counter = 0;
        for (Movie movie : rank){
            if (movie != null) counter ++;
        }
        return counter;
    }

}



