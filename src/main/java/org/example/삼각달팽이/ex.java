package org.example.삼각달팽이;

import java.util.ArrayList;
import java.util.List;

public class ex {
    public int[] solution(int n) {
        int[] answer = init(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            isFirstLine(list, i);
            isSecondLine(n, list, i);
            isLastLine(n, list, i);
        }
        return answer;
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

    private static void isLastLine(int n, List<Integer> list, int i) {
        if (i == n) {
            for (int j = 0; j < n; j++) {
                list.add(i + j);
            }
        }
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
    }
}
