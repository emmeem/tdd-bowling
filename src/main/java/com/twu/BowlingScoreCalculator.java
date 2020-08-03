package com.twu;

import java.util.ArrayList;
import java.util.List;

public class BowlingScoreCalculator {

    private static final int num_of_bottles = 10;
    private static final int round_num = 10;

    public static int calculateScore(List<Integer> knockdownBottlesNumList) {
        List<Integer> extraList = new ArrayList<>();
        int round = 1;
        int total_score=0;
        for (int times = 0; times < knockdownBottlesNumList.size() - 1 && round <= round_num - 1; ) {
            Integer knockdownBottlesNumber = knockdownBottlesNumList.get(times);

            round+=1;
            //strike
            if (knockdownBottlesNumber == num_of_bottles) {
                extraList.add(knockdownBottlesNumList.get(times + 1));
                extraList.add(knockdownBottlesNumList.get(times + 2));
                times +=1;
                continue;
            }
            //spare
            Integer nextKnockdownBottlesNumber = knockdownBottlesNumList.get(times + 1);
            if (knockdownBottlesNumber + nextKnockdownBottlesNumber == num_of_bottles) {
                extraList.add(knockdownBottlesNumList.get(times + 2));
            }

            times += 2;
        }

        extraList.addAll(knockdownBottlesNumList);
        for(int i=0; i<extraList.size(); i++){
            total_score += extraList.get(i);
        }
        return total_score;
    }
}
