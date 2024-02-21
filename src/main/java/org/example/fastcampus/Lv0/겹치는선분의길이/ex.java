package org.example.fastcampus.Lv0.겹치는선분의길이;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] check = new int[200];

        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;

            for (int i = start; i < end; i++) {
                check[i]++;
            }
        }

        for (int c : check) {
            if (c > 1) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        int solution2 = sol.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}});
        int solution3 = sol.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
