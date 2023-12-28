package org.example.메뉴리뉴얼;

import java.util.Arrays;

public class ex {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String[] solution1 = sol.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});
        String[] solution2 = sol.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5});
        String[] solution3 = sol.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
