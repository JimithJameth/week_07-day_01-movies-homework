package com.example.user.top10movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/07/2017.
 */
public class RankingTest {


    Ranking ranking;
    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Star Wars", "Sci fi", 1);
        ranking = new Ranking();
    }

    @Test
    public void emptyArray() {
        assertEquals(0, ranking.getLength());
    }
}

