package org.example.징검다리건너기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int result = 0;
        int low = 0;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCorrect(stones, mid, k)) {
                low = mid + 1;
                result = mid;
            } else {
                high = mid - 1;
            }
        }

        answer = result;

        return answer;
    }

    private boolean isCorrect(int[] stones, int mid, int k) {
        int count = 0;

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] < mid) {
                count++;
                if (count >= k) {
                    return false;
                }
            } else {
                count = 0;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[]{2, 4, 5, 3, 2, 1, 4, 2, 5, 1}, 3);

        System.out.println("solution = " + solution);
    }
}
