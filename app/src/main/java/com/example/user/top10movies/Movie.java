package com.example.user.top10movies;

import java.util.ArrayList;

/**
 * Created by user on 03/07/2017.
 */

public class Movie {
    String title;
    String genre;
    int currentRanking;


    public Movie(String title, String genre, int currentRanking) {

        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;

    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getCurrentRanking(){
        return this.currentRanking;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCurrentRanking(int currentRanking){
        this.currentRanking = currentRanking;
    }
}
