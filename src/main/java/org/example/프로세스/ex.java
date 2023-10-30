package org.example.프로세스;

import java.util.*;

public class ex {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{2, 1, 3, 2}, 2);
        int solution2 = sol.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
