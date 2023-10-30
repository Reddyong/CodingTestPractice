package org.example;

import java.util.Arrays;

public class ex6 {
    public String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");
        int[] newSplit = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            int ans = Integer.parseInt(split[i]);
            newSplit[i] = ans;
        }

        Arrays.sort(newSplit);
        answer = Integer.toString(newSplit[0]) + " " + Integer.toString(newSplit[newSplit.length - 1]);
        return answer;
    }
    public static void main(String[] args) {
        ex6 sol = new ex6();
        String solution = sol.solution("3 1 2 7");
        System.out.println("solution = " + solution);
    }
}
