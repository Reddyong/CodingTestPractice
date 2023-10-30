package org.example.n2배열자르기;

import java.util.*;

public class ex {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) right - (int) left + 1];

        int index = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[index] = (int) Math.max(row, col) + 1;
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(3, 2, 5);
        for (int i : solution1) {
            System.out.println("i = " + i);
        }
        System.out.println("=================");
        int[] solution2 = sol.solution(4, 7, 14);
        for (int i : solution2) {
            System.out.println("i = " + i);
        }
    }
}
