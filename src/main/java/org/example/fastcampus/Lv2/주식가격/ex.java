package org.example.fastcampus.Lv2.주식가격;

import java.util.Arrays;

public class ex {
    public int[] solution(int[] prices) {
        int[] answer = {};

        answer = getResult(prices);

        return answer;
    }

    private int[] getResult(int[] prices) {
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int cur = prices[i];

            int term = getTerm(i + 1, cur, prices);

            ans[i] = term;
        }

        return ans;
    }

    private int getTerm(int idx, int cur, int[] prices) {
        int count = 0;

        for (int i = idx; i < prices.length; i++) {
            if (cur > prices[i]) {
                count++;
                break;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution = sol.solution(new int[]{1, 2, 3, 2, 3});

        System.out.println("solution = " + Arrays.toString(solution));
    }
}
