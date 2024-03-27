package org.example.fastcampus.Lv1.과일장수;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ex {
    PriorityQueue<Integer> scores;
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        init(score);

        return answer;
    }

    private void init(int[] score) {
        scores = new PriorityQueue<>(Comparator.reverseOrder());

        for (int s : score) {
            scores.add(s);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        int solution2 = sol.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
