package org.example.fastcampus.Lv1.명예의전당1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ex {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int[] solution(int k, int[] score) {
        int[] answer = {};

        answer = getLowestScore(score, k);
        return answer;
    }

    private int[] getLowestScore(int[] score, int k) {
        int[] ans = new int[score.length];
        int count = 0;

        while (count < score.length) {
            if (pq.size() < k) {
                pq.add(score[count]);
                ans[count] = pq.peek();
                count++;
                continue;
            }

            int peek = pq.peek();
            if (peek < score[count]) {
                pq.poll();
                pq.add(score[count]);
            }

            ans[count] = pq.peek();
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        int[] solution2 = sol.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
