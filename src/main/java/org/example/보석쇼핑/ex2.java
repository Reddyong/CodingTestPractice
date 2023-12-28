package org.example.보석쇼핑;

import java.util.*;

public class ex2 {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        int gemLength = gems.length;
        int range = Integer.MAX_VALUE;
        Set<String> answerSet = new HashSet<>(Arrays.asList(gems));
        Map<String, Integer> answerMap = new HashMap<>();

        for (int left = 0, right = 0; left < gemLength; left++) {
            while (right < gemLength && answerMap.size() != answerSet.size()) {
                answerMap.put(gems[right], answerMap.getOrDefault(gems[right++], 0) + 1);
            }

            if (right - left - 1 < range && answerMap.size() == answerSet.size()) {
                answer[0] = left + 1;
                answer[1] = right;
                range = right - left - 1;
            }

            answerMap.put(gems[left], answerMap.get(gems[left]) - 1);

            if (answerMap.get(gems[left]) == 0) {
                answerMap.remove(gems[left]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex2 sol = new ex2();
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
