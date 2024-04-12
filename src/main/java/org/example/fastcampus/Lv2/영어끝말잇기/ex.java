package org.example.fastcampus.Lv2.영어끝말잇기;

import java.util.Arrays;

public class ex {
    public int[] solution(int n, String[] words) {
        int[] answer = {};


        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        int[] solution2 = sol.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        int[] solution3 = sol.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
