package org.example.삼각달팽이;

import java.util.ArrayList;
import java.util.List;

public class ex {
    public int[] solution(int n) {
        int[] answer = init(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isLastLine(n, list, i)) {
                break;
            }
            isFirstLine(list, i);
            isSecondLine(n, list, i);
        }

        getAnswer(answer, list);

        return answer;
    }

    private static void getAnswer(int[] answer, List<Integer> list) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
    }

    private static void isSecondLine(int n, List<Integer> list, int i) {
        if (i == 2) {
            list.add(2);
            list.add(3 * (n - 1));
        }
    }

    private static void isFirstLine(List<Integer> list, int i) {
        if (i == 1) {
            list.add(1);
        }
    }

    private static boolean isLastLine(int n, List<Integer> list, int i) {
        if (i == n) {
            for (int j = n; j <= n + n - 1; j++) {
                list.add(j);
            }
            return true;
        }
        return false;
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
