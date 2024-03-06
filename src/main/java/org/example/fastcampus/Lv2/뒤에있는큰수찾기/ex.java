package org.example.fastcampus.Lv2.뒤에있는큰수찾기;

import java.util.Arrays;
import java.util.Stack;

public class ex {
    Stack<Integer> stack = new Stack<>();
    public int[] solution(int[] numbers) {
        int[] answer = {};

        answer = getResult(numbers);

        return answer;
    }

    private int[] getResult(int[] numbers) {
        int[] ans = new int[numbers.length];


    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{2, 3, 3, 5});
        int[] solution2 = sol.solution(new int[]{9, 1, 5, 3, 6, 2});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
