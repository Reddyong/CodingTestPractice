package org.example.fastcampus.Lv2.튜플;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public int[] solution(String s) {
        int[] answer = {};

        String substring = s.substring(1, s.length() - 1);
        String[] split = substring.split(",");


        System.out.println("split = " + Arrays.toString(split));

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        int[] solution2 = sol.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        int[] solution3 = sol.solution("{{20,111},{111}}");
        int[] solution4 = sol.solution("{{123}}");
        int[] solution5 = sol.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
        System.out.println("solution4 = " + Arrays.toString(solution4));
        System.out.println("solution5 = " + Arrays.toString(solution5));
    }
}
