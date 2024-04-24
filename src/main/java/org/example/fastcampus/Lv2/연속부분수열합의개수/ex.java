package org.example.fastcampus.Lv2.연속부분수열합의개수;

import java.util.HashSet;
import java.util.Set;

public class ex {
    Set<Integer> set = new HashSet<>();
    public int solution(int[] elements) {
        int answer = 0;

        answer = getTotalSumNums(elements);

        return answer;
    }

    private int getTotalSumNums(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = getSum(j, i, elements);

                set.add(sum);
            }
        }

        return set.size();
    }

    private int getSum(int start, int plus, int[] elements) {
        int temp = 0;

        for (int i = start; i <= start + plus; i++) {
            temp += elements[i % elements.length];
        }

        return temp;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[]{7, 9, 1, 1, 4});

        System.out.println("solution = " + solution);
    }
}
