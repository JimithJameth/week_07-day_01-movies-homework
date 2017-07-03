package com.example.user.top10movies;

import java.util.ArrayList;

/**
 * Created by user on 03/07/2017.
 */

public class Movie {
    String title;
    String genre;
    int currentranking;


    public Movie(String title, String genre, int currentranking) {

        this.title = title;
        this.genre = genre;
        this.currentranking = currentranking;

    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getCurrentranking(){
        return this.currentranking;
    }



}
