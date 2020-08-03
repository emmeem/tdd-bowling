package com.twu;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
	public void get_score_no_spare_no_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumList = asList(1, 4, 1, 5, 3, 1, 1, 4, 1, 8, 1, 6, 1, 3, 2,
        7, 1, 4, 1, 6);

    // WHEN
    int total = BowlingScoreCalculator.calculateScore(knockdownBottlesNumList);

    // THEN
    int expected = 61;
    assertEquals(expected, total);
  }
    @Test
    public void get_score_have_spare_no_strike_knockdown_bottles_number_list() {

        // GIVEN
        List<Integer> knockdownBottlesNumList = asList(1, 1, 2, 7, 1, 1, 1, 1, 5, 5, 1, 1, 1, 1, 4,
                6, 1, 1, 1, 1);

        // WHEN
        int total = BowlingScoreCalculator.calculateScore(knockdownBottlesNumList);

        // THEN
        int expected = 45;
        assertEquals(expected, total);
    }

    @Test
    public void get_score_no_spare_have_strike_knockdown_bottles_number_list() {

        // GIVEN
        List<Integer> knockdownBottlesNumList = asList(10, 2, 6, 10, 1, 4, 3, 1, 10, 1, 6, 1,
                1, 1, 5, 1, 1);

        // WHEN
        int total = BowlingScoreCalculator.calculateScore(knockdownBottlesNumList);

        // THEN
        int expected = 84;
        assertEquals(expected, total);
    }

    @Test
    public void get_score_have_spare_have_strike_knockdown_bottles_number_list() {

        // GIVEN
        List<Integer> knockdownBottlesNumList = asList(10, 1, 1, 4, 6, 1, 5, 1, 1, 10, 1, 1,
                1, 3, 7, 2, 1, 1);

        // WHEN
        int total = BowlingScoreCalculator.calculateScore(knockdownBottlesNumList);

        // THEN
        int expected = 62;
        assertEquals(expected, total);
    }

    @Test
    public void get_score_all_spare_knockdown_bottles_number_list() {

        // GIVEN
        List<Integer> knockdownBottlesNumList = asList(1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 9, 1, 8, 2, 7,
                3, 6, 4, 5, 5, 9);

        // WHEN
        int totalScore = BowlingScoreCalculator.calculateScore(knockdownBottlesNumList);

        // THEN
        int expectedScore = 158;
        assertEquals(expectedScore, totalScore);
    }

    @Test
    public void get_score_all_strike_knockdown_bottles_number_list() {

        // GIVEN
        List<Integer> knockdownBottlesNumList = asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10);

        // WHEN
        int totalScore = BowlingScoreCalculator.calculateScore(knockdownBottlesNumList);

        // THEN
        int expectedScore = 300;
        assertEquals(expectedScore, totalScore);
    }
}
