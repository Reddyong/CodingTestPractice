package org.example.fastcampus.Lv2.도넛과막대그래프;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {
    public int[] solution(int[][] edges) {
        int[] answer = {};



        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[][]{{2, 3}, {4, 3}, {1, 1}, {2, 1}});
        int[] solution2 = sol.solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
