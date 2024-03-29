package org.example.현대소프티어.징검다리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex {
    static int N;
    static int result;
    static int[] stones;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        init();
        getAnswer();
        showAnswer();

    }

    private static void showAnswer() {
        System.out.println(result);
    }

    private static void getAnswer() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (stones[i] > stones[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        result = 0;
        stones = new int[N];
        dp = new int[N];
        Arrays.fill(dp, 1);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            stones[i] = Integer.parseInt(st.nextToken());
        }
    }
}
