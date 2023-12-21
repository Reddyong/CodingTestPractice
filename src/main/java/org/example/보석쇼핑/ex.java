package org.example.보석쇼핑;

import java.util.*;

public class ex {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        int gemLength = gems.length;
        int range = Integer.MAX_VALUE;
        Set<String> answerSet = new HashSet<>(Arrays.asList(gems));
//        Map<String, Integer> answerMap = new HashMap<>();

        for (int left = 0, right = 0; left < gemLength; left++) {
            Set<String> compareSet = new HashSet<>();
            fillCompareSet(gems, compareSet, left, right);
            while (right < gemLength && !compareSet.equals(answerSet)) {
                fillCompareSet(gems, compareSet, left, ++right);
            }

            if (right - left - 1 < range && compareSet.equals(answerSet)) {
                answer[0] = left + 1;
                answer[1] = right;
                range = right - left - 1;
            }
        }

        return answer;
    }

    private void fillCompareSet(String[] gems, Set<String> compareSet, int left, int right) {
        for (int i = left; i < right; i++) {
            compareSet.add(gems[i]);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"});
        int[] solution2 = sol.solution(new String[]{"AA", "AB", "AC", "AA", "AC"});
        int[] solution3 = sol.solution(new String[]{"XYZ", "XYZ", "XYZ"});
        int[] solution4 = sol.solution(new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"});
        int[] solution5 = sol.solution(new String[]{"A", "B", "B", "B", "C", "D", "D", "D", "D", "D", "D", "D", "B", "C", "A"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
        System.out.println("solution4 = " + Arrays.toString(solution4));
        System.out.println("solution5 = " + Arrays.toString(solution5));
    }
}
