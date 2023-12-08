package org.example.스티커모으기2;

public class ex {
    public int solution(int sticker[]) {
        int answer = 0;
        int len = sticker.length;

        if (len == 1) {
            return sticker[0];
        }
        if (len == 2) {
            return Math.max(sticker[0], sticker[1]);
        }

        int[] dp1 = new int[sticker.length - 1];
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i = 2; i < dp1.length; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        int[] dp2 = new int[sticker.length];
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int j = 2; j < dp2.length; j++) {
            dp2[j] = Math.max(dp2[j - 1], dp2[j - 2] + sticker[j]);
        }

        answer = Math.max(dp1[dp1.length - 1], dp2[dp2.length - 1]);

        return answer;
    }


    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{14, 6, 5, 11, 3, 9, 2, 10});
        int solution2 = sol.solution(new int[]{1, 3, 2, 5, 4});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
