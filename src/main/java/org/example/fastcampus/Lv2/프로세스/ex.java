package org.example.fastcampus.Lv2.프로세스;

import java.util.PriorityQueue;

public class ex {
    PriorityQueue<Integer> pq;
    public int solution(int[] priorities, int location) {
        int answer = 0;

        initQueue(priorities);

        return answer;
    }

    private void initQueue(int[] priorities) {
        pq = new PriorityQueue<>();

        for (int priority : priorities) {
            pq.add(priority);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{2, 1, 3, 2}, 2);
        int solution2 = sol.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
