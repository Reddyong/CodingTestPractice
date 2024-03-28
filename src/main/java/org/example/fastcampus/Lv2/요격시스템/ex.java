package org.example.fastcampus.Lv2.요격시스템;

import java.util.Arrays;

public class ex {
    public int solution(int[][] targets) {
        int answer = 0;

        initTargets(targets);
        answer = getMissileNum(targets);

        return answer;
    }

    private int getMissileNum(int[][] targets) {
        int ans = 1;
        int start = targets[0][0];
        int end = targets[0][1];

        for (int i = 1; i < targets.length; i++) {
            int s = targets[i][0];
            int e = targets[i][1];

            if (s >= end) {
                start = s;
                end = e;
                ans++;
                continue;
            }

            if (s < end && e >= end) {
                start = s;
                continue;
            }

            if (s < end && e < end) {
                start = s;
                end = e;
                continue;
            }
        }

        return ans;
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
