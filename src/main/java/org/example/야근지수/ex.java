package org.example.야근지수;

import java.util.*;

public class ex {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int work : works) {
            queue.add(work);
        }

        for (int i = 0; i < n; i++) {
            solve(queue);
        }

        for (Integer integer : queue) {
            answer += (integer * integer);

        }

        return answer;
    }

    public void solve(PriorityQueue<Integer> queue) {
        Integer peek = queue.peek();
        if (peek == 0) {
            return;
        }
        Integer poll = queue.poll();
        poll--;
        queue.add(poll);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long solution1 = sol.solution(4, new int[]{4, 3, 3});
        long solution2 = sol.solution(1, new int[]{2, 1, 2});
        long solution3 = sol.solution(3, new int[]{1, 1});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
