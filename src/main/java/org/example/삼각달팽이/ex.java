package org.example.삼각달팽이;

import java.util.ArrayList;
import java.util.List;

public class ex {
    public int[] solution(int n) {
        int[] answer = init(n);


        return answer;
    }

    private static int[] init(int n) {
        int[] answer;
        int size = 0;
        for (int i = 1; i <= n; i++) {
            size += i;
        }
        answer = new int[size];
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(1);
        int[] solution2 = sol.solution(2);
        int[] solution3 = sol.solution(3);

        for (int s1 : solution1) {
            System.out.println("s1 = " + s1);
        }

        System.out.println("======================");

        for (int s2 : solution2) {
            System.out.println("s2 = " + s2);
        }

        System.out.println("======================");

        for (int s3 : solution3) {
            System.out.println("s3 = " + s3);
        }
    }
}
