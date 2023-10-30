package org.example.행렬의곱셈;

public class ex {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[][] solution1 = sol.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});
        for (int[] ints : solution1) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }
        System.out.println("============================");
        int[][] solution2 = sol.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}});
        for (int[] ints : solution2) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }

    }
}
