package org.example.fastcampus.Lv1.명예의전당1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        int[] solution2 = sol.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
