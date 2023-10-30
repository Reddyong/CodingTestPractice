package org.example.숫자변환하기;

public class exDP {
    public int solution(int x, int y, int n) {
        int answer = 0;

        int[] dp = new int[y + 1];

        for (int i = x; i < y + 1; i++) {
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }

            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }
            if (i * 3 <= y) {
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }
            if (i + n <= y) {
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
        }

        return dp[y];
    }

    public static void main(String[] args) {
        exDP sol = new exDP();
        int solution1 = sol.solution(10, 40, 5);
        int solution2 = sol.solution(10, 40, 30);
        int solution3 = sol.solution(2, 5, 4);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
