package org.example.fastcampus.Lv2.무인도여행;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex {
    public int[] solution(String[] maps) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"});
        int[] solution2 = sol.solution(new String[]{"XXX", "XXX", "XXX"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
