package org.example;

import java.util.Arrays;

public class ex17 {
    int count;
    int[] dp;
    public long solution(int n) {
        long answer = 0;
        count = 0;
        dp = new int[n];

        dfs(n, 1);
        dfs(n, 2);

        answer = count % 1234567;

        return answer;
    }

    public void dfs(int n, int p){
        if(n < p){
            return;
        }
        if(n - p == 0){
            count++;
            return;
        }
        dfs(n - p, 1);
        dfs(n - p, 2);
    }

    public static void main(String[] args) {
        ex17 sol = new ex17();
        long solution = sol.solution(4);
        System.out.println("solution = " + solution);
    }
}
