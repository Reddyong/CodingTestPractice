package org.example.fastcampus.Lv2.연속된부분수열의합;

import java.util.Arrays;

public class ex {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};


        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{1, 2, 3, 4, 5}, 7);
        int[] solution2 = sol.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5);
        int[] solution3 = sol.solution(new int[]{2, 2, 2, 2, 2}, 6);

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));

    }
}
