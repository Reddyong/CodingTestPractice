package org.example.nc코테;

import java.util.Arrays;

public class ex {
    public int[][] solution(int n, int m, int[] fold, int[][] cut) {
        int[][] answer = new int[n][m];

        for (int i = 0; i < answer.length; i++) {
            Arrays.fill(answer[i], 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[][] solution1 = sol.solution(8, 6, new int[]{1, -1, -1}, new int[][]{{1, 1}, {2, 2}, {4, 4,}});
        int[][] solution2 = sol.solution(4, 4, new int[]{1, 1}, new int[][]{{3, 1}});

        for (int[] ints : solution1) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }

        for (int[] ints : solution2) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }

    }
}
