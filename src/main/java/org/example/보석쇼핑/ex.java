package org.example.보석쇼핑;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ex {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        Set<String> answerSet = new HashSet<>();
        Set<String> compareSet = new HashSet<>();
        for (String gem : gems) {
            answerSet.add(gem);
        }

        for (int i = 0; i < gems.length; i++) {
            for (int j = i; j < gems.length; j++) {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"});
        int[] solution2 = sol.solution(new String[]{"AA", "AB", "AC", "AA", "AC"});
        int[] solution3 = sol.solution(new String[]{"XYZ", "XYZ", "XYZ"});
        int[] solution4 = sol.solution(new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
        System.out.println("solution4 = " + Arrays.toString(solution4));
    }
}
