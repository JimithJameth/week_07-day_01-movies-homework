package com.example.user.top10movies;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class MovieTest {
    Movie movie;


    @Before
    public void before() {
        movie = new Movie ("2001 A Space Odessey","Sci fi",3);
        movie = new Movie ("Back To The Future 2","Adventure",2);
        movie = new Movie ("Star Wars","Sci fi",1;)

    }

    @Test
    public void hasTitle() {
        assertEquals("2001 A Space Odessey",movie.getTitle());
    }

    @Test
    public void hasGenre() {
        assertEquals("Sci fi",movie.getGenre());
    }

    @Test
    public void getCurrentRanking() {
        assertEquals(3, movie.getCurrentranking());
    }
}
