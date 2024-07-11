package org.example.fastcampus.Lv2.연속된부분수열의합;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ex {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};

        answer = getSumIdx(sequence, k);

        return answer;
    }

    private int[] getSumIdx(int[] sequence, int k) {
        int[] ans = new int[2];
        int sum = 0;
        int len = Integer.MAX_VALUE;

        for (int i = 0, j = 0; i < sequence.length; i++) {
            while (sum < k && j < sequence.length) {
                sum += sequence[j++];
            }

            if (sum == k) {
                int temp = j - 1 - i;
                if (temp < len) {
                    len = temp;
                    ans[0] = i;
                    ans[1] = j - 1;
                }
            }

            sum -= sequence[i];
        }

        return ans;
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
