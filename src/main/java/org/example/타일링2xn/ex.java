package org.example.타일링2xn;

import java.util.Arrays;

public class ex {
    public int solution(int n) {
        int answer = 0;
        int[] tile = new int[n + 1];
        tile[0] = 1;
        tile[1] = 1;

        for (int i = 2; i < tile.length; i++) {
            tile[i] = tile[i - 1] % 1000000007 + tile[i - 2] % 1000000007;
        }

        answer = tile[n] % 1000000007;

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(4);

        System.out.println("solution = " + solution);
    }
}
