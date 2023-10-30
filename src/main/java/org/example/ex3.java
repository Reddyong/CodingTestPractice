package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex3 {
    boolean[] check;
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - (lost.length);
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // reserve = {1,3,5}
        // lost = {1,2,4}
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = -100;
                    lost[j] = -100;
                }
            }
        }
        // reserve = {-100,3,5}
        // lost = {-100,2,4}
        for (int a = 0; a < lost.length; a++) {
            if (lost[a] == -100) {
                continue;
            }
            for (int b = 0; b < reserve.length; b++) {
                if (reserve[b] == -100) {
                    continue;
                }
                if ((lost[a] + 1 == reserve[b]) || (lost[a] - 1 == reserve[b]) && lost[a] != 100 && reserve[b] != 100) {
                    answer++;
                    lost[a] = -100;
                    reserve[b] = -100;
                }
            }

        }


        for (int i : lost) {
            System.out.println("lost = " + i);
        }
        for (int i : reserve) {
            System.out.println("reserve = " + i);
        }

        return answer;
    }
    public static void main(String[] args) {
        ex3 sol = new ex3();
        int solution1 = sol.solution(5, new int[]{1, 2, 4}, new int[]{1, 3, 5});
        System.out.println("solution1 = " + solution1);
        int solution2 = sol.solution(5, new int[]{2, 4}, new int[]{3});
        System.out.println("solution2 = " + solution2);
    }
}
