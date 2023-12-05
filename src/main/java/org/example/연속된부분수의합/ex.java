package org.example.연속된부분수의합;

import java.util.*;

public class ex {

    public int[] solution(int[] sequence, int k) {
        int seqLength = sequence.length;
        int startIdx = 0;
        int endIdx = seqLength;
        int sum = 0;

        for (int i = 0, j = 0; i < seqLength; i++) {
            while (j < seqLength && sum < k) {
                sum += sequence[j++];
            }

            if (sum == k) {
                int range = j - i - 1;
                if ((endIdx - startIdx) > range) {
                    startIdx = i;
                    endIdx = j - 1;
                }
            }

            sum -= sequence[i];
        }

        int[] answer = {startIdx, endIdx};

        return answer;
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
