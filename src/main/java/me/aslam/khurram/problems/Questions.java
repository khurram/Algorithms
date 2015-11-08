package me.aslam.khurram.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questions {

    private static Character firstNonRepeatingChar(String input) {
        char[] charInput = input.toCharArray();
        Map<Character, Integer> frequency = new HashMap<>();
        for (char character : charInput) {
            if (frequency.containsKey(character)) {
                frequency.put(character, frequency.get(character) + 1);
            } else {
                frequency.put(character, 1);
            }
        }
        for (char character : charInput) {
            int freq = frequency.get(character);
            if (freq == 1) {
                return character;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] S = { 4, 7, 1, 12, 5, 2, 6, 8 };
        int[] Snegative = { 8, 7, 6, 5, 4, 3, 2, 1 };
        List<Integer> result = bestTrade(S);
        List<Integer> result2 = bestTrade(Snegative);
        System.out.println(result);
        System.out.println(result2);
    }

    private static List<Integer> bestTrade(int[] S) {
        List<Integer> bestTrade = new ArrayList<>();
        int difference = 0;
        int buy = 0;
        int sell = 0;
        for (int i = 0; i < S.length; i++) {
            for (int j = i + 1; j < S.length; j++) {
                int newDifference = S[j] - S[i];
                if (newDifference > difference) {
                    difference = newDifference;
                    buy = i;
                    sell = j;
                }
            }
        }
        bestTrade.add(buy);
        bestTrade.add(sell);
        return bestTrade;
    }

    private static List<Integer> bestNegativeTrade(int[] Snegative) {
        List<Integer> bestTrade = new ArrayList<>();
        if (Snegative.length < 2) {
            System.out.println("Error");
        }

        int minPrice = Snegative[0];
        int maxProfit = Snegative[1] - Snegative[0];

        for (int i = 1; i < Snegative.length; i++) {
            int potentialProfit = Snegative[i] - minPrice;
            // maxProfit =
        }

        return bestTrade;
    }

}