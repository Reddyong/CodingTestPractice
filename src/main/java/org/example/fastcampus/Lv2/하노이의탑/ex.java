package org.example.fastcampus.Lv2.하노이의탑;

import java.util.Arrays;

public class ex {
    public int[][] solution(int n) {
        int[][] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[][] solution = sol.solution(2);

        for (int[] solu : solution) {
            System.out.println("solution = " + Arrays.toString(solu));
        }
    }
}
