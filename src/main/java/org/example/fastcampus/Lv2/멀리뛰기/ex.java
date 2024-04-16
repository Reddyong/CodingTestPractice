package org.example.fastcampus.Lv2.멀리뛰기;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    long[] dp;
    public long solution(int n) {
        long answer = 0;

        answer = getResult(n);

        return answer;
    }

    private long getResult(int n) {
        dp = new long[n];

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] % 1234567 + dp[i - 2] % 1234567;
        }

        return dp[n - 1] % 1234567;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long solution1 = sol.solution(4);
        long solution2 = sol.solution(3);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
