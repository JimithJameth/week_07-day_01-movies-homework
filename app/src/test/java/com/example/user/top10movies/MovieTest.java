package com.example.user.top10movies;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class MovieTest {
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;

    @Before
    public void before() {
        movie1 = new Movie ("2001 A Space Odyssey","Sci fi",3);
        movie2 = new Movie ("Back To The Future 2","Adventure",2);
        movie3 = new Movie ("Star Wars","Sci fi",1);
        movie4 = new Movie ("Last Action Hero","Action",4);
        movie5 = new Movie ("Big Trouble In Little China","Action",5);
        movie6 = new Movie ("Rocky 4","Action",6);
        movie7 = new Movie ("Ant Man","Action",7);
        movie8 = new Movie ("Teenage Mutant Ninja Turtles","Action",8);
        movie9 = new Movie ("Waynes World","Comedy",9);
        movie10 = new Movie("Clerks","Comedy",10);
    }

    @Test
    public void hasTitle() {
        assertEquals("2001 A Space Odyssey",movie1.getTitle());
    }

    @Test
    public void hasGenre() {
        assertEquals("Sci fi",movie1.getGenre());
    }

    @Test
    public void getCurrentRanking() {
        assertEquals(3, movie1.getCurrentRanking());
    }

    @Test
     public void setTitle() {
        movie2.setTitle("Star Wars");
        assertEquals("Star Wars",movie2.getTitle());
    }

    @Test
    public void setGenre() {
        movie3.setGenre("Comedy");
        assertEquals("Comedy",movie3.getGenre());
    }

    @Test
    public void setCurrentRanking(){
        movie1.setCurrentRanking(1);
        assertEquals(1,movie1.getCurrentRanking());
    }

    @Test
    public void testToString() {
        String result = "Title:2001 A Space OdysseyGenre:Sci fiCurrentRanking:3";
        assertEquals(movie1.toString(),result);

    }
}
