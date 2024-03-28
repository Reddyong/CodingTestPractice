package org.example.fastcampus.Lv2.요격시스템;

import java.util.Arrays;

public class ex {
    public int solution(int[][] targets) {
        int answer = 0;

        initTargets(targets);

        return answer;
    }

    private void initTargets(int[][] targets) {
        Arrays.sort(targets, ((o1, o2) -> o1[0] - o2[0]));
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[][]{{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}});

        System.out.println("solution = " + solution);
    }
}
